package study;
import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
    private int rollNo;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    public Student() {
        // Default constructor
    }

    public Student(int rollNo, String sname, String course, double attendance_percentage, double score) {
        this.rollNo = rollNo;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    public void calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60) {
            throw new LowAttendanceException("Attendance below 60%! Student not eligible for grading: " + sname);
        } else {
            String grade;
            if (score >= 90) grade = "A";
            else if (score >= 75) grade = "B";
            else if (score >= 50) grade = "C";
            else grade = "D";

            System.out.println(sname + " (" + rollNo + ") Grade: " + grade);
        }
    }

    public double getAttendance() {
        return attendance_percentage;
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(s.getAttendance(), this.attendance_percentage); // decreasing order
    }

    @Override
    public String toString() {
        return rollNo + " - " + sname + " | " + course + " | Attendance: " + attendance_percentage + "% | Score: " + score;
    }
}
