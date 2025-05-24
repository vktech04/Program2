package Program2;
public class StudentCourses {
    String[] courses = {"Java Programing", "Big Dat Analytics", "Devops"};
    int[] marks = {95, 89, 92};

    public void displayCourses() {
        System.out.println("Student Course Information:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }

    public static void main(String[] args) {
        StudentCourses BCA = new StudentCourses();
        BCA.displayCourses();

    }
}
