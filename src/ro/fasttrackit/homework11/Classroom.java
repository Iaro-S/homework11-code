package ro.fasttrackit.homework11;

import java.util.*;

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

    public List<StudentGrade> getMaxGrade() {
        List<StudentGrade> result = new ArrayList<> ();
        int max = 0;
        for (StudentGrade student : classroom) {
            if (student.getGrade () > max) {
                max = student.getGrade ();
                result.clear ();
                result.add (student);
            } else if (student.getGrade () == max) {
                result.add (student);
            }
        }
        return result;
    }

    public List<StudentGrade> getMaxDisciplineGrade(String discipline) {
        List<StudentGrade> result = new ArrayList<> ();
        int max = 0;
        for (StudentGrade student : classroom) {
            if (student.getDiscipline ().equals (discipline)) {
                if (student.getGrade () > max) {
                    max = student.getGrade ();
                    result.clear ();
                    result.add (student);
                } else if (student.getGrade () == max) {
                    result.add (student);
                }
            }
        }
        return result;
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

    public List<StudentGrade> getWorstGrade(String discipline) {
        List<StudentGrade> result = new ArrayList<> ();
        int min = Integer.MAX_VALUE;
        for (StudentGrade student : classroom) {
            if (student.getDiscipline ().equals (discipline)) {
                if (student.getGrade () < min) {
                    min = student.getGrade ();
                    result.clear ();
                    result.add (student);
                } else if (student.getGrade () == min) {
                    result.add (student);
                }
            }
        }
        return result;
    }
}
