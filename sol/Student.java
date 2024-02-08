package sol;

/**
 * a class that handles Students
 */
public class Student extends Person {
    private Course course1;
    private Course course2;

    /**
     * Constructor to make a Student object
     * @param n - the name of the student
     * @param c1 - one of two courses that the student is taking
     * @param c2 - the other course that the student is taking that must be
     *           different than c1
     * @throws - if c1 and c2, the IllegalArgumentException is thrown
     */
    public Student(String n, Course c1, Course c2) {
        super(n);
        this.course1 = c1;
        this.course2 = c2;
        if (c1 == c2)
            throw new IllegalArgumentException("Invalid courses");
    }

    /**
     * isTaking:
     * takes in a Course and outputs whether or not the Student is taking that
     * course
     * @param cor - the input Course that the user wants to know if the student
     *            is taking
     * @return - a boolean; true if cor is one of the two courses the student is
     *         taking, false if the cor is not one of the two courses the
     *         student is taking
     */
    public boolean isTaking(Course cor) {
        return (this.course1 == cor || this.course2 == cor);
    }

    /**
     * totalCredits:
     * takes in no inputs and returns the sum of the credits for the student's
     * two courses
     * @return - a double, equal to the sum of the credits for the student's two
     *         courses
     */
    public double totalCredits() {
        return (this.course1.getCredits() + this.course2.getCredits());
    }
}
