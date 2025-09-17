package regulator.impl;

import regulator.interfaces.Thermometer;

/**
 * Simulação de termômetro físico.
 */
public class IOChannelThermometer implements Thermometer {

    @Override
    public double read() {
        // Simulação de leitura de hardware
        return 18.5;
    }
}

