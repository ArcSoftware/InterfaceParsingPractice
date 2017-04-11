package com.ArcSoftware;

public class Main {

    public static void main(String[] args) throws Exception {
        Repository data = new Repository(); //creates new repository from CSV.

        data.sortByLastName(); //will call a method to sort list by last name.

        data.print(); //Prints to console full list.
    }
}