package banco.contas;

/**
 * Interface que define a operação de saque.
 * Apenas contas que suportam saque devem implementá-la.
 */
public interface Sacavel {
    void sacar(double valor);
}
