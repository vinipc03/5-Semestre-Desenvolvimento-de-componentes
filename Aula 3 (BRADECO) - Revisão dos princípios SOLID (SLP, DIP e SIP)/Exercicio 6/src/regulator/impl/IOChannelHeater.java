package regulator.impl;

import regulator.interfaces.Heater;

/**
 * Simulação de aquecedor físico.
 */
public class IOChannelHeater implements Heater {

    @Override
    public void engage() {
        System.out.println("Furnace ON");
    }

    @Override
    public void disengage() {
        System.out.println("Furnace OFF");
    }
}

