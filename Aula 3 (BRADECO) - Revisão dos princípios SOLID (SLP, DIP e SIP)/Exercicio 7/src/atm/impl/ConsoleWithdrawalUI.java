package atm.impl;

import atm.ui.WithdrawalUI;

public class ConsoleWithdrawalUI implements WithdrawalUI {
    @Override
    public double requestWithdrawalAmount() {
        return 150.0;
    }

    @Override
    public void informInsufficientFunds() {
        System.out.println("Saldo insuficiente para saque!");
    }
}

