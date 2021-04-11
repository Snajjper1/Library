package com.bro.clas1;

public class KidUser implements LibraryUser {

    private int age;

    private String bookType;

    @Override

    public void registerAccount() {
        if (age < 12) System.out.println("You have successfully registered under a Kids Account");
        else if (age > 12) System.out.println("Sorry, Age must be less than 12 to register as a kid");
        else System.out.println("Wrong input");
    }

    @Override

    public void requestBook() {
        if (bookType.equalsIgnoreCase("Kids"))
            System.out.println("Book Issued successfully, please return the book within 10 days");
        else System.out.println("Oops, you are allowed to take only kids books");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
