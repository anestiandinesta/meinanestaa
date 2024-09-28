public class TicketPurchase {
    private DatabaseConcert databaseConcert;

    public TicketPurchase(DatabaseConcert databaseConcert) {
        this.databaseConcert = databaseConcert;
    }

    public double buyTickets(Concert concert, int numberOfTickets) {
        return databaseConcert.buyTickets(concert, numberOfTickets);
    }
}
