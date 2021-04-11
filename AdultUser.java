package com.bro.clas1;

public class AdultUser implements LibraryUser {

    public int age;

    public String bookType;

    @Override

    public void registerAccount() {
        if (age > 12) System.out.println("You have successfully registered under a Kids Account");
        else if (age < 12) System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        else System.out.println("Wrong input");
    }

    @Override

    public void requestBook() {
        if (bookType.equalsIgnoreCase("Fiction"))
            System.out.println("Book Issued successfully, please return the book within 7 days");
        else System.out.println("Oops, you are allowed to take only adult books");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
