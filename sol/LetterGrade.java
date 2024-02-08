package sol;

/**
 * A Class that handles LetterGrades and implements the IGrade interface
 */
public class LetterGrade implements IGrade {
    public Letter grade;

    /**
     * LetterGrade constructor
     * @param gr - the Letter grade that the student received
     */
    public LetterGrade(Letter gr) {
        this.grade = gr;
    }

    /**
     * isPassing method
     * @return - will return true if the Letter grade is an A, B, or C and false
     * if otherwise
     */
    public boolean isPassing() {
        return (this.grade == Letter.A || this.grade == Letter.B ||
                this.grade == Letter.C);
    }

    @Override public String toString() {
        String stringRep = "";
        switch (this.grade) {
            case A -> {
                stringRep = "A";
            }
            case B -> {
                stringRep = "B";
            }
            case C -> {
                stringRep = "C";
            }
            case NC -> {
                stringRep = "NC";
            }
        }
        return stringRep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        LetterGrade that = (LetterGrade) o;
        return this.grade == that.grade;
    }
}
