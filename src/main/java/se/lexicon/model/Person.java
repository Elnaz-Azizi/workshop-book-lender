package se.lexicon.model;

import java.util.Arrays;

public class Person {
    //Fields:

    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    private Book[] borrowedBooks = new Book[0];

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        //this.firstName = firstName;
        //this.lastName = lastName;
        setFirstName(firstName);
        setLastName(lastName);
    }

    private static int getNextId() {
        return ++sequencer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void loanBook(Book book) {

        if (book.isAvailable()) {
            book.setBorrower(this);

            Book[] newArrayOfBorrowedBooks = Arrays.copyOf(this.borrowedBooks, borrowedBooks.length + 1);
            newArrayOfBorrowedBooks[newArrayOfBorrowedBooks.length - 1] = book;
            borrowedBooks = newArrayOfBorrowedBooks;
        } else {
            throw new IllegalArgumentException("book is not available.");
        }

    }
    public void returnBook(Book book) {

    }

    public String getPersonInformation() {
        return " ID: " + id + ", Name: " + firstName + " " + lastName + "NumberOfBorrowedBooks: " + borrowedBooks.length ;
    }


}