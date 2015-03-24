package org.joyofcoding.objectcalisthenics;

/**
 * Created by Eigenaar on 24-3-2015.
 */
public class QualityGate {
    private Item aList;
    private ListName name;

    public QualityGate(Item aList, ListName name) {
        this.aList = aList;
        this.name = name;
    }

    public void invoke() {
        QualityGatewayLogic qualityGatewayLogic = new QualityGatewayLogic();

        if (!name.equals("Aged Brie") && !name.equals("Backstage passes to a TAFKAL80ETC concert") && aList.getQuality() > 0 && !name.equals("Sulfuras, Hand of Ragnaros"))
            qualityGatewayLogic.decreaseQuality(aList);

        if ((name.equals("Aged Brie") || name.equals("Backstage passes to a TAFKAL80ETC concert")) && aList.getQuality() < 50) {
            qualityGatewayLogic.increaseQuality(this.aList);
            qualityGatewayLogic.qualityCorrection(aList, name.listName(), "Backstage passes to a TAFKAL80ETC concert");
        }

        if (!name.equals("Sulfuras, Hand of Ragnaros")) qualityGatewayLogic.decreaseSellIn(aList);

        if (aList.getSellIn() >= 0) return;

        if (name.equals("Aged Brie")) {
            qualityGatewayLogic.decreaseQuality(aList, 50);
            return;
        }

        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            qualityGatewayLogic.resetQuality(aList);
            return;
        }

        if (aList.getQuality() > 0 && !name.equals("Sulfuras, Hand of Ragnaros")) qualityGatewayLogic.decreaseQuality(aList);
    }


}