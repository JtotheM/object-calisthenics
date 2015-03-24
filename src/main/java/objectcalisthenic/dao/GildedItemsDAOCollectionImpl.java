package objectcalisthenic.dao;

import objectcalisthenic.domain.GildedItem;

public class GildedItemsDAOCollectionImpl implements GildedItemsDAO {
    private GildedRose gildedRose = new GildedRose();

    @Override
    public void updateQuality() {
        gildedRose.updateQuality();
    }

    @Override
    public void add(GildedItem gildedItem) {
        gildedRose.add(gildedItem);
    }

    @Override
    public void clear() {
        gildedRose.clear();
    }

    @Override
    public Iterable<GildedItem> findAll() {
        return gildedRose.findAll();
    }
}
