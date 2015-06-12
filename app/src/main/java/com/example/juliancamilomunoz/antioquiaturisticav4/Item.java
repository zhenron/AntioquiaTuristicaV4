package com.example.juliancamilomunoz.antioquiaturisticav4;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Xingke on 09/06/2015.
 */
public class Item implements Serializable {
    private static final long serialVersionUID = -1213949467658913456L;
    private String title;
    private String body;

    public Item(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return getTitle();
    }

/*    public static ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Hoteles y Restaurantes", "Aca van los fucking hoteles"));        //Se debería hacer desde los recursos
        items.add(new Item("Bares", "Aca van los fucking bares"));
        items.add(new Item("Sitios Turisticos", "Aca van los fucking sitios turísticos"));
        items.add(new Item("Demografía", "Aca van la fucking demgrafía"));
        items.add(new Item("About", "Aca van el fuckong about"));
        return items;
    }*/
}
