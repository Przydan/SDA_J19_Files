package pl.sda.files.csv.writer;


import pl.sda.files.csv.reader.CSVReader;
import pl.sda.files.csv.reader.Person;

import java.util.ArrayList;
import java.util.List;

class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        CSVReader csvReader = new CSVReader();
        CSVWriter csvWriter = new CSVWriter();

        List<Person> readPersons = csvReader.read("C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\persons.csv");

        csvWriter.write(readPersons, "C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\personsCSV.csv");


    }
}
