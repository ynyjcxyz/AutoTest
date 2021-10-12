package com.example.android.autotest;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Book {
    public abstract String name();
    public abstract int price();
    public abstract String author();

    public static Book create(String name, int price, String author) {
        return new AutoValue_Book(name, price, author);
    }
}

//    public Book(String name, int price, String author) {
//        this.name = name;
//        this.price = price;
//        this.author = author;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{"
//                + "name=" + name
//                + ", price=" + price
//                + ", author=" + author
//                + "}";
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }