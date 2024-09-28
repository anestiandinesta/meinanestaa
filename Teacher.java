public class Teacher extends Job {
    private String subject;
    private String certification;

    public Teacher(String title, String responsibilities, double salary, String experienceLevel,
                    String subject, String certification) {
        super(title, responsibilities, salary, experienceLevel);
        this.subject = subject;
        this.certification = certification;
    }

    // Overriding
    @Override
    public void displayJob() {
        super.displayJob();
        System.out.println("Subject: " + subject);
        System.out.println("Certification: " + certification);
    }
}
