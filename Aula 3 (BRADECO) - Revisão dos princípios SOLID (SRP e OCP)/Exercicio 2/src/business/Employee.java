package business;

public class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Regra de negócio: cálculo do pagamento
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public String getName() {
        return name;
    }
}
