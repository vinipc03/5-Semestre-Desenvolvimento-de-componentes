import banco.contas.*;
import banco.servicos.Pagamentos;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000);
        Pagamentos.pagarConta(conta1, 200);

        ContaPoupanca conta2 = new ContaPoupanca(1000);
        // Agora não compila se tentar passar conta2, evitando erro em runtime:
        // Pagamentos.pagarConta(conta2, 200);
    }
}
