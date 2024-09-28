import java.util.ArrayList;
import java.util.List;

public class DatabaseConcert {
    private List<Concert> concertList;

      public DatabaseConcert() {
        concertList = new ArrayList<>();
    }

    
    public void insertConcert(Concert concert) {
        if (concert != null) {
            concertList.add(concert);
        } else {
   
        }
    }

  
    public void showConcert() {
        if (concertList.isEmpty()) {
            System.out.println("Concert not available");
        } else {
            System.out.println("Concerts currently available:");
            for (Concert concert : concertList) {
                System.out.println(concert);
            }
        }
    }
    

    public static List<Concert> findConcertsByCity(List<Concert> concertList, String city) {
        List<Concert> concertsInCity = new ArrayList<>();
        for (Concert concert : concertList) {
            if (concert.getCity().equalsIgnoreCase(city)) {
                concertsInCity.add(concert);
            }
        }
        return concertsInCity;
    }


    public double buyTickets(Concert concert, int numberOfTickets) {
        if (concertList.contains(concert)) {
            double ticketPrice = concert.getTicketPrice();
            return ticketPrice * numberOfTickets;
        } else {
            System.out.println("Error: Concert not found.");
            return 0.0; 
        }
    }

    public List<Concert> getConcertList() {
        return concertList;
    }
}