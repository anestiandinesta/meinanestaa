import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DatabaseConcert database = new DatabaseConcert();

        List<Concert> concerts = Arrays.asList(
                new Concert("Java Jazz Festival", "2023-02-25", "Jakarta",
                        Arrays.asList("Diana Krall", "John Legend", "Chris Botti"), 150000),
                new Concert("Rock On The Hills", "2023-03-10", "Bandung",
                        Arrays.asList("Guns N' Roses", "Metallica", "Foo Fighters"), 200000),
                new Concert("Pop Summer Night", "2023-04-05", "Surabaya",
                        Arrays.asList("Taylor Swift", "Ed Sheeran", "Ariana Grande"), 180000),
                new Concert("Indie Music Showcase", "2023-05-20", "Yogyakarta",
                        Arrays.asList("The Local Bands", "Indie Icons", "Acoustic Session"), 75000),
                new Concert("Extravaganza", "2023-06-15", "Bali",
                        Arrays.asList("Martin Garrix", "Calvin Harris", "David Guetta"), 120000)
        );

        for (int i = 0; i < concerts.size(); i++) {
            Concert concert = concerts.get(i);
            concert.setConcertName((i + 1) + ". " + concert.getConcertName());
            database.insertConcert(concert);
        }

        System.out.println();
        System.out.println("Welcome to the Concert Ticket Booking System!");
        System.out.println("Please register to get started.");

    
        System.out.print("Enter your name: ");
        String usernamaLengkap = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String userPhoneNumber = scanner.nextLine();
        System.out.print("Enter your email: ");
        String userEmail = scanner.nextLine();

        User user = new User(usernamaLengkap, userPhoneNumber, userEmail);
        user.registerUser();

        int choice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Show Concerts");
            System.out.println("2. Find Concerts by City");
            System.out.println("3. Buy Tickets");
            System.out.println("4. Exit ");
            System.out.print("Choose an option (1-4): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println();
                    database.showConcert();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Enter the city name to find concerts: ");
                    String cityToFind = scanner.nextLine().trim();
                    List<Concert> concertsInCity = DatabaseConcert.findConcertsByCity(database.getConcertList(), cityToFind);
                
                    if (concertsInCity.isEmpty()) {
                        System.out.println("No concerts in the city " + cityToFind);
                    } else {
                        System.out.println("=========" + cityToFind + "=========");
                        for (Concert concert : concertsInCity) {
                            System.out.println(concert.getConcertName());
                            System.out.println("Line up: " + concert.getLineupArtists());
                            System.out.println("Date: " + concert.getDate());
                            System.out.println("City: " + concert.getCity());
                            System.out.println("Price: " + concert.getTicketPrice());
                            System.out.println("======================");
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Enter the concert name you want to buy tickets for: ");
                    String concertNameToBuy = scanner.nextLine().trim().toLowerCase(); 
                    System.out.print("Enter the number of tickets: ");
                    int numberOfTicketsToBuy;
                    while (true) {
                        try {
                            numberOfTicketsToBuy = Integer.parseInt(scanner.nextLine());
                            if (numberOfTicketsToBuy < 1) {
                                throw new NumberFormatException();
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a positive integer.");
                        }
                    }
                    boolean concertFound = false;
                    double totalPrice = 0.0;
                    for (Concert concert : database.getConcertList()) {
                        String formattedConcertName = concert.getConcertName().replaceAll("^\\d+\\.\\s*", "").toLowerCase();
                        if (formattedConcertName.equals(concertNameToBuy)) {
                            concertFound = true;
                            totalPrice = database.buyTickets(concert, numberOfTicketsToBuy);
                            break;
                        }
                    }
                    if (concertFound) {
                        System.out.println("You have purchased " + numberOfTicketsToBuy + " tickets for the Concert.");
                        System.out.println("Total Price: " + totalPrice);
                        System.out.println("Thank you for purchasing tickets. Enjoy the concert!");
                    } else {
                        System.out.println("Error: Concert not found.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Concert Ticket Booking System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-4).");
            }
        } while (choice != 4);

        scanner.close();
    }
}
