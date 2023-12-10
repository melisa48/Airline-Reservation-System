import java.util.ArrayList;
import java.util.List;

public class BookSeat {
    private List<Flight> flights;
    private List<User> users;
    private List<Ticket> bookedSeats;

    public BookSeat() {
        this.flights = new ArrayList<>();
        this.users = new ArrayList<>();
        this.bookedSeats = new ArrayList<>();
    }

    // Other existing methods

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Ticket> getBookingsForFlight(Flight flight) {
        // Implement logic to retrieve and return the list of bookings for the given flight
        // For example:
        return bookedSeats.stream()
                .filter(ticket -> ticket.getFlight().equals(flight))
                .toList();
    }

    public boolean cancelBooking(Ticket ticket) {
        // Implement logic to cancel the booking associated with the provided ticket
        // For example:
        if (bookedSeats.remove(ticket)) {
            // Update available seats for the canceled booking
            Flight flight = ticket.getFlight();
            Flight updatedFlight = flight.bookSeats(-1); // Increase available seats by 1
            flights.set(flights.indexOf(flight), updatedFlight);
            return true;
        }
        return false;
    }
}



