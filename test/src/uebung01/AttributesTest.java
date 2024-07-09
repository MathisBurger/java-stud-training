package uebung01;


import org.junit.Assert;
import org.junit.Test;

public class AttributesTest {

    private static final Class<Student> stud = Student.class;
    private static final Class<Studiengruppe> group = Studiengruppe.class;


    @Test
    public void testStudentAttributes() {
        try {
            stud.getDeclaredField("name");
            stud.getDeclaredField("age");
        } catch (NoSuchFieldException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testGroupAttributes() {
        try {
            group.getDeclaredMethod("addStudent", Student.class);
        } catch (NoSuchMethodException e) {
            Assert.fail(e.getMessage());
        }
    }
}
