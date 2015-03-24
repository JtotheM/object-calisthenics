package objectcalisthenic;

import objectcalisthenic.service.GildedService;

public class Main {
    private static GildedService gildedService = new GildedService();

    public static void main(String[] args) {
        gildedService.updateQuality();
    }
}