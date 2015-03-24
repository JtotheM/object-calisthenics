package org.joyofcoding.objectcalisthenics;

public class QualityGatewayLogicImpl implements QualityGatewayLogic {
    @Override
    public void decreaseQuality(Item aList) {
        aList.setQuality(aList.getQuality() - 1);
    }

    @Override
    public void qualityCorrection(Item aList, String name, String certainName) {
        if (name.equals(certainName)) {
            increaseQuality(aList, 11, 50);
            increaseQuality(aList, 6, 50);
        }
    }

    @Override
    public void decreaseSellIn(Item aList) {
        aList.setSellIn(aList.getSellIn() - 1);
    }

    @Override
    public void decreaseQuality(Item aList, int maxQuality) {
        if (aList.getQuality() < maxQuality) increaseQuality(aList);
    }

    @Override
    public void resetQuality(Item aList) {
        aList.setQuality(0);
    }

    @Override
    public void increaseQuality(Item aList, int maxSellIn, int maxQuality) {
        if (aList.getSellIn() < maxSellIn && aList.getQuality() < maxQuality) increaseQuality(aList);
    }

    @Override
    public void increaseQuality(Item aList) {
        aList.setQuality(aList.getQuality() + 1);
    }
}
