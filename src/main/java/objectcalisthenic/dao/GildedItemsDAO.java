package objectcalisthenic.dao;

import objectcalisthenic.domain.GildedItem;

public interface GildedItemsDAO {
    public void updateQuality();

    public void add(GildedItem gildedItem);

    public void clear();

    Iterable<GildedItem> findAll();
}
