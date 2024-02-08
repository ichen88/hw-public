package sol;
import java.util.LinkedList;

/**
 * A class that handles Faculty
 */
public class Faculty extends Person implements IGrader  {
    private String department;
    private LinkedList<Course> teaching;

    /**
     * Constructs a Faculty object
     * @param n - the name of the faculty member
     * @param dep - the department that the faculty member teaches in
     * @param teach - the course that the faculty member is currently teaching
     */
    public Faculty(String n, String dep, LinkedList<Course> teach) {
        super(n);
        this.department = dep;
        this.teaching = teach;
/*        this.teaching = new LinkedList<>();
        this.teaching.add(teach);*/

    }

    /**
     * isTeaching:
     * takes a Course and returns a boolean indicating whether the faculty
     * member is teaching that course
     * @param cour - the course that the method checks to see if the Faculty
     *             member teaches
     * @return - a boolean; true if cour is the same as this.teaching and false
     *         otherwise
     */
    public boolean isTeaching(Course cour) {
        return this.teaching.contains(cour);
    }

    /**
     * canGrade:
     * takes in a Student and returns a boolean indicating whether or not the
     * teacher can give a grade to that student
     * @param stew - the Student who we want to check whether or not the teacher
     *             can give a grade to them
     * @return - a boolean; true if the student is taking a course that the
     *          teacher is teaching, false if the student is not taking any
     *          courses that the teacher is teaching
     */
    public boolean canGrade(Student stew) {
        for (Course cour : this.teaching) {
            return stew.isTaking(cour);
        }
        return false;
    }

    /**
     * viewGrade method
     * @param graderep - the GradeReport with the grade that the Faculty is
     *                 trying to view
     * @return - a string representation of the grade in the GradeReport
     */
    public String viewGrade(GradeReport graderep) {
        for (Course cour : this.teaching) {
            if (graderep.matchingCourse(cour)) {
                return graderep.gradeToString();
            }
        }
        throw new RuntimeException("Access Denied");
/*        if (this.teaching.contains(graderep.forCourse)) {
            return graderep.gradeToString();
        } else {
            throw new RuntimeException("Access Denied");
        }*/
    }
}
