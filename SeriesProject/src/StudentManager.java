import java.util.ArrayList;

public class StudentManager {
    private final ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public Student searchStudent(String studentId) {
        for (Student s : studentList) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public boolean updateStudent(String studentId, String newName, int newAge, int[] newGrades) {
        Student s = searchStudent(studentId);
        if (s != null) {
            s.setName(newName);
            s.setAge(newAge);
            s.setGrades(newGrades);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(String studentId) {
        Student s = searchStudent(studentId);
        if (s != null) {
            studentList.remove(s);
            return true;
        }
        return false;
    }

    public void printReport() {
        System.out.println("=== Student Report ===");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public ArrayList<Student> getAllStudents() {
        return studentList;
    }
}
