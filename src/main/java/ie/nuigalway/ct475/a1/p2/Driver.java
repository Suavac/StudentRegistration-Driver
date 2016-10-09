package ie.nuigalway.ct475.a1.p2;

import ie.nuigalway.ct475.a1.p1.Course;
import ie.nuigalway.ct475.a1.p1.Module;
import ie.nuigalway.ct475.a1.p1.Student;

import java.util.ArrayList;

public class Driver {
    private static int studentcount = 1600000;

    public static void main(final String... args) {
        final ArrayList<Student> batch1 = new ArrayList<>();
        batch1.add(new Student("Lucius Cashmere", "12-03-1989", studentcount++));
        batch1.add(new Student("Jesse Phoenix", "12-03-1989", studentcount++));
        batch1.add(new Student("Dell MacApple", "12-03-1989", studentcount++));
        batch1.add(new Student("Roger Flopple", "12-03-1989", studentcount++));
        batch1.add(new Student("Demetrius Levenworth", "12-03-1989", studentcount++));
        batch1.add(new Student("Lieutenant Poowhistle", "12-03-1989", studentcount++));
        batch1.add(new Student("Dunk Johnson", "12-03-1989", studentcount++));
        batch1.add(new Student("Lucenzo Diablo", "12-03-1989", studentcount++));
        batch1.add(new Student("Salamander Hammerhead", "12-03-1989", studentcount++));
        batch1.add(new Student("Serge LeMans", "12-03-1989", studentcount++));
        batch1.add(new Student("Flip Jupiter", "12-03-1989", studentcount++));
        batch1.add(new Student("Ed Bed", "12-03-1989", studentcount++));
        batch1.add(new Student("Oliver Revilo", "12-03-1989", studentcount++));
        batch1.add(new Student("Bushwood Parachute", "12-03-1989", studentcount++));
        batch1.add(new Student("Victor Hickory", "12-03-1989", studentcount++));
        batch1.add(new Student("Ferrari Montenegro", "12-03-1989", studentcount++));

        final Module m1 = new Module("Software Engineering", "CT123");
        final Module m2 = new Module("Professional Skills", "CT257");
        final Module m3 = new Module("Databases", "CT875");
        final Module m4 = new Module("Programming Paradigms", "CT298");
        final Module m5 = new Module("Modern Information Management", "CT115");
        final Module m6 = new Module("Mathematics", "MA111");
        final Module m7 = new Module("HCI", "CT556");

        final Course c1 = new Course("Computer Science & IT", "01-09-2013", "30-05-2017");


        m1.addStudents(batch1);
        m2.addStudents(batch1);
        m3.addStudents(batch1);
        m4.addStudents(batch1);
        m5.addStudents(batch1);
        m6.addStudents(batch1);
        m7.addStudents(batch1);

        c1.addModule(m1);
        c1.addModule(m2);
        c1.addModule(m3);
        c1.addModule(m4);
        c1.addModule(m5);
        c1.addModule(m6);
        c1.addModule(m7);

        final ArrayList<Student> st = c1.getStudents();

        for (final Student s : c1.getStudents()) {
            System.out.println("--------------- STUDENT ---------------");
            System.out.println("Name:\t" + s.getName());
            System.out.println("DOB:\t" + s.getDob() + "\t" + " -  Age: " + s.getAge());
            System.out.println("Student ID:\t" + s.getId());
            System.out.println("\n");
            System.out.println("Course:\t" + s.getCourseName());
            printStudentDetails(s);
            System.out.println("---------------------------------------\n");
        }


    }

    public static void printStudentDetails(final Student s) {
        System.out.println("\nMODULES:");
        for (final Module m : s.getModules()) {
            System.out.println(m.toString());
        }
    }
}
