package exercise2;

/**
 Zaimplementuj klasę Staff . Klasa ta powinna rozszerzać klasę Person .
 Dodatkowo powinna zawierać:
   - dwa pola: specjalizacja oraz wynagrodzenie
   - konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
   - metody typu getter dla zdeklarowanych pól
   - metody typu setter dla zdeklarowanych pól
   - metodę toString wyświetlającą szczegółowe informacje o wykładowcy
   - Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
 */
public class Staff extends Person{
    private String specialisation;
    private double salary;

    public Staff(String name, String address, String specialisation, double salary){
        super(name, address);
        this.specialisation = specialisation;
        this.salary = salary;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name= '" + getName() + '\'' +
                "address= '" + getAddress() + '\'' +
                "specialisation='" + specialisation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
