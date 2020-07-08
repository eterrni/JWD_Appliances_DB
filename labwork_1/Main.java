package by.epamtc.labwork_1;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        DataBaseParse parse = new DataBaseParse();

        List<Appliance> appliances;
        appliances=parse.findAppliance("Laptop","MEMORY_ROM","8000");
        for(Appliance x: appliances){
            System.out.println(x);
        }
    }
}
