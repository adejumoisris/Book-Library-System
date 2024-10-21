package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
//        create books
        Book book1 = new Book("Java Programming ", 1);
        Book book2 = new Book("C# programming ", 1);

//        create users
        Teacher teacher = new Teacher(" Mr Owolabi");
        SeniorStudent seniorStudent = new SeniorStudent("kayode");
        JuniorStudent juniorStudent = new JuniorStudent("nafisah");

        // Create library for Implementation 1

        Library priorityLibrary = new Library();
        priorityLibrary.addRequest(new BorrowingRequest(teacher,book1));
        priorityLibrary.addRequest(new BorrowingRequest(seniorStudent, book1));
        priorityLibrary.addRequest(new BorrowingRequest(juniorStudent , book1));
        System.out.println("processing with priority");
        priorityLibrary.processRequest();

       //  Create library for Implementation 2 (First-Come, First-Serve)
////
//        LibraryFCFS fcfsLibrary = new LibraryFCFS();
//        fcfsLibrary.addRequest(new BorrowingRequest(seniorStudent, book2));
//        fcfsLibrary.addRequest(new BorrowingRequest(juniorStudent, book2));
//        fcfsLibrary.addRequest(new BorrowingRequest(teacher, book2));
//
//        System.out.println("\nProcessing requests with first-come, first-serve:");
//        fcfsLibrary.processRequests();



    }
}