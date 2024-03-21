package se.lexicon.model;

import java.util.UUID;

public class Book {

    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        //this(title, author, null);
        setTitle(title);
        setAuthor(author);
        this.id = UUID.randomUUID().toString();
        setBorrower(null);
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        setBorrower(borrower);
        //this.id = UUID.randomUUID().toString();
        //setTitle(title);
        //setAuthor(author);

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /*public void setAvailable(boolean available) {
        this.available = available;
    }
     */

    public void setBorrower(Person borrower) {


        if (borrower == null) {
            this.available = true;
        } else {
            this.borrower = borrower;
            this.available = false;
        }




    }

    public String getBookInformation() {

        String bookInfo = "ID: " + id + "Title: " + title + " Author: " + author;
        if (borrower == null) {
            bookInfo = bookInfo + ", not borrowed";
        } else {
            bookInfo = bookInfo + " Borrower" + borrower.getPersonInformation();
        }

        return bookInfo;
    }


}