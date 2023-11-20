public class Concert {
    public static void main(String[] args) {
        Performance jazzPerformance = new JazzPerformance("V of BTS", "Jamsil Olympic Stadium", 3100000, "Soul Jazz Classic");
        Performance rnbPerformance = new RnBPerformance("Paul Kim", "Jakarta International Stadium", 2500000, "RnB Blues");

        System.out.println("Jazz Concert Details:");
        System.out.println("Artist: " + jazzPerformance.getArtist());
        System.out.println("Venue: " + jazzPerformance.getVenue());
        System.out.println("Ticket Price: KRW " + jazzPerformance.getTicketPrice());
        System.out.println("Jazz Style: " + ((JazzPerformance) jazzPerformance).getJazzStyle());
        jazzPerformance.perform();

        System.out.println("\nRnB Concert Details:");
        System.out.println("Artist: " + rnbPerformance.getArtist());
        System.out.println("Venue: " + rnbPerformance.getVenue());
        System.out.println("Ticket Price: Rp" + rnbPerformance.getTicketPrice());
        System.out.println("RnB Style: " + ((RnBPerformance) rnbPerformance).getRnBStyle());
        rnbPerformance.perform();
    }
}