package org.joyofcoding.objectcalisthenics;

/**
 * Created by Eigenaar on 24-3-2015.
 */
public class ListName {
    String listName;

    public ListName(String listName) {
        this.listName = listName;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String listName() {
        return listName;
    }

    @Override
    public boolean equals(Object obj) {
        return listName.equals(obj);
    }
}
