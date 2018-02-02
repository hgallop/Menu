package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView menuItem1;
    private TextView menuItem2;
    private TextView menuItem3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuItem1 = findViewById(R.id.menu_item_1);
        menuItem2 = findViewById(R.id.menu_item_2);
        menuItem3 = findViewById(R.id.menu_item_3);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        String menuItem_1 = menuItem1.getText().toString();
        Log.v("MainActivity", menuItem_1);
        // Find second menu item TextView and print the text to the logs
        String menuItem_2 = menuItem2.getText().toString();
        Log.v("MainActivity", menuItem_2);
        // Find third menu item TextView and print the text to the logs
        String menuItem_3 = menuItem3.getText().toString();
        Log.v("MainActivity", menuItem_3);
    }
}