package com.bro.clas1;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUser kidUser = new KidUser();
        AdultUser adultUser = new AdultUser();

        kidUser.setAge(18);
        kidUser.registerAccount();

        kidUser.setBookType("Kids");
        kidUser.requestBook();

        adultUser.setAge(5);
        adultUser.registerAccount();

        adultUser.setBookType("Fiction");
        adultUser.requestBook();
    }
}
