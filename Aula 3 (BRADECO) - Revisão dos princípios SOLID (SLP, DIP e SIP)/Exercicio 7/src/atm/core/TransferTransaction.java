package atm.core;

import atm.ui.TransferUI;

public class TransferTransaction extends Transaction {
    private final TransferUI ui;

    public TransferTransaction(TransferUI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        double amount = ui.requestTransferAmount();
        System.out.println("Transferindo R$" + amount);
    }
}

