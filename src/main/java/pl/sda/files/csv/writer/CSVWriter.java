package pl.sda.files.csv.writer;

import pl.sda.files.csv.reader.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class CSVWriter {
    void write(List<Person> persons, String filePath) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {

            String headerRow = "name;lastName;Age;Sex;Salary";
            bufferedWriter.write(headerRow);
            bufferedWriter.newLine();

            StringBuilder stringBuilder = new StringBuilder();
            for (Person person : persons) {
                stringBuilder.setLength(0);
                stringBuilder.append(person.getName()).append(";")
                        .append(person.getLastName()).append(";")
                        .append(person.getAge()).append(";")
                        .append(person.getSex()).append(';')
                        .append(person.getSalary());
                bufferedWriter.write(stringBuilder.toString());

                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
