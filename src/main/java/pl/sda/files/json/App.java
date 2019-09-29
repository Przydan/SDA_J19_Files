package pl.sda.files.json;

import pl.sda.files.csv.reader.Person;

import javax.naming.NamingEnumeration;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        JSONWriter jsonWriter = new JSONWriter();

        jsonWriter.write(persons, "C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\writeJSON.json");


    }
}
