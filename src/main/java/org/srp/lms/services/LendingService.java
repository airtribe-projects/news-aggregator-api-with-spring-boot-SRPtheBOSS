package org.srp.lms.services;

import java.util.HashMap;
import java.util.Map;

import org.srp.lms.model.Book;
import org.srp.lms.model.Patron;

public class LendingService {

    private Map<Book, Patron> lendingRecords;

    public LendingService() {
        this.lendingRecords = new HashMap<>();
    }

    public void lendBook(Book book, Patron patron) {
        lendingRecords.put(book, patron);
        patron.borrowBook(book);
    }

    public void returnBook(Book book, Patron patron) {
        lendingRecords.remove(book);
        patron.returnBook(book);
    }
    
}
