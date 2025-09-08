import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    @Test
    void TestSearchStudent() {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("Alice", 20, "S001", new int[]{80, 90}));

        Student result = manager.searchStudent("S001");
        assertNotNull(result);
        assertEquals("Alice", result.getName());
    }

    @Test
    void TestSearchStudent_NotFound() {
        StudentManager manager = new StudentManager();
        Student result = manager.searchStudent("S999");
        assertNull(result);
    }

    @Test
    void TestUpdateStudent() {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("Sino", 21, "S002", new int[]{70, 75}));

        boolean updated = manager.updateStudent("S002", "Siya", 19, new int[]{80, 85});
        assertTrue(updated);
        assertEquals("Siya", manager.searchStudent("S002").getName());
    }

    @Test
    void TestDeleteStudent() {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("Nwaba", 21, "S003", new int[]{95, 100}));

        boolean deleted = manager.deleteStudent("S003");
        assertTrue(deleted);
        assertNull(manager.searchStudent("S003"));
    }

    @Test
    void TestDeleteStudent_NotFound() {
        StudentManager manager = new StudentManager();
        boolean deleted = manager.deleteStudent("S999");
        assertFalse(deleted);
    }

    @Test
    void TestCalculateAverage() {
        Student s = new Student("Test", 20, "S004", new int[]{100, 90, 80});
        assertEquals(90.0, s.calculateAverage());
    }
}