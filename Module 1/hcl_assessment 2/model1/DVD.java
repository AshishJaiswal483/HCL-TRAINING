
package model;

public class DVD extends LibraryItem {

    private int duration;

    public DVD(int id, String title, int duration) {
        super(id, title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 5.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Late fee per day: Rs. 5");
    }
}