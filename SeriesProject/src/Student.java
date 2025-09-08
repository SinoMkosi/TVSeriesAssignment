public class Student extends Person {
    private String studentId;
    private int[] grades; // Array of grades

    public Student(String name, int age, String studentId, int[] grades) {
        super(name, age);
        this.studentId = studentId;
        this.grades = grades;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public int[] getGrades() { return grades; }
    public void setGrades(int[] grades) { this.grades = grades; }

    public double calculateAverage() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.length > 0 ? (double) sum / grades.length : 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentId='" + studentId + '\'' +
                ", grades=" + java.util.Arrays.toString(grades) +
                ", average=" + calculateAverage() +
                '}';
    }
}
