package regulator;

import regulator.core.Regulator;
import regulator.impl.IOChannelThermometer;
import regulator.impl.IOChannelHeater;

public class Main {
    public static void main(String[] args) {
        // Criação das implementações concretas
        IOChannelThermometer thermometer = new IOChannelThermometer();
        IOChannelHeater heater = new IOChannelHeater();

        // Injeção de dependências no Regulator (alto nível não conhece implementações)
        Regulator regulator = new Regulator(thermometer, heater);

        // Simulação: faixa desejada entre 20 e 25 graus
        regulator.regulate(20, 25);
    }
}

