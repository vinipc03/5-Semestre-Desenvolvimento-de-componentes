package regulator.core;


import regulator.interfaces.Thermometer;
import regulator.interfaces.Heater;

/**
 * Classe de alto nível que aplica o princípio DIP:
 * depende apenas das interfaces Thermometer e Heater.
 */
public class Regulator {
    private final Thermometer thermometer;
    private final Heater heater;

    public Regulator(Thermometer thermometer, Heater heater) {
        this.thermometer = thermometer;
        this.heater = heater;
    }

    public void regulate(double minTemp, double maxTemp) {
        double currentTemp = thermometer.read();
        System.out.println("Temperatura atual: " + currentTemp + "°C");

        if (currentTemp < minTemp) {
            heater.engage();
        } else if (currentTemp > maxTemp) {
            heater.disengage();
        } else {
            System.out.println("Temperatura estável, nenhuma ação necessária.");
        }
    }
}

