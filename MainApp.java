public class MainApp {
    public static void main(String[] args) {
        Developer developerJob = new Developer("Software Developer", "Front-End development", 80000, "Pengembangan UI Aplikasi Hijau", "Java, Python, C++, HTML", "Bootstrap");
        Teacher teacherJob = new Teacher("Math Teacher", "Teaching mathematics and science", 60000, "Pengembangan Materi Kurikulum", "Mathematics", "Teaching Certification");

        // Menampilkan Job detail menggunakan polymorphism
        displayJobDetails(developerJob);
        System.out.println();
        displayJobDetails(teacherJob);
    }

    // Method Polymorphic 
    public static void displayJobDetails(Job job) {
        System.out.println("Job Details:");
        System.out.println("---------------------");
        job.displayJob();
        System.out.println("---------------------");
    }
}
