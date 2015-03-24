package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eigenaar on 24-3-2015.
 */
public class GildedItems {

    private List<Item> items;

    public GildedItems() {
        items = new ArrayList<Item>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> qualityItems() {
        return items;
    }
}
