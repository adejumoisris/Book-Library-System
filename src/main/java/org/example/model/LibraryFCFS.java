package org.example.model;

import java.util.LinkedList;
import java.util.Queue;

//Now, we modify the processRequests method for the first-come, first-serve logic.
public class LibraryFCFS {

    private Queue<BorrowingRequest> requests;

    public LibraryFCFS() {
        requests = new LinkedList<>();
    }

    public void addRequest(BorrowingRequest request) {
        requests.add(request);
    }

    public void processRequests() {
        while (!requests.isEmpty()) {
            BorrowingRequest request = requests.poll(); // Remove the first in the queue
            Book book = request.getBook();

            if (book.isAvailable()) {
                System.out.println(request.getUser().getName() + " borrowed " + book.getTitle());
                book.borrowBook();
            } else {
                System.out.println("Book taken for " + request.getUser().getName());
            }
        }
    }

}
