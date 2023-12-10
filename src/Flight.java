public final class Flight {
    private final String flightNumber;
    private final String departureTime;
    private final String arrivalTime;
    private final String destination;
    private final int availableSeats;

    // Constructor with validation
    public Flight(String flightNumber, String departureTime, String arrivalTime, String destination, int availableSeats) {
        if (availableSeats < 0) {
            throw new IllegalArgumentException("Available seats cannot be negative");
        }

        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    // Getter methods (no setters)

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    // Example of a method to create a new Flight object with updated availableSeats
    public Flight bookSeats(int seatsToBook) {
        if (seatsToBook < 0) {
            throw new IllegalArgumentException("Number of seats to book cannot be negative");
        }

        if (seatsToBook > this.availableSeats) {
            throw new IllegalArgumentException("Not enough available seats to book");
        }

        return new Flight(this.flightNumber, this.departureTime, this.arrivalTime, this.destination, this.availableSeats - seatsToBook);
    }
}


