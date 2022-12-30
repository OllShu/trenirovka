public class Main {
    public static void main(String[] args) {

        Employee [] EmployeesList = new Employee[10];

        EmployeesList[0] = new Employee("Иванов", "Иван", "Иванович",1, 70500);
        EmployeesList[1] = new Employee("Петров", "Петр", "Петрович", 1, 55250);
        EmployeesList[2] = new Employee("Сидоров", "Сидор", "Сидорович", 1, 52900);
        EmployeesList[3] = new Employee("Кузнецов", "Кузьма", "Кузьмич", 2, 77200);
        EmployeesList[4] = new Employee("Васильев", "Василий", "Васильевич", 2, 49900);
        EmployeesList[5] = new Employee("Попов", "Евгений", "Евгеньевич", 3, 81000);
        EmployeesList[6] = new Employee("Смирнов", "Андрей", "Андреевич", 3, 33400);
        EmployeesList[7] = new Employee("Лебедев", "Сергей", "Сергеевич", 4, 99500);
        EmployeesList[8] = new Employee("Морозов", "Дмитрий", "Дмитриевич", 5, 88100);
        EmployeesList[9] = new Employee("Соколов", "Илья", "Ильич", 5, 63800);
    }
}