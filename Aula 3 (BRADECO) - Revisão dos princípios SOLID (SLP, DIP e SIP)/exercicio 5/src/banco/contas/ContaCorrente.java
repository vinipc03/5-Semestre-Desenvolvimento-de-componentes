package banco.contas;

/**
 * Conta corrente: permite saque. Implementa Sacavel.
 */
public class ContaCorrente extends ContaBancaria implements Sacavel {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor de saque inválido");
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
