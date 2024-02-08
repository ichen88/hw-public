package sol;

/**
 * a class that handles TA object which extends the Student class
 */
public class TA extends Student implements IGrader {
    private Course assisting;

    /**
     * Constructor for TA
     * @param n - name of the TA
     * @param c1 - 1st course that the TA takes as a student
     * @param c2 - 2nd course that the TA takes as a student
     * @param c3 - the course that the TA assists in teaching
     * @throws - throws IllegalArgumentException if the TA is assisting and
     *          taking the same course
     */
    public TA(String n, Course c1, Course c2, Course c3) {
        super(n, c1, c2);
        this.assisting = c3;
        if (c1 == c3 || c2 == c3)
            throw new IllegalArgumentException
                    ("Cannot take and assist the same course");
    }

    /**
     * viewGrade method
     * @param graderep - the GradeReport with the grade that the TA is trying
     *                 to view
     * @return - a string representation of the grade in the GradeReport
     */
    public String viewGrade(GradeReport graderep) {
        if (graderep.matchingCourse(this.assisting)) {
            return graderep.gradeToString();
        } else {
            throw new RuntimeException("Access Denied");
        }
    }

    public boolean isTeaching(Course cour) {
        return this.assisting == cour;
    }
}
