
public class Employee {
    String surname;
    String name;
    String middlename;
    int department;
    int salary;
    int id = 1;

    public Employee(String surname, String name, String middlename, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.department = department;
        this.salary = salary;
        id++;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
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

    @java.lang.Override
    public java.lang.String toString() {
        return id+" ФИО - "+surname+name+middlename+" работает в отделе "+department+" с зарплатой "+salary;
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

    public int hashCode() {
        return Objects.hash(super.hashCode(), surname, name, middlename, department, salary, id);
    }
}
