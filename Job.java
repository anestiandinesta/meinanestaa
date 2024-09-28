public class Job {
    protected String title;
    protected String responsibilities;
    protected double salary;
    protected String experienceLevel;

    public Job(String title, String responsibilities, double salary, String experienceLevel) {
        this.title = title;
        this.responsibilities = responsibilities;
        this.salary = salary;
        this.experienceLevel = experienceLevel;
    }

    // Method untuk menampilkan detail job
    public void displayJob() {
        System.out.println("Title: " + title);
        System.out.println("Responsibilities: " + responsibilities);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experienceLevel);
    }
}
