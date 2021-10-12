package com.example.android.autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    private String name = "new name";
//    private int price = 29;
//    private String author = "John";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Book book = Book.create("安森瓦舍", 87, "Anson");

        TextView textview1 = (TextView) findViewById(R.id.m1);
        TextView textview2 = (TextView) findViewById(R.id.m2);
        TextView textview3 = (TextView) findViewById(R.id.m3);

        textview1.setText(book.name());
        textview2.setText(String.valueOf(book.price()));
        textview3.setText(book.author());
    }

}