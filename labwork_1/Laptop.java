package by.epamtc.labwork_1;

import java.util.Map;

public class Laptop extends Appliance {

    private double BATTERY_CAPACITY;
    private String OS;
    private double MEMORY_ROM;
    private double SYSTEM_MEMORY;
    private double CPU;
    private double DISPLAY_INCHS;

    public Laptop(double BATTERY_CAPACITY, String OS, double MEMORY_ROM, double SYSTEM_MEMORY, double CPU, double DISPLAY_INCHS) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    public Laptop(Map<String, String> characteristics) {
        BATTERY_CAPACITY = Double.parseDouble(characteristics.get("BATTERY_CAPACITY"));
        OS = characteristics.get("OS");
        MEMORY_ROM = Double.parseDouble(characteristics.get("MEMORY_ROM"));
        SYSTEM_MEMORY = Double.parseDouble(characteristics.get("SYSTEM_MEMORY"));
        CPU = Double.parseDouble(characteristics.get("CPU"));
        DISPLAY_INCHS = Double.parseDouble(characteristics.get("DISPLAY_INCHS"));
    }

    @Override
    public String toString() {
        return "Laptop : " +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", OS=" + OS +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS;
    }
}
