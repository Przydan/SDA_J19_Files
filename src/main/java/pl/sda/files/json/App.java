package pl.sda.files.json;

import javax.naming.NamingEnumeration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class App {
    public static void main(String[] args) throws IOException {
        JSONReader jsonReader = new JSONReader();
        Person persons = jsonReader.read("C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\person.json");

        JSONWriter jsonWriter = new JSONWriter();
        jsonWriter.write(persons, "C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\" +
                "java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\writedJSON.json");

        JsonAltWriter jsonAltWriter = new JsonAltWriter();
        jsonAltWriter.write(persons, "C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\" +
                "java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\writedALtJSON.json");

        int a = 0;

    }
}
