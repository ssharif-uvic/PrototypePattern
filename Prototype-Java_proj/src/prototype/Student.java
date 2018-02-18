package prototype;
public class Student implements Cloneable
{
    int id;
 
    String name;
 
    Course course;
 
    public Student(int id, String name, Course course)
    {
        this.id = id;
 
        this.name = name;
 
        this.course = course;
    }
 
    //Overriding clone() method to create a deep copy of an object.
 
    protected Object clone() throws CloneNotSupportedException
    {
        Student student = (Student) super.clone();
 
        //IMPORTANT:  If the line below is commented out then the two courses will refer to the same object
        //That is a shallow copy as opposed to a deep copy when the line is not commented out.
        student.course = (Course) course.clone();
 
        return student;
    }
}