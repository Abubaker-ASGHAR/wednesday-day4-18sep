class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void teach(Course course) {
        System.out.println(name + " is teaching " + course.getCourseName());
    }
}

 class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() { return courseName; }
}

public class association {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Smith");
        Course course = new Course("Data Structures");

        prof.teach(course);
    }
}
