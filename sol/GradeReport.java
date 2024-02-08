package sol;

/**
 * A class that handles GradeReports
 */
public class GradeReport {
    private Student forStudent;
    private Course forCourse;
    private IGrade grade;

    /**
     * Constructs a GradeReport object
     * @param stu - the student that the grade is for
     * @param cor - the course that the grade report is for
     * @param g - the grade of the grade report
     */
    public GradeReport(Student stu, Course cor, IGrade g) {
        this.forStudent = stu;
        this.forCourse = cor;
        this.grade = g;
    }

    /**
     * equals method
     * @param other - other GradeReport that we are comparing this GradeReport
     *              to
     * @return - true if the two GradeReports have all of the same fields, false
     *           if not
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof GradeReport) {
            return this.grade.equals(((GradeReport) other).grade) &&
                    this.forStudent.equals(((GradeReport) other).forStudent) &&
                    this.forCourse.equals(((GradeReport) other).forCourse);
        } else {
            return false;
        }
    }

    /**
     * helper for reportsWithC
     * @return - true of the grade of the GradeReport is C and false if not
     */
    public boolean boolC() {
        return (this.grade.equals(new LetterGrade(Letter.C)));
    }

    /**
     * nameMatch method
     * @param name - the name of the student we are looking for
     * @return - true if the name matches the name of a student on the
     * GradeReport
     */
    public boolean nameMatch(String name) {
        return this.forStudent.name.equals(name);
    }

    /**
     * gradeToString method
     * @return - returns the grade of the GradeReport as a String
     */
    public String gradeToString() {
        return grade.toString();
    }

    /**
     * changeGradeReport method
     * @param oldGR - the gradeReport that we want to modify
     * @param newG - the new grade that we want to give to oldGR
     */
    public void changeGradeReport(GradeReport oldGR, IGrade newG) {
        oldGR.grade = newG;
    }

    /**
     * matchingCourse method - input is a course and output boolean depending
     * if that course is the course that the GradeReport is for
     * @param cour - the course that we want to check if the GradeReport is for
     * @return - true if cour and the this.forCourse match, false if not
     */
    public boolean matchingCourse(Course cour) {
        return this.forCourse == cour;
    }

}
