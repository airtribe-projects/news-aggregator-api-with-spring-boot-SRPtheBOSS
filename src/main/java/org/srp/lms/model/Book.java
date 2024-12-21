package org.srp.lms.model;

public class Book {
    private String bookId;
    private String author;
    private String isbn;
    private long publicationYear;
    
    public Book(String bookId, String author, String isbn, long publicationYear) {
        this.bookId = bookId;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public long getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(long publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("bookId=").append(bookId);
        sb.append(", author=").append(author);
        sb.append(", isbn=").append(isbn);
        sb.append(", publicationYear=").append(publicationYear);
        sb.append('}');
        return sb.toString();
    }
    
}
