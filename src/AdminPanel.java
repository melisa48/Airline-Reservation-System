import java.util.List;

public class AdminPanel {
    private BookSeat bookingSystem;

    public AdminPanel(BookSeat bookingSystem) {
        this.bookingSystem = bookingSystem;
    }

    // Method to add a new flight to the booking system
    public void addFlight(Flight flight) {
        bookingSystem.addFlight(flight);
    }

    // Method to view all flights in the booking system
    public List<Flight> viewAllFlights() {
        return bookingSystem.getFlights();
    }

    // Method to view bookings for a specific flight
    public List<Ticket> viewBookingsForFlight(Flight flight) {
        // Implement logic to retrieve and return the list of bookings for the given flight
        // You might need to modify the BookSeat class to provide this functionality
        // For example, you could add a method like getBookingsForFlight(Flight flight) in BookSeat
        // that returns a list of tickets for the specified flight.
        // Then, you would call that method here.
        return bookingSystem.getBookingsForFlight(flight);
    }

    // Method to cancel a booking
    public boolean cancelBooking(Ticket ticket) {
        // Implement logic to cancel the booking associated with the provided ticket
        // You might need to modify the BookSeat class to provide this functionality
        // For example, you could add a method like cancelBooking(Ticket ticket) in BookSeat
        // that cancels the booking associated with the specified ticket.
        // Then, you would call that method here.
        return bookingSystem.cancelBooking(ticket);
    }

    // Other methods for managing flights and bookings can be added based on your requirements
}


