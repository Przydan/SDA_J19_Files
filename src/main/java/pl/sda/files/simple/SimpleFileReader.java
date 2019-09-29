package pl.sda.files.simple;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class SimpleFileReader {
    void readFile(String filePath) {
        //TODO: try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    void readFile2( String filePathe) {
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try{
//            fileReader = new FileReader(filePathe);
//            bufferedReader = new BufferedReader(fileReader);
//            //TODO; czytanie pliku
//        } catch (Exception e ) {
//            //TODO: obługa wyjątku
//        }
//        finally {
//            try {
//                fileReader.close();
//                bufferedReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
