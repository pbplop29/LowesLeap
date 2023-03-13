 class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private double hra;
    private double ta;
    private double da;
    private double gross;
    private String category;

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = basicSalary * 0.12;
        this.ta = basicSalary * 0.08;
        this.da = basicSalary * 0.09;
        this.gross = basicSalary + hra + ta + da;

        if (this.gross >= 25000) {
            this.category = "A";
        } else if (this.gross >= 10000 && this.gross < 25000) {
            this.category = "B";
        } else {
            this.category = "C";
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public double getTa() {
        return ta;
    }

    public double getDa() {
        return da;
    }

    public double getGross() {
        return gross;
    }

    public String getCategory() {
        return category;
    }
}




public class Four {
    public static void main(String[] args) {
    Employee employee = new Employee(1, "Veera", 25000);

    System.out.println("Employee ID: " + employee.getId());
    System.out.println("Employee Name: " + employee.getName());
    System.out.println("Basic Salary: " + employee.getBasicSalary());
    System.out.println("HRA: " + employee.getHra());
    System.out.println("TA: " + employee.getTa());
    System.out.println("DA: " + employee.getDa());
    System.out.println("Gross Salary: " + employee.getGross());
    System.out.println("Category: " + employee.getCategory());
}
}
