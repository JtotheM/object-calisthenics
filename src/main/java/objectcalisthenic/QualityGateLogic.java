package objectcalisthenic;

import objectcalisthenic.domain.GildedItem;

public class QualityGateLogic {

    public static void decreaseQuality(GildedItem gildedItem) {
        gildedItem.decreaseQuality();
    }

    public static void qualityCorrection(GildedItem gildedItem, String certainName) {
        if (gildedItem.equals(certainName)) {
            increaseQuality(gildedItem, 11, 50);
            increaseQuality(gildedItem, 6, 50);
        }
    }

    public static void decreaseSellIn(GildedItem gildedItem) {
        gildedItem.decreaseSellIn();
    }

    public static void decreaseQuality(GildedItem gildedItem, int maxQuality) {
        if (gildedItem.quality < maxQuality) {
            increaseQuality(gildedItem);
        }
    }

    public static void resetQuality(GildedItem gildedItem) {
        gildedItem.resetQuality();
    }

    public static void increaseQuality(GildedItem gildedItem, int maxSellIn, int maxQuality) {
        final boolean sellInLowerThanMax = gildedItem.sellIn < maxSellIn;
        final boolean qualityLowerThanMax = gildedItem.quality < maxQuality;

        if (sellInLowerThanMax && qualityLowerThanMax) {
            increaseQuality(gildedItem);
        }
    }

    public static void increaseQuality(GildedItem gildedItem) {
        gildedItem.increaseQuality();
    }
}
