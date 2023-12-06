import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentGradeCalculator {
    static Student[] students;

    public static void main(String[] args) {
        System.out.println("--------------STUDENT GRADE CALCULATOR-----------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Students: ");
        int n = sc.nextInt();
        students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter Student Name");

            String name =sc.next();
            students[i] = new Student(name);
            students[i].add();
            System.out.println("--------------STUDENT RESULT-----------------------");
            System.out.println("Student Name: " + students[i].name);
            System.out.println("TOTAL: " + students[i].total());
            System.out.println("AVERAGE PERCENTAGE: " + students[i].avg(students[i].total()) + "%");
            System.out.println("GRADE: " + students[i].grade(students[i].avg(students[i].total())));
            System.out.println();

        }
    }

    static class Student {
        String name;
        ArrayList<String> subjects;
        ArrayList<Integer> marks;

        Student(String name) {
            this.name = name;
            this.subjects = new ArrayList<>();
            this.marks = new ArrayList<>();
        }

        public void add() {
            int i = 0;
            Scanner sc = new Scanner(System.in);
            while (i < 5) {
                System.out.println("Subject Name: ");
                String sub = sc.next();
                this.subjects.add(sub);
                System.out.println("Marks: ");
                int mark = sc.nextInt();
                this.marks.add(mark);
                i++;
            }
        }
        int total() {
            int total = 0;
            for (Integer mark : marks) {
                total += mark;
            }
            return total;
        }
        public float avg(int total) {
            return (float) total / 5;
        }

        public String grade(float avg) {
            if (avg > 100) {
                return "Wrong result!!";
            } else if (avg >= 90) {
                return "A";
            } else if (avg >= 80) {
                return "B";
            } else if (avg >= 70) {
                return "C";
            } else if (avg >= 60) {
                return "D";
            } else if (avg >= 50) {
                return "E";
            } else {
                return "Fail!";
            }
        }
    }
}
