package pl.sda.files.json;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


class MyJsonReader {
    MyPC read(String filePath) {
        MyPC result = new MyPC();

        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            String content = new String(bytes, "UTF-8");

            JSONObject object = new JSONObject(content);
            String projectName = object.getString("projectName");
            String CPU = object.getString("cpu");
            String RAM = object.getString("ram");
            String MOB = object.getString("mob");
            String GPU = object.getString("gpu");
            String PSU = object.getString("psu");
            String MEM = object.getString("mem");

            Object SOFTObject = object.get("soft");
            JSONObject SOFT = new JSONObject(SOFTObject.toString());
            String SYS1 = SOFT.getString("sys1");
            String SYS2 = SOFT.getString("sys2");

            result.setProjectName(projectName);
            result.setCpu(CPU);
            result.setGpu(GPU);
            result.setRam(RAM);
            result.setMob(MOB);
            result.setPsu(PSU);
            result.setMem(MEM);

            Soft soft = new Soft();
            soft.setSys1(SYS1);
            soft.setSys2(SYS2);

            result.setSoft(soft);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
