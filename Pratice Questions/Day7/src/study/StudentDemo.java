package study;
import java.io.*;
import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Adding 10 students
        studentList.add(new Student(101, "Tanishqa", "Java", 85, 90));
        studentList.add(new Student(102, "Aarav", "Python", 55, 70));
        studentList.add(new Student(103, "Riya", "C++", 92, 88));
        studentList.add(new Student(104, "Kunal", "AI", 60, 75));
        studentList.add(new Student(105, "Sneha", "Data Science", 45, 65));
        studentList.add(new Student(106, "Arjun", "ML", 98, 92));
        studentList.add(new Student(107, "Priya", "Java", 88, 78));
        studentList.add(new Student(108, "Raj", "Web Dev", 70, 80));
        studentList.add(new Student(109, "Simran", "C#", 67, 72));
        studentList.add(new Student(110, "Rohit", "Database", 95, 89));

        // Serialize students
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(studentList);
            System.out.println("✅ Students serialized successfully!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sorting in decreasing order of attendance
        Collections.sort(studentList);

        System.out.println("📘 Students sorted by attendance (decreasing order):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Checking grade eligibility
        System.out.println("\n🎯 Grade Evaluation:");
        for (Student s : studentList) {
            try {
                s.calculateGrade();
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
