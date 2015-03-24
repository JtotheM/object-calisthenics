package org.joyofcoding.objectcalisthenics;

/**
 * Created by Eigenaar on 24-3-2015.
 */
public  class QualityGatewayLogic {

    public void decreaseQuality(Item aList) {
        aList.setQuality(aList.getQuality() - 1);
    }

    public void qualityCorrection(Item aList, String name, String certainName) {
        if (name.equals(certainName)) {
            increaseQuality(aList, 11, 50);
            increaseQuality(aList, 6, 50);
        }
    }

    public void decreaseSellIn(Item aList) {
        aList.setSellIn(aList.getSellIn() - 1);
    }

    public void decreaseQuality(Item aList, int maxQuality) {
        if (aList.getQuality() < maxQuality) increaseQuality(aList);
    }

    public  void resetQuality(Item aList) {
        aList.setQuality(0);
    }

    public void increaseQuality(Item aList, int maxSellIn, int maxQuality) {
        if (aList.getSellIn() < maxSellIn && aList.getQuality() < maxQuality) increaseQuality(aList);
    }

    public void increaseQuality(Item aList) {
        aList.setQuality(aList.getQuality() + 1);
    }
}
