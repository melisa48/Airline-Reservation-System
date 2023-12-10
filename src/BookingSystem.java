import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class BookingSystem {
    private List<Flight> flights;
    private List<User> users;
    private List<String> bookedSeats;

    public BookingSystem() {
        this.flights = new ArrayList<>();
        this.users = new ArrayList<>();
        this.bookedSeats = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public boolean bookSeat(User user, Flight flight, String seat) {
        if (flight.getAvailableSeats() > 0 && !bookedSeats.contains(seat)) {
            bookedSeats.add(seat);
            // Update the available seats in the flight
            Flight updatedFlight = flight.bookSeats(1);
            flights.set(flights.indexOf(flight), updatedFlight);
            return true;
        }
        return false;
    }

    // Method to search flights by destination
    public List<Flight> searchFlightsByDestination(String destination) {
        return flights.stream()
                .filter(flight -> flight.getDestination().equalsIgnoreCase(destination))
                .collect(Collectors.toList());
    }

    // Method to search flights by flight number
    public Flight searchFlightByNumber(String flightNumber) {
        return flights.stream()
                .filter(flight -> flight.getFlightNumber().equals(flightNumber))
                .findFirst()
                .orElse(null);
    }

    // Additional methods can be added for searching by departure time, etc.
}

