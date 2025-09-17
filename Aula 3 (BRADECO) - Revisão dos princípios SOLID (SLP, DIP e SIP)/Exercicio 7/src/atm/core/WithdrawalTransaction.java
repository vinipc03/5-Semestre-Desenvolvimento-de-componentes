package atm.core;

import atm.ui.WithdrawalUI;

public class WithdrawalTransaction extends Transaction {
    private final WithdrawalUI ui;
    private double saldo = 100; // Simulação

    public WithdrawalTransaction(WithdrawalUI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        double amount = ui.requestWithdrawalAmount();
        if (amount > saldo) {
            ui.informInsufficientFunds();
        } else {
            saldo -= amount;
            System.out.println("Sacando R$" + amount + " | Saldo restante: R$" + saldo);
        }
    }
}

