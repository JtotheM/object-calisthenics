package objectcalisthenic.dao;

import objectcalisthenic.QualityGate;
import objectcalisthenic.domain.GildedItem;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private List<GildedItem> gildedItemList = new ArrayList<GildedItem>();

    public GildedRose() {
        gildedItemList.add(new GildedItem("+5 Dexterity Vest", 10, 20));
        gildedItemList.add(new GildedItem("Aged Brie", 2, 0));
        gildedItemList.add(new GildedItem("Elixir of the Mongoose", 5, 7));
        gildedItemList.add(new GildedItem("Sulfuras, Hand of Ragnaros", 0, 80));
        gildedItemList.add(new GildedItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        gildedItemList.add(new GildedItem("Conjured Mana Cake", 3, 6));
    }

    public void updateQuality() {
        for (GildedItem gildedItem : gildedItemList) {
            updateItemQuality(gildedItem);
        }
    }

    private void updateItemQuality(GildedItem gildedItem) {
        new QualityGate(gildedItem).invoke();
    }

    public void add(GildedItem gildedItem) {
        gildedItemList.add(gildedItem);
    }

    public void clear() {
        gildedItemList.clear();
    }

    public Iterable<GildedItem> findAll() {
        return gildedItemList;
    }
}