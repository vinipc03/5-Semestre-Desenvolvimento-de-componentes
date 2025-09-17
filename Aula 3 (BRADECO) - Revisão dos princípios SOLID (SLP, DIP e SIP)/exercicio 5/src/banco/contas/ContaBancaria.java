package banco.contas;

/**
 * Classe base para contas. Não garante que a conta permite saque.
 * Contas que permitem saque devem implementar a interface Sacavel.
 */
public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor de depósito inválido");
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

