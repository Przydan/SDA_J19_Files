package pl.sda.files.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class MyJsonAltWriter {
    void write(MyPC myPC, String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String content = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(myPC);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            writer.flush();
        }
    }
}
