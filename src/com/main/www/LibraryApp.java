package com.main.www;

import java.util.Scanner;

import com.dao.www.BookIssue;
import com.dao.www.Books;
import com.dao.www.ReturnBook;
import com.dao.www.Student;

public class LibraryApp {
public static void main(String[] args) {
	Student str=new Student();
	ReturnBook rb = new ReturnBook(); 
	Books b = new Books();
    BookIssue bi = new BookIssue();
    Scanner sc = new Scanner(System.in);
    while(true) {
    	System.out.println("\n====== Library Books Management System ======");
        System.out.println("1. Register Student");
        System.out.println("2. Add Book");
        System.out.println("3. View Books");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Exit");
        System.out.println("Please Enter Your Choice:");
        int n = sc.nextInt();
        switch(n) {
        case 1:System.out.println("Student ID:");
              int id = sc.nextInt();
              sc.nextLine();
              System.out.println("Student Name:");
              String name = sc.nextLine();
              str.registerStudent(id,name);
              break;
        case 2 :
        	    System.out.println("Book ID:");
        	    int bid = sc.nextInt();
        	    sc.nextLine();
        	    System.out.println("Book Name:");
        	    String bname= sc.nextLine();
        	    System.out.println("Book genere:");
        	    String bgenere= sc.nextLine();
        	    b.insertBook(bid,bname,bgenere);
        	    break;
        case 3:
        	  b.retrieveBooks();
        	  break;
        case 4:
        	 System.out.println("Issue ID:");
     	    int iid = sc.nextInt();
     	    sc.nextLine();
     	    System.out.println("Student ID:");
     	    int sid= sc.nextInt();
     	    sc.nextLine();
     	    System.out.println("Book ID:");
     	    int biid= sc.nextInt();
     	    bi.issueBook(iid,sid,biid);
     	    break;
        case 5:
        	 System.out.println("Return ID:");
     	    int rid = sc.nextInt();
     	    System.out.println("Issue ID:");
     	    int isid= sc.nextInt();
     	    rb.returnBook(rid,isid);
     	    break;
        case 6:
        	System.out.println("Thank you! vist again.");
        	System.exit(0);
        	break;
        }
    }
    
	
}
}
