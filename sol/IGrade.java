package sol;

/**
 * An interface that is implemented by LetterGrade and SNCGrade
 */
public interface IGrade {
    /**
     * isPassing method
     * @return - returns true if a student's grade is A, B, C, S, or SDIST and
     * returns false if otherwise
     */
    public boolean isPassing();
}
