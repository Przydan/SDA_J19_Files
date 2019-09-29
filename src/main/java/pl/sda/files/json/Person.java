package pl.sda.files.json;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Person {
    private String name;
    private String lastName;
    private int age;
    private Double salary;
    private Address address;

}
