package objectcalisthenic.service;

import objectcalisthenic.dao.GildedItemsDAO;
import objectcalisthenic.dao.GildedItemsDAOCollectionImpl;
import objectcalisthenic.domain.GildedItem;

public class GildedService {
    private GildedItemsDAO gildedItemsDAO = new GildedItemsDAOCollectionImpl();

    public void updateQuality() {
        gildedItemsDAO.updateQuality();
    }

    public void add(GildedItem gildedItem) {
        gildedItemsDAO.add(gildedItem);
    }

    public void clear() {
        gildedItemsDAO.clear();
    }

    public Iterable<GildedItem> findAll() {
        return gildedItemsDAO.findAll();
    }
}