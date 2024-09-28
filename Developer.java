public class Developer extends Job {
    private String programmingLanguages;
    private String frameworkKnowledge;

    public Developer(String title, String responsibilities, double salary, String experienceLevel,
                      String programmingLanguages, String frameworkKnowledge) {
        super(title, responsibilities, salary, experienceLevel);
        this.programmingLanguages = programmingLanguages;
        this.frameworkKnowledge = frameworkKnowledge;
    }

    // Overriding
    @Override
    public void displayJob() {
        super.displayJob();
        System.out.println("Programming Languages: " + programmingLanguages);
        System.out.println("Framework Knowledge: " + frameworkKnowledge);
    }
}
