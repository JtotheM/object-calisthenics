package org.joyofcoding.objectcalisthenics;

import java.util.List;

public class GildedRose {

    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems().qualityItems());
    }

    public GildedItems makeItems() {
        GildedItems items = new GildedItems();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void updateQuality(List<Item> list) {
        for (Item aList : list) updateQuality(aList);
    }

    private void updateQuality(Item aList) {
        ListName name = new ListName(aList.getName());

        new QualityGate(aList, name).invoke();
    }
}