import business.Employee;
import persistence.PersistenceFacade;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("João", 25.0, 40);
        double payment = emp.calculatePay();

        System.out.println(emp.getName() + " deve receber: R$ " + payment);

        // Usando o Facade para salvar os dados
        PersistenceFacade persistence = new PersistenceFacade();
        persistence.saveEmployeeData(emp.getName() + " - Pagamento: " + payment);
    }
}
