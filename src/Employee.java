import java.util.Objects;

public class Employee {
    private String employeeName;
    private int departmentNumber;
    private int employeeSalary;
    private static int idCounter;
    private int id;

    public Employee(String employeeName, int departmentNumber, int employeeSalary) {
        this.id = idCounter++;
        this.employeeName = employeeName;
        this.departmentNumber = departmentNumber;
        this.employeeSalary = employeeSalary;
    }

    public int getId() {
        return this.id;
    }

    public static int departmentNumberLimit(int departmentNumber) {
        if (departmentNumber <= 5 && departmentNumber > 0) {
        }
        return departmentNumber;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartmentNumber() {
        return this.departmentNumber;
    }

    public int getEmployeeSalary() {
        return this.employeeSalary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "id сотрудника - " + id + ", ФИО - " + employeeName + ", Номер отдела - " + departmentNumber +
                ", Зарплата " + employeeSalary + " рублей.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNumber == employee.departmentNumber && employeeSalary == employee.employeeSalary && id == employee.id && employeeName.equals(employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, departmentNumber, employeeSalary, id);
    }
}

