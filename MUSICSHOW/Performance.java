public abstract class Performance {
    private String artist;
    private String venue;
    private double ticketPrice;

    public Performance(String artist, String venue, double ticketPrice) {
        this.artist = artist;
        this.venue = venue;
        this.ticketPrice = ticketPrice;
    }

    public abstract void perform();

    public String getArtist() {
        return artist;
    }

    public String getVenue() {
        return venue;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}