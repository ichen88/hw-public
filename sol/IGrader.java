package sol;

/**
 * interface IGrade that is implemented by TA and Faculty
 */
public interface IGrader {
    public String viewGrade(GradeReport graderep);
    public boolean isTeaching(Course cour);
}
