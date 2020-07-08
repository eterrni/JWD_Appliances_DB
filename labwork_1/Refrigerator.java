package by.epamtc.labwork_1;

import java.util.Map;

public class Refrigerator {

    private double POWER_CONSUMPTION;
    private double WEIGHT;
    private double FREEZER_CAPACITY;
    private double OVERALL_CAPACITY;
    private double HEIGHT;
    private double WIDTH;

    public Refrigerator(double POWER_CONSUMPTION, double WEIGHT, double FREEZER_CAPACITY, double OVERALL_CAPACITY, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public Refrigerator(Map<String, String> characteristics) {
        POWER_CONSUMPTION = Double.parseDouble(characteristics.get("POWER_CONSUMPTION"));
        WEIGHT = Double.parseDouble(characteristics.get("WEIGHT"));
        FREEZER_CAPACITY = Double.parseDouble(characteristics.get("FREEZER_CAPACITY"));
        OVERALL_CAPACITY = Double.parseDouble(characteristics.get("OVERALL_CAPACITY"));
        HEIGHT = Double.parseDouble(characteristics.get("HEIGHT"));
        WIDTH = Double.parseDouble(characteristics.get("WIDTH"));
    }

    @Override
    public String toString() {
        return "Refrigerator : " +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH;
    }
}
