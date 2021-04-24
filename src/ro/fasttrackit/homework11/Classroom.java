package ro.fasttrackit.homework11;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> classroom;

    public Classroom(List<StudentGrade> classroom) {
        this.classroom = classroom;
    }

    public List<StudentGrade> getGradesForDiscipline(String discipline) {
        List<StudentGrade> result = new ArrayList<> ();
        for (StudentGrade student : classroom) {
            if (student.getDiscipline ().equals (discipline)) {
                result.add (student);
            }
        }
        return result;
    }
}
