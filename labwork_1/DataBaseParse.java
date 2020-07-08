package by.epamtc.labwork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseParse {

    public List<Appliance> findAppliance(String name, String characteristic, String valueOfCharacteristic) throws IOException {
        List<Appliance> appliances = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("C:\\Users\\User\\Downloads\\Telegram Desktop\\appliances_db.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(name) && line.contains(characteristic + "=" + valueOfCharacteristic)) {
                    appliances.add(createAppliance(line, name));
                }
            }
        }
        return appliances;
    }

    private Appliance createAppliance(String line, String name) {
        Map<String, String> characteristics = createCharacteristics(line);

       return switch (name) {
            case "Oven" -> new Oven(characteristics);
            case "Laptop" -> new Laptop(characteristics);
            case "Refrigerator" -> new Refrigerator(characteristics);
            case "VacuumCleaner" -> new VacuumCleaner(characteristics);
            case "TabletPC" -> new TabletPC(characteristics);
            case "Speakers" -> new Speakers(characteristics);
            default -> null;
        }
    }

    private Map<String, String> createCharacteristics(String line) {
        Map<String, String> characteristics = new HashMap<>();
        String lineCharacteristics = line.replaceAll(".*: ", "").trim();

        for (String characteristicsPair : lineCharacteristics.split(",")) {
            String key = characteristicsPair.replaceAll("=.*", "").trim();
            String value = characteristicsPair.replaceAll(".*=", "").trim();
            characteristics.put(key, value);
        }
        return characteristics;
    }
}
