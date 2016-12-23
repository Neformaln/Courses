/**
 * Created by Dibox on 23.12.2016.
 */
public class ArhciveEntry
{
    private Course course;
    private Student student;
    private Professor professor;
    private int mark;

    public ArhciveEntry(Course course, Student student, Professor professor, int mark)
    {
        this.course = course;
        this.student = student;
        this.professor = professor;
        this.mark = mark;
    }

    public Course getCourse()
    {

        return course;
    }

    public int getMark()
    {

        return mark;
    }

    public Professor getProfessor()
    {

        return professor;
    }

    public Student getStudent()

    {
        return student;
    }



}