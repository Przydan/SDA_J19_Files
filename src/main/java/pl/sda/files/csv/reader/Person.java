package pl.sda.files.csv.reader;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private Sex sex;
    private Double salary;


    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    void setSex(Sex sex) {
        this.sex = sex;
    }

    public Double getSalary() {
        return salary;
    }

    void setSalary(Double salary) {
        this.salary = salary;
    }
}

