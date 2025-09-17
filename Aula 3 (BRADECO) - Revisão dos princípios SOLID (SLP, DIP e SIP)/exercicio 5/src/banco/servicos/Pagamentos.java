package banco.servicos;

import banco.contas.Sacavel;
import banco.contas.ContaBancaria;

/**
 * Serviço de pagamentos: só aceita objetos que implementam Sacavel.
 * Dessa forma, evitamos passar uma ContaPoupanca (que não suporta saque).
 */
public class Pagamentos {

    /**
     * Paga uma conta a partir de uma conta SACÁVEL.
     *
     * @param conta objeto que implementa Sacavel
     * @param valor valor a sacar/pagar
     */
    public static void pagarConta(Sacavel conta, double valor) {
        // Para exibir saldo antes/depois precisamos do acesso a getSaldo(),
        // que está em ContaBancaria. Sacavel não garante getSaldo(),
        // então verificamos e convertemos para ContaBancaria para leitura.
        if (!(conta instanceof ContaBancaria)) {
            throw new IllegalArgumentException("Conta precisa ser uma ContaBancaria para consultar saldo");
        }

        ContaBancaria cb = (ContaBancaria) conta;
        System.out.println("Saldo antes: " + cb.getSaldo());
        conta.sacar(valor);
        System.out.println("Saldo depois: " + cb.getSaldo());
    }
}
