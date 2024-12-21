package org.srp.lms.model;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    
    private String id;
    private String name;
    private List<Book> borrowedBooks;

    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public void setName(String name) { this.name = name; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return String.format("Patron[ID: %s, Name: %s, Borrowed Books: %s]", id, name, borrowedBooks);
    }
}
