package ro.fasttrackit.homework11;

import static ro.fasttrackit.homework11.ReadStudentGradesFromFile.readObjectsFromFile;

public class ClassroomMain {
    public static void main(String[] args) throws Exception {
        Classroom classroom = new Classroom (readObjectsFromFile ());
        System.out.println ("Grades for selected discipline: " + classroom.getGradesForDiscipline ("Mathematics"));

        System.out.println ("\n" + "Grade for selected student : ");
        classroom.getGradesForStudent ("Majken Olgica").forEach (System.out::println);

        System.out.println ("\n" + "Max grade for selected discipline: ");
        classroom.getMaxDisciplineGrade ("Computer Science").forEach (System.out::println);

        System.out.println ("\n" + "Max grade from student list: ");
        classroom.getMaxGrade ().forEach (System.out::println);

        System.out.println ("\n" + "Average grade for discipline: " + classroom.getAverageGrade ("Mathematics"));

        System.out.println ("\n" + "Worst grade for discipline: ");
        classroom.getWorstGrade ("Physics").forEach (System.out::println);
    }
}

