package atm.core;

import atm.ui.DepositUI;

public class DepositTransaction extends Transaction {
    private final DepositUI ui;

    public DepositTransaction(DepositUI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        double amount = ui.requestDepositAmount();
        System.out.println("Depositando R$" + amount);
    }
}

