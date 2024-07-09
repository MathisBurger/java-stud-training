package uebung01;

import java.util.Iterator;
import java.util.LinkedList;

public class Studiengruppe implements Iterable<Student> {

    private LinkedList<Student> students = new LinkedList<Student>();

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return this.students.iterator();
    }
}
