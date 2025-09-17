package atm.impl;

import atm.ui.DepositUI;

public class ConsoleDepositUI implements DepositUI {
    @Override
    public double requestDepositAmount() {
        return 200.0;
    }
}

