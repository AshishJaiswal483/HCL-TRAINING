
package model;

public class Book extends LibraryItem {

    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Late fee per day: Rs. 2");
    }
}