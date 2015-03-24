package objectcalisthenic.domain;

public class GildedItem {
    public String name;
    public int sellIn;
    public int quality;

    public GildedItem(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void decreaseQuality() {
        quality = quality - 1;
    }

    public void increaseQuality() {
        quality = quality + 1;
    }

    public void resetQuality() {
        quality = 0;
    }

    public void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        final Class<?> classType = obj.getClass();
        final Class<GildedItem> itemClass = GildedItem.class;
        final Class<String> stringClass = String.class;
        if (classType != itemClass && classType != stringClass) {
            return false;
        }

        String convertedObject = obj.toString();
        return convertedObject.equals(name);
    }

    // REMOVE BELOW THIS COMMENT!!!
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}