import java.util.List;

public class Concert {
    private String concertName;
    private String date;
    private String city;
    private List<String> lineupArtists;
    private double ticketPrice;


    public Concert(String concertName, String date, String city, List<String> lineupArtists, double ticketPrice) {
        this.concertName = concertName;
        this.date = date;
        this.city = city;
        this.lineupArtists = lineupArtists;
        this.ticketPrice = ticketPrice;
    }

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName (String concertName) {
        this.concertName = concertName;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }


    public List<String> getLineupArtists() {
        return lineupArtists;
    }

    public void setLineupArtists(List<String> lineupArtists) {
        this.lineupArtists = lineupArtists;
    }


    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    @Override
    public String toString() {
        return concertName + ", Date - " + date + ", Location - " + city + ", Ticket Price - " + ticketPrice;
    }
}