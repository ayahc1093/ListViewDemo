package com.example.mcberliner.listviewdemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

    private String[] countries = {"Albania", "Algeria", "Armenia", "Andora", "Angola", "Argentina", "Austrailia", "Bahrain", "Bangladesh", "Barbados", "Brazil", "China",
                                    "Denmark", "Egypt", "France", "Ghana", "Hong Kong", "India", "Italy", "United Kingdom", "United States", "United Arab Emirates"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView I, View v, int position, long id) {
        Toast.makeText(this, "Item clicked: " + countries[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
