package immutable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testEmployeeImmutable() {
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        Employee employee = new Employee("John Doe", 1970, courses);

        employee.getCourses().add("C#");

        assertEquals(2, employee.getCourses().size());
    }
}
