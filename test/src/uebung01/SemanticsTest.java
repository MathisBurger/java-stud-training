package uebung01;

import org.junit.Assert;
import org.junit.Test;

public class SemanticsTest {

    @Test
    public void testSemantics() {
        Studiengruppe group = new Studiengruppe();
        group.addStudent(new Student("Mathis Burger", 19));
        for (Student student : group) {
            Assert.assertEquals("Mathis Burger (19)", student.toString());
        }
    }
}
