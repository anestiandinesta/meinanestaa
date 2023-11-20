public class RnBPerformance extends Performance {
    private String rnbStyle;

    public RnBPerformance(String artist, String venue, double ticketPrice, String rnbStyle) {
        super(artist, venue, ticketPrice);
        this.rnbStyle = rnbStyle;
    }

    public void perform() {
        System.out.println(getArtist() + " hit the stage with RnB music!");
    }

    public String getRnBStyle() {
        return rnbStyle;
    }
}