import java.util.Objects;

public class Employee {
    private String surname;
    private String name;
    private String middlename;
    private int department;
    private int salary;
    private int counter = 0;
    private int id = counter;


    public Employee(String surname, String name, String middlename, int department, int salary) {
        id++;
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.department = department;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+". ФИО - "+surname+" "+name+" "+middlename+" работает в отделе "+department+" с зарплатой "+salary;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return department == employee.department && salary == employee.salary
                && id == employee.id && java.util.Objects.equals(surname, employee.surname)
                && java.util.Objects.equals(name, employee.name)
                && java.util.Objects.equals(middlename, employee.middlename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, middlename, department, salary, id);
    }
}
