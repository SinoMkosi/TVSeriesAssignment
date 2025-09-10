public class StudentApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Add demo students
        manager.addStudent(new Student("Sino", 21, "S001", new int[]{85, 90, 78}));
        manager.addStudent(new Student("Siya", 19, "S002", new int[]{70, 75, 80}));
        manager.addStudent(new Student("Nwaba", 21, "S003", new int[]{95, 100, 92}));

        // Initial Report
        manager.printReport();

        // Update test
        System.out.println("\nUpdating Student S002...");
        manager.updateStudent("S002", "Sino", 21, new int[]{80, 85, 90});
        manager.printReport();

        // Delete test
        System.out.println("\nDeleting Student S001...");
        manager.deleteStudent("S001");
        manager.printReport();
    }
}

