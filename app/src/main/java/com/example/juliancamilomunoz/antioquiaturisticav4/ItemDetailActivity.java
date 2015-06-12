package com.example.juliancamilomunoz.antioquiaturisticav4;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;


public class ItemDetailActivity extends FragmentActivity {
    ItemDetailFragment fragmentItemDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        // Fetch the item to display from bundle
        Item item = (Item) getIntent().getSerializableExtra("item");
        if (savedInstanceState == null) {
            if(!item.getTitle().equals(this.getString(R.string.ubicacion))){           //Se cumple cuando el item NO es Ubicación
                // Insert detail fragment based on the item passed
                fragmentItemDetail = ItemDetailFragment.newInstance(item); // <-------
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.flDetailContainer, fragmentItemDetail);
                ft.commit();
            }
            else{
                MapsFragment my_fragment = new MapsFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.flDetailContainer, my_fragment);
                ft.commit();
            }
        }
    }

}