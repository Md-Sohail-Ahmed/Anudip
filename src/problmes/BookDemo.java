package problmes;

import java.util.ArrayList;

class Book{
    int bookID;
    String bookName;
    String authorName;

    public Book(int bookID, String bookName, String authorName) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1=new Book(001,"java","mayur");
        Book b2=new Book(002,"C++","Sohail");

        ArrayList<Book> l=new ArrayList<>();
        l.add(b1);
        l.add(b2);

        System.out.println("all books:");
        for(Book b:l){
            System.out.println("Book:-"+b.bookID+" "+b.bookName+" "+b.authorName);
        }
    }
}
