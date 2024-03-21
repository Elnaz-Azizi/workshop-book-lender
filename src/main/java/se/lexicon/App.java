package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {


        // Create a book instance
        Book book1 = new Book("Book Title 1", "Test Author");
        // Display book information
        System.out.println(book1.getBookInformation());

        // Create a person instance
        Person person = new Person("Nickan", "Azizi");
        // Display person information
        System.out.println(person.getPersonInformation());

        // Loan a book to the person
        person.loanBook(book1);

        // Display person information after borrowing a book
        System.out.println(person.getPersonInformation());
        // Display book information after borrowing a book
        System.out.println(book1.getBookInformation());

        // Return the borrowed book

        // Display person information after returning the book
        // Display book information after borrowing a book

    }

}
