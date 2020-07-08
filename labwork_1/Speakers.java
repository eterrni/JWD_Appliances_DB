package by.epamtc.labwork_1;

import java.util.Map;

public class Speakers {

    private double POWER_CONSUMPTION;
    private double NUMBER_OF_SPEAKERS;
    private double FREQUENCY_RANGE;
    private double CORD_LENGTH;

    public Speakers(double POWER_CONSUMPTION, double NUMBER_OF_SPEAKERS, double FREQUENCY_RANGE, double CORD_LENGTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
        this.CORD_LENGTH = CORD_LENGTH;
    }

    public Speakers(Map<String, String> characteristics) {
        POWER_CONSUMPTION = Double.parseDouble(characteristics.get("POWER_CONSUMPTION"));
        NUMBER_OF_SPEAKERS = Double.parseDouble(characteristics.get("NUMBER_OF_SPEAKERS"));
        FREQUENCY_RANGE = Double.parseDouble(characteristics.get("FREQUENCY_RANGE"));
        CORD_LENGTH = Double.parseDouble(characteristics.get("CORD_LENGTH"));
    }

    @Override
    public String toString() {
        return "Speakers : " +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", FREQUENCY_RANGE=" + FREQUENCY_RANGE +
                ", CORD_LENGTH=" + CORD_LENGTH;
    }
}
