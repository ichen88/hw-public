package sol;
import java.util.LinkedList;

/**
 * a class that handles Courses
 */
public class Course {
    private String department;
    private int courseNumber;
    private double credits;
    private LinkedList<GradeReport> gradebook;

    /**
     * Constructs a Course object
     * @param dep - the department the course is being taught from
     * @param courseNum - the course number of the course
     * @param cred - the amount of credits the course gives; should be 0.5, 1.0,
     *            or 1.5
     * @throws - if someone tries to create a Course object with credits other
     *         than 0.5, 1.0, or 1.5, then an IllegalArgumentException will be
     *         thrown
     */

    public Course(String dep, int courseNum, double cred) {
        if (!(cred == 0.5 || cred == 1.0 || cred == 1.5))
            throw new IllegalArgumentException("Invalid credits");
        this.department = dep;
        this.courseNumber = courseNum;
        this.credits = cred;
        this.gradebook = new LinkedList<GradeReport>();
    }

    /**
     * Constructs a default course worth one credit
     * @param dep - the department the course is being taught from
     * @param courseNum - the course number of the course
     */

    public Course(String dep, int courseNum) {
        this.department = dep;
        this.courseNumber = courseNum;
        this.credits = 1.0;
    }

    /**
     * getter for credits
     */
    public double getCredits() {
        return this.credits;
    }

    /**
     * toString() method
     * @return - returns the string version of a course
     */
    @Override
    public String toString(){
        return (this.department + this.courseNumber);
    }

    /**
     * storeGrade method
     * @param st - the student whose grade we want to put into the gradebook
     * @param gra - the grade that we want to put into the gradebook
     */
    public void storeGrade(Student st, IGrade gra) {
        this.gradebook.add(new GradeReport(st, this, gra));
    }

    /**
     * findGradeReport method
     * @param name - the name of the student whose GradeReport we're looking for
     * @return - the GradeBook of the student or null if the student does not
     * have a gradereport in the class
     */
    private GradeReport findGradeReport(String name) {
        for (GradeReport gr : this.gradebook) {
            if (gr.nameMatch(name)) {
                return gr;
/*            } else {
                return null;
            }*/
        }
    }
        return null;
    }

    /**
     * updateGrade method
     * The method should take in the name of a student (String) and a valid
     * grade. The method should result in the new grade being stored in the
     * gradebook for the given student. If the student does not have a grade,
     * throw a RuntimeException with the message "no grade for student".
     *
     * idea: findGradeReport, store it in a variable, change the variable???
     *
     * @param name - the name of the student whose grade we want to change
     * @param grad - the new grade that we want to give the student
     */
    public void updateGrade(String name, IGrade grad) {
        if (this.findGradeReport(name) == null) {
            throw new RuntimeException("no grade for student");
        } else {
            GradeReport gr = findGradeReport(name);
            gr.changeGradeReport(gr, grad);
        }
    }

    /**
     * Add a method called gradeLookup to the Course class.
     *
     * The method should take a Faculty or TA object and a student name as input.
     *
     * If gradebook has a  GradeReport for the given student name, the method
     * should return a String representation of the grade.
     * If the given Faculty or TA is not teaching the course, throw a
     * RuntimeException with the message "permission denied".
     * If no such grade is found, a RuntimeException with the message
     * "student <NAME> not found" should be thrown (where "<NAME>" is replaced
     * with the student name being searched for).
     * In cases where both exceptions would apply, throw the permission denied
     * exception.
     */

    public String gradeLookup(IGrader grader, String name) {
        if ((this.findGradeReport(name) == null) &&
                !grader.isTeaching(this)) {
            throw new RuntimeException("permission denied");
        } else if ((this.findGradeReport(name) == null) &&
                grader.isTeaching(this)){
            throw new RuntimeException("student " + name + " not found");
        } else if (!grader.isTeaching(this)){
            throw new RuntimeException("permission denied");
        } else {
            return this.findGradeReport(name).gradeToString();
        }
    }

    /**
     * reportsWithC method
     * Add a method reportsWithC to the Course class. The method should return
     * a list of GradeReport from the course gradebook in which the grade is the
     * letter C.
     */
    public LinkedList<GradeReport> reportsWithC() {
        LinkedList<GradeReport> cGrades = new LinkedList<GradeReport>();
        for (GradeReport gr : this.gradebook) {
            if (gr.boolC()) {
                cGrades.add(gr);
            }
        }
        return cGrades;
    }

}
