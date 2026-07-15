class Student {

    String name;
    int rollno;
    int mark;

    // Method to store values
    void setDetails(String name, int rollno, int mark) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
    }

    // Method to display values
    void displayDetails() {
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollno);
        System.out.println("Mark     : " + mark);
        System.out.println("------------------------");
    }
}

public class Studentmanagement {

    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Setting values
        s1.setDetails("Sanjay", 101, 90);
        s2.setDetails("Rohit", 102, 85);
        s3.setDetails("Kumar", 103, 95);

        // Creating an array of Student objects
        Student[] students = new Student[3];

        // Storing objects in the array
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Displaying all students using a loop
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }
    }
}
