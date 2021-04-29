package ro.fasttrackit.homework11;

import static ro.fasttrackit.homework11.ReadStudentGradesFromFile.readObjectsFromFile;

public class ClassroomMain {
    public static void main(String[] args) throws Exception {
        Classroom classroom = new Classroom (readObjectsFromFile ());
        System.out.println ("Grades for selected discipline: " + classroom.getGradesForDiscipline ("Mathematics"));
        System.out.println ("Grade for student: " + classroom.getGradesForStudent ("Majken Olgica"));
        System.out.println ("Max grade for discipline: " + classroom.getMaxDisciplineGrade ("Mathematics"));
        System.out.println ("Max grade: " + classroom.getMaxGrade ());
        System.out.println ("Average grade for discipline: " + classroom.getAverageGrade ("Mathematics"));
        System.out.println ("Worst grade for discipline: " + classroom.getWorstGrade ("Physics"));
        System.out.println (classroom.getMax ("History"));
    }
}

