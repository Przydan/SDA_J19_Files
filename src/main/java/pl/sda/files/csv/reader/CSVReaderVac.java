package pl.sda.files.csv.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderVac {
    public List<VacationsPlans> read(String filePath) {
        List<VacationsPlans> result = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            //TODO: podział kolejnosci kolumn i ich nagłowki
            String headerRow = bufferedReader.readLine();
            String[] headers = headerRow.split(";");

            String record;
            while ((record = bufferedReader.readLine()) != null) {
                String[] tokens = record.split(";");

             //   VacationsPlans plan = createPlan(headers, tokens);

                //result.add(plan);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
//
//    private VacationsPlans createPlan(String[] headers, String[] tokens) {
//        VacationsPlans plans = new VacationsPlans();
//
//        //TODO: połaczenie headerów z tokenami (skojarzenie ich razem)
//        for (int i = 0; i < headers.length; i++) {
//            if ("Country".equals(headers[i])) {
//                plans.getCountry(tokens[i]);
//            }
//            if ("lastName".equals(headers[i])) {
//                person.setLastName(tokens[i]);
//            }
//            if ("age".equals(headers[i])) {
//                person.setAge(Integer.parseInt(tokens[i]));
//            }
//            if ("sex".equals(headers[i])) {
//                person.setSex(Sex.valueOf(tokens[i].toUpperCase()));
//            }
//            if ("salary".equals(headers[i])) {
//                person.setSalary(Double.parseDouble(tokens[i]));
//            }
//        }
//        return person;
//    }
}
