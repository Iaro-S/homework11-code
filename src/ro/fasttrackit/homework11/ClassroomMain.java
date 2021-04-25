package ro.fasttrackit.homework11;

import java.util.List;

public class ClassroomMain {
    public static void main(String[] args) {
        Classroom classroom = new Classroom (
                List.of (
                        new StudentGrade ("Ealhstan Saira", "Computer Science", 10),
                        new StudentGrade ("Gasparo Sava", "Mathematics", 7),
                        new StudentGrade ("Demetria Cosme", "Mathematics", 5),
                        new StudentGrade ("Popa Cristina", "Mathematics", 9),
                        new StudentGrade ("Majken Olgica", "Mathematics", 4),
                        new StudentGrade ("Majken Olgica", "History", 9),
                        new StudentGrade ("Miriana Rómulo", "Computer Science", 7),
                        new StudentGrade ("Utu Arcadius", "Physics", 3),
                        new StudentGrade ("Branwen Evelina", "Physics", 4)
                ));
        System.out.println ("Grades for selected discipline: " + classroom.getGradesForDiscipline ("Mathematics"));
        System.out.println ("Grade for student: " + classroom.getGradesForStudent ("Majken Olgica"));
        System.out.println ("Max grade for discipline: " + classroom.getMaxDisciplineGrade ("Mathematics"));
        System.out.println ("Max grade: " + classroom.getMaxGrade ());
        System.out.println ("Average grade for discipline: " + classroom.getAverageGrade ("Mathematics"));
        System.out.println ("Worst grade for discipline: " + classroom.getWorstGrade ("Physics"));
    }
}