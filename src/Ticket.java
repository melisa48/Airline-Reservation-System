public class Ticket {
    private final User user;
    private final Flight flight;
    private final String seat;

    public Ticket(User user, Flight flight, String seat) {
        this.user = user;
        this.flight = flight;
        this.seat = seat;
    }

    // Getter methods

    public User getUser() {
        return user;
    }

    public Flight getFlight() {
        return flight;
    }

    public String getSeat() {
        return seat;
    }

    // Optional: toString method for a readable representation

    @Override
    public String toString() {
        return "Ticket{" +
                "user=" + user +
                ", flight=" + flight +
                ", seat='" + seat + '\'' +
                '}';
    }
}



