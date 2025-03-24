public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked for " + movieName + " at seat " + seatNumber);
        } else {
            System.out.println("Seat " + seatNumber + " already booked.");
        }
    }

    public void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Interstellar", 12, 280);
        ticket.displayDetails();
        ticket.bookTicket();
        ticket.displayDetails();
    }
}