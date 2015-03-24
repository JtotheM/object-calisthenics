package objectcalisthenic;

import objectcalisthenic.domain.GildedItem;

public class QualityGate {
    private GildedItem gildedItem;

    public QualityGate(GildedItem gildedItem) {
        this.gildedItem = gildedItem;
    }

    public void invoke() {
        if (!gildedItem.equals("Aged Brie") && !gildedItem.equals("Backstage passes to a TAFKAL80ETC concert") && gildedItem.quality > 0 && !gildedItem.equals("Sulfuras, Hand of Ragnaros")) {
            QualityGateLogic.decreaseQuality(gildedItem);
        }

        if ((gildedItem.equals("Aged Brie") || gildedItem.equals("Backstage passes to a TAFKAL80ETC concert")) && gildedItem.quality < 50) {
            QualityGateLogic.increaseQuality(gildedItem);
            QualityGateLogic.qualityCorrection(gildedItem, "Backstage passes to a TAFKAL80ETC concert");
        }

        if (!gildedItem.equals("Sulfuras, Hand of Ragnaros")) {
            QualityGateLogic.decreaseSellIn(gildedItem);
        }

        if (gildedItem.sellIn >= 0) {
            return;
        }

        if (gildedItem.equals("Aged Brie")) {
            QualityGateLogic.decreaseQuality(gildedItem, 50);
            return;
        }

        if (gildedItem.equals("Backstage passes to a TAFKAL80ETC concert")) {
            QualityGateLogic.resetQuality(gildedItem);
            return;
        }

        if (gildedItem.quality > 0 && !gildedItem.equals("Sulfuras, Hand of Ragnaros")) {
            QualityGateLogic.decreaseQuality(gildedItem);
        }
    }
}