public class Main {
    public static void printSeparator() {
        String separator = ".............................................................................";
        System.out.println(separator);
    }
    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static int salarySum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getEmployeeSalary();
        }
        return sum;
        }

    public static void minEmployeeSalary(Employee[] employees) {
        int minSalary = employees[0].getEmployeeSalary();
        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getEmployeeSalary() < minSalary) {
                minSalary = employees[i].getEmployeeSalary();
                minSalaryEmployee = employees[i];
            }
        }
        System.out.println(minSalaryEmployee);
    }

    public static void maxEmployeeSalary(Employee[] employees) {
        int maxSalary = employees[0].getEmployeeSalary();
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getEmployeeSalary() > maxSalary) {
                maxSalary = employees[i].getEmployeeSalary();
                maxSalaryEmployee = employees[i];
            }
        }
        System.out.println(maxSalaryEmployee);
    }
    public static double averageSalary(Employee[] employees) {
        double averageSalary = (double) salarySum(employees)/employees.length;
        return averageSalary;
    }

    public static void printAllEmployeesNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getEmployeeName());
        }
    }


    public static void main(String[] args) {
        System.out.println("Курсовая. Усов Никита");
        System.out.println("Базовая сложность");
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Сергей Павлович", 3, 75000);
        employee[1] = new Employee("Сергеев Павел Иванович", 1, 250000);
        employee[2] = new Employee("Павлов Иван Сергеевич", 5, 100000);
        employee[3] = new Employee("Сергеев Иван Иванович", 3, 50000);
        employee[4] = new Employee("Сергеев Павел Павлович", 2, 35000);
        employee[5] = new Employee("Иванов Сергей Сергеевич", 2, 40000);
        employee[6] = new Employee("Иванов Иван Иванович", 5, 120000);
        employee[7] = new Employee("Сергеев Сергей Сергеевич", 3, 30000);
        employee[8] = new Employee("Павлов Павел Павлович", 4, 50000);
        employee[9] = new Employee("Иванов Артем Сергеевич", 4, 50000);
        printAllEmployees(employee);
        printSeparator();
        salarySum(employee);
        System.out.println(salarySum(employee));
        printSeparator();
        minEmployeeSalary(employee);
        printSeparator();
        maxEmployeeSalary(employee);
        printSeparator();
        averageSalary(employee);
        System.out.println(averageSalary(employee));
        printSeparator();
        printAllEmployeesNames(employee);
    }
}