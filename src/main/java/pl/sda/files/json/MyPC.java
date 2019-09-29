package pl.sda.files.json;

import lombok.Data;

@Data
class MyPC {
    private String projectName;
    private String cpu;
    private String ram;
    private String mob;
    private String gpu;
    private String psu;
    private String mem;
    private Soft soft;

}
