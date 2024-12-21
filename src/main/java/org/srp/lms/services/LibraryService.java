package org.srp.lms.services;

import java.util.HashMap;
import java.util.Map;

import org.srp.lms.model.Book;

public class LibraryService {

    private Map<String, Book> inventory;

    public LibraryService() {
        this.inventory = new HashMap<>();
    }

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        inventory.remove(isbn);
    }

    public Book searchByIsbn(String isbn) {
        return inventory.get(isbn);
    }

    public void listBooks() {
        inventory.values().forEach(System.out::println);
    }
    
}
