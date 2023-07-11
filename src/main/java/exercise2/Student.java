package exercise2;

/**
 * Zaimplementuj klasę Student . Klasa ta powinna rozszerzać klasę Person .
 Dodatkowo powinna zawierać:
   * trzy pola: typ studiów, rok studiów, koszt studiów
   * konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
   * metody typu getter dla zdeklarowanych pól
   * metody typu setter dla zdeklarowanych pól
    * metoda toString wyświetlająca szczegółowe informacje o studencie
 */
public class Student extends Person {
    private String major;
    private String studyYear;
    private double schoolFee;

    public Student(String major, String studyYear, double schoolFee) {
        this.major = major;
        this.studyYear = studyYear;
        this.schoolFee = schoolFee;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(String studyYear) {
        this.studyYear = studyYear;
    }

    public double getSchoolFee() {
        return schoolFee;
    }

    public void setSchoolFee(double schoolFee) {
        this.schoolFee = schoolFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", studyYear='" + studyYear + '\'' +
                ", schoolFee=" + schoolFee +
                '}';
    }
}
