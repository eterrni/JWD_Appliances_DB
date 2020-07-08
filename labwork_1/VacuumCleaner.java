package by.epamtc.labwork_1;

import java.util.Map;

public class VacuumCleaner {
    private double POWER_CONSUMPTION;
    private String FILTER_TYPE;
    private String BAG_TYPE;
    private String WAND_TYPE;
    private double MOTOR_SPEED_REGULATION;
    private double CLEANING_WIDTH;

    public VacuumCleaner(double POWER_CONSUMPTION, String FILTER_TYPE, String BAG_TYPE, String WAND_TYPE, double MOTOR_SPEED_REGULATION, double CLEANING_WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
    }

    public VacuumCleaner(Map<String, String> characteristics) {
        POWER_CONSUMPTION = Double.parseDouble(characteristics.get("POWER_CONSUMPTION"));
        FILTER_TYPE = characteristics.get("FILTER_TYPE");
        BAG_TYPE = characteristics.get("BAG_TYPE");
        WAND_TYPE = characteristics.get("WAND_TYPE");
        MOTOR_SPEED_REGULATION = Double.parseDouble(characteristics.get("MOTOR_SPEED_REGULATION"));
        CLEANING_WIDTH = Double.parseDouble(characteristics.get("CLEANING_WIDTH"));
    }


    @Override
    public String toString() {
        return "VacuumCleaner : " +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", FILTER_TYPE=" + FILTER_TYPE +
                ", BAG_TYPE=" + BAG_TYPE +
                ", WAND_TYPE=" + WAND_TYPE +
                ", MOTOR_SPEED_REGULATION=" + MOTOR_SPEED_REGULATION +
                ", CLEANING_WIDTH=" + CLEANING_WIDTH;
    }
}
