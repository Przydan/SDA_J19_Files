package pl.sda.files.simple;

class App {
     public static void main(String[] args) {
        SimpleFileReader reader = new SimpleFileReader();
        reader.readFile("C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\simple.txt");

        SimpleFileWriter writer = new SimpleFileWriter();
        writer.write("Moja zawartość", "C:\\Users\\Dell\\Documents\\IntelllyJ - projects\\mediumLevCode_22.09\\java_28-29.09\\SDA_J19_Equations\\SDA_J19_Files\\src\\main\\resources\\simpleWrite.txt" );
    }
}
