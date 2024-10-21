package org.example.model;

public class BorrowingRequest {
    private User user;
    private Book book;

    public BorrowingRequest(User user, Book book) {
        this.user = user;
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }
}
