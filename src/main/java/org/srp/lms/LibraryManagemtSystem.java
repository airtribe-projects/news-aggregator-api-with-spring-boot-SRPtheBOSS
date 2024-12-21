/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.srp.lms;

import org.srp.lms.model.Book;
import org.srp.lms.model.Patron;
import org.srp.lms.services.LendingService;
import org.srp.lms.services.LibraryService;

/**
 *
 * @author iamsa
 */
public class LibraryManagemtSystem {

    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        LendingService lendingService = new LendingService();

        Book book1 = new Book("001", "Saurabh Patil", "123", 2024);
        Book book2 = new Book("002", "Saurabh Patil", "124", 2024);

        Patron patron = new Patron("1", "Shambhu");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in library:");
        library.listBooks();

        System.out.println("\nLending book:");
        lendingService.lendBook(book1, patron);
        System.out.println("Patron info: " + patron);

        System.out.println("\nReturning book:");
        lendingService.returnBook(book1, patron);
        System.out.println("Patron info: " + patron);
    }
}
