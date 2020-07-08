package by.epamtc.labwork_1;

import java.util.Map;

public class Oven {
    private double POWER_CONSUMPTION;
    private double WEIGHT;
    private double CAPACITY;
    private double DEPTH;
    private double HEIGHT;
    private double WIDTH;

    public Oven(double POWER_CONSUMPTION, double WEIGHT, double CAPACITY, double DEPTH, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.CAPACITY = CAPACITY;
        this.DEPTH = DEPTH;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public Oven(Map<String, String> characteristics) {
        POWER_CONSUMPTION = Double.parseDouble(characteristics.get("POWER_CONSUMPTION"));
        WEIGHT = Double.parseDouble(characteristics.get("WEIGHT"));
        CAPACITY = Double.parseDouble(characteristics.get("CAPACITY"));
        DEPTH = Double.parseDouble(characteristics.get("DEPTH"));
        HEIGHT = Double.parseDouble(characteristics.get("HEIGHT"));
        WIDTH = Double.parseDouble(characteristics.get("WIDTH"));
    }

    @Override
    public String toString() {
        return "Oven : " +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH;
    }
}
