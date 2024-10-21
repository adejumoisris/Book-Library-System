package org.example.model;

import java.util.LinkedList;
import java.util.Queue;

/**
 * We'll create the Library class with the logic for prioritizing teachers over students,
 * and senior students over junior students.*/

public class Library {

private Queue<BorrowingRequest> requests;

  public  Library(){
      requests = new LinkedList<>();
  }

  public void  addRequest(BorrowingRequest request){
      requests.add(request);
  }

    // This method prioritizes requests: Teachers > Senior Students > Junior Students
    private BorrowingRequest getHighestPriorityRequest() {
        BorrowingRequest teacherRequest = null;
        BorrowingRequest seniorRequest = null;

        for (BorrowingRequest request : requests) {
            if (request.getUser().getRole() == Role.TEACHER) {
                teacherRequest = request;
                break;
            } else if (request.getUser().getRole() == Role.SENIOR_STUDENT) {
                seniorRequest = request;
            }
        }

        if (teacherRequest != null) {
            return teacherRequest;
        }
        if (seniorRequest != null) {
            return seniorRequest;
        }

        // If no teacher or senior student, return the first request (likely junior student)
        return requests.peek();
    }

  public void processRequest(){
      while (!requests.isEmpty()){
          BorrowingRequest highestPriorityRequest = getHighestPriorityRequest();
          Book book = highestPriorityRequest.getBook();

          if (book.isAvailable()) {
              System.out.println(highestPriorityRequest.getUser().getName() + " borrowed " + book.getTitle());
              book.borrowBook();
          } else {
              System.out.println("Book taken for " + highestPriorityRequest.getUser().getName());
          }
          requests.remove(highestPriorityRequest);

      }
  }


}
