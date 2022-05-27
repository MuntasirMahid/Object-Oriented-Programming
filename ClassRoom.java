import java.util.Scanner;
class classRoom{
    student[]students = new student[50];

    int studentCount = 0;
    double sum;
    double avg;

    void addStudent(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int id = sc.nextInt();
        double cgpa = sc.nextDouble();
        student student1 = new student(name, id, cgpa);
        students[studentCount] = student1;
        studentCount++;

    }

    void printAllName(){
        for
    }
}