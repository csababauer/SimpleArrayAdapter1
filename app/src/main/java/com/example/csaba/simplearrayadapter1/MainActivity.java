package com.example.csaba.simplearrayadapter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**create an arraylist*/
        ArrayList<Integer> numbers = new ArrayList<>();

        /**add elements in the arraylist */
        for (int i=0; i<1000; i++ ){
            numbers.add(i);
        }

        /**create an ArrayAdapter which contains a arraylist of numbers (integers)  simple_lis_item_1 is a built in layout in Android*/
        ArrayAdapter<Integer> itemsAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numbers);
        /**create a Listview object*/
        ListView listView = (ListView) findViewById(R.id.list);
        /** call the setAdapter method on the listview object and add an argument "itemsAdapter"*/
        listView.setAdapter(itemsAdapter);


        /**
         * Arrayadapter with String:
         *
        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");
        words.add("fourteen");
        words.add("fifteen");
        words.add("sixteen");
        words.add("seventeen");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
         */
    }
}
