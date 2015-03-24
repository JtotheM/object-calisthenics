package org.joyofcoding.objectcalisthenics;

/**
 * Created by User on 3/24/2015.
 */
public class Main {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems().qualityItems());
    }
}
