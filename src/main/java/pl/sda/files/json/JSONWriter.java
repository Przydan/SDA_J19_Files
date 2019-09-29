package pl.sda.files.json;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class JSONWriter {

    void write (Person person, String filePath) {
        String content = personsToJSON(person);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String personsToJSON(Person person) {
        JSONObject jsonToSave = new JSONObject();

        //TODO: rzeźba z tworzeniem linkedHashMapy w clasie JSONObject
        // by kolejność kluczy w JSON nie była podyktowana kolejnością hashy

        jsonToSave.put("name", person.getName());
        jsonToSave.put("lastName", person.getLastName());
        jsonToSave.put("age", person.getAge());
        jsonToSave.put("salary", person.getSalary());

        JSONObject address = new JSONObject();
        address.put("city", person.getAddress().getCity());
        address.put("street", person.getAddress().getStreet());
        address.put("postalCode", person.getAddress().getPostalCode());

        jsonToSave.put("address", address);

        return jsonToSave.toString(2);
    }
}
