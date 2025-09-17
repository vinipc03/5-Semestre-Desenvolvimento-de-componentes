package atm.impl;

import atm.ui.TransferUI;

public class ConsoleTransferUI implements TransferUI {
    @Override
    public double requestTransferAmount() {
        return 500.0;
    }
}

