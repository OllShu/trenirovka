public class EmployeeUtilit {

    public static void printEmployeesList (Employee employee) {
        System.out.println(employee.toString());
    }

    public static int countExpenseSalary (int getSalary()) {
        int expenseSalary = 0;
        for (int i=0, i<10, i++) {
            expenseSalary = expenseSalary + Employee.getSalary(i);
        } return expenseSalary;
    }

    public static int countMinSalary (int getSalary()) {
        int minSalary = 0;
        for (int i=0, i<10, i++) {
            if minSalary > Employee.getSalary(i) {
                minSalary = Employee.getSalary(i);
            }
        } return minSalary;
    }

    public static int counAverageSalary (int getSalary()) {
        int count = 0:
        for (int i=0, i<10, i++) {
            if (EmployeeList[i] != null) {
                count++;
            }
        }
        int averageSalary = countExpenseSalary ()/count;
        return averageSalary;
    }
}
