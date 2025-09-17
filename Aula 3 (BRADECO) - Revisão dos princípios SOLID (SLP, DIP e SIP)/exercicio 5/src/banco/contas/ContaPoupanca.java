package banco.contas;

/**
 * Conta poupança: NÃO permite saque.
 * Não implementa Sacavel — assim evitamos a violação do LSP.
 */
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    // Não implementa sacar: poupança não permite saque, conforme enunciado.
}
