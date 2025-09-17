package atm;

import atm.core.*;
import atm.impl.*;

public class Main {
    public static void main(String[] args) {
        Transaction deposit = new DepositTransaction(new ConsoleDepositUI());
        deposit.execute();

        Transaction withdraw = new WithdrawalTransaction(new ConsoleWithdrawalUI());
        withdraw.execute();

        Transaction transfer = new TransferTransaction(new ConsoleTransferUI());
        transfer.execute();

        Transaction payGas = new PayGasBillTransaction(new ConsolePayBillUI());
        payGas.execute();
    }
}

/*
Por que o modelo original violava ISP?
Porque todas as transações dependiam de uma interface 
única UI que continha métodos que elas não utilizavam. 
Isso gerava acoplamento desnecessário e fazia mudanças em 
uma transação impactarem todas as outras.

Como a refatoração aplica ISP?
Criamos interfaces específicas (DepositUI, WithdrawalUI, 
TransferUI, PayBillUI), de modo que cada transação depende 
apenas dos métodos que realmente utiliza. Assim, alterações 
em uma interface não impactam transações que não a usam.

Benefício prático:
Quando adicionamos a nova transação PayGasBillTransaction com sua 
interface PayBillUI, não houve impacto no restante do código, 
mostrando o ganho de baixo acoplamento e alta coesão.
 */

