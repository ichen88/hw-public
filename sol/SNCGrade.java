package sol;

/**
 * A class that handles SNCGrades and implements the IGrade interface
 */
public class SNCGrade implements IGrade {
    public boolean pass;
    public boolean passDistinction;

    /**
     * SNCGrade constructor
     * @param p - the SNC grade that the student received
     */
    public SNCGrade(SNC p) {
        this.pass = (p == SNC.S || p == SNC.SDIST);
        this.passDistinction = (this.pass && p == SNC.SDIST);
    }

    /**
     * the isPassing method
     * @return - returns true if this.pass is true and false if otherwise
     */
    public boolean isPassing() {
        return this.pass;
    }

    @Override public String toString() {
        if (this.pass && this.passDistinction) {
            return "S*";
        } else if (this.pass && !this.passDistinction) {
            return "S";
        } else {
            return "NS";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        SNCGrade sncGrade = (SNCGrade) o;
        return this.pass == sncGrade.pass && this.passDistinction == sncGrade.passDistinction;
    }
}
