public class JazzPerformance extends Performance {
    private String jazzStyle;

    public JazzPerformance(String artist, String venue, double ticketPrice, String jazzStyle) {
        super(artist, venue, ticketPrice);
        this.jazzStyle = jazzStyle;
    }

    public void perform() {
        System.out.println(getArtist() + "mesmerizes the audience with jazz melodies!");
    }

    public String getJazzStyle() {
        return jazzStyle;
    }
}