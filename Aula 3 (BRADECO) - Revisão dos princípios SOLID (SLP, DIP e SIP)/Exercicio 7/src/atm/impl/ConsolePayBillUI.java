package atm.impl;

import atm.ui.PayBillUI;

public class ConsolePayBillUI implements PayBillUI {
    @Override
    public double requestBillAmount() {
        return 300.0;
    }
}

