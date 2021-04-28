package ro.fasttrackit.homework11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> classroom;

    public Classroom(List<StudentGrade> classroom) {
        this.classroom = new ArrayList<> ();
        this.classroom.addAll (classroom);

    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<> ();
        for (StudentGrade student : classroom) {
            if (student.getDiscipline ().equals (discipline)) {
                result.add (student.getGrade ());
            }
        }
        return result;
    }

    public List<StudentGrade> getGradesForStudent(String name) {
        List<StudentGrade> result = new ArrayList<> ();
        for (StudentGrade student : classroom) {
            if (student.getName ().equals (name)) {
                result.add (student);
            }
        }
        return result;
    }

    public int getMaxDisciplineGrade(String discipline) {
        List<Integer> result = getGradesForDiscipline (discipline);
        int max = result.get (0);
        for (Integer grade : result) {
            if (max < grade) {
                max = grade;
            }
        }
        return max;
    }

    public int getMaxGrade() {
        List<Integer> result = new ArrayList<> ();
        for (StudentGrade student : classroom) {
            result.add (student.getGrade ());
        }
        return Collections.max (result);
    }

    public int getAverageGrade(String discipline) {
        List<Integer> result = getGradesForDiscipline (discipline);
        int sum = 0;
        for (StudentGrade student : classroom) {
            if (student.getDiscipline ().equals (discipline)) {
                sum += student.getGrade ();
            }
        }
        return sum / result.size ();
    }

    public int getWorstGrade(String discipline) {
        List<Integer> result = getGradesForDiscipline (discipline);
        int worst = result.get (0);
        for (Integer grade : result) {
            if (worst > grade) {
                worst = grade;
            }
        }
        return worst;
    }
}
