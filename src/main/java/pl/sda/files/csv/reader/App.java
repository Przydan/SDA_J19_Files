package pl.sda.files.csv.reader;

import java.util.ArrayList;
import java.util.List;

class App {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();
        CSVReaderVac csvReaderVac = new CSVReaderVac();

        List<VacationsPlans> vacationsPlans = new ArrayList<>();
        List<Person> personList = csvReader.read("C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\persons.csv");




        int a = 0;
    }
}
