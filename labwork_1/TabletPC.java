package by.epamtc.labwork_1;

import java.util.Map;

public class TabletPC {

    private double BATTERY_CAPACITY;
    private double DISPLAY_INCHES;
    private double MEMORY_ROM;
    private double FLASH_MEMORY_CAPACITY;
    private String COLOR;

    public TabletPC(double BATTERY_CAPACITY, double DISPLAY_INCHES, double MEMORY_ROM, double FLASH_MEMORY_CAPACITY, String COLOR) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
        this.MEMORY_ROM = MEMORY_ROM;
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
        this.COLOR = COLOR;
    }

    public TabletPC(Map<String, String> characteristics) {
        BATTERY_CAPACITY = Double.parseDouble(characteristics.get("BATTERY_CAPACITY"));
        DISPLAY_INCHES = Double.parseDouble(characteristics.get("DISPLAY_INCHES"));
        MEMORY_ROM = Double.parseDouble(characteristics.get("MEMORY_ROM"));
        FLASH_MEMORY_CAPACITY = Double.parseDouble(characteristics.get("FLASH_MEMORY_CAPACITY"));
        COLOR = characteristics.get("COLOR");
    }


    @Override
    public String toString() {
        return "TabletPC : " +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", DISPLAY_INCHES=" + DISPLAY_INCHES +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", FLASH_MEMORY_CAPACITY=" + FLASH_MEMORY_CAPACITY +
                ", COLOR=" + COLOR;
    }
}
