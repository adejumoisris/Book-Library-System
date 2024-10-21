package org.example.model;

public class Book {
    private String title;
    private int copiesOfBooks;

    public Book() {
    }

    public Book(String title, int copiesOfBooks) {
        this.title = title;
        this.copiesOfBooks = copiesOfBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopiesOfBooks() {
        return copiesOfBooks;
    }

    public void setCopiesOfBooks(int copiesOfBooks) {
        this.copiesOfBooks = copiesOfBooks;
    }

    // function for if a book is available

    public boolean isAvailable(){
        return copiesOfBooks >0;
    }

    // function for book borrowing

    public void  borrowBook(){
        if (copiesOfBooks > 0){
            copiesOfBooks--;
        }else {
            System.out.println("This book as been Taken");
        }
    }

    public void returnBook(){
        copiesOfBooks++;
    }
}
