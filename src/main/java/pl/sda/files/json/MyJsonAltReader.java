package pl.sda.files.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


class MyJsonAltReader {
    MyPC read(String filePath) throws IOException {
        MyPC myPC = new MyPC();

            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            String content = new String(bytes, "UTF-8");

            ObjectMapper objectMapper = new ObjectMapper();
            MyPC result = objectMapper.readValue(content, MyPC.class);

            return result;
    }
}
