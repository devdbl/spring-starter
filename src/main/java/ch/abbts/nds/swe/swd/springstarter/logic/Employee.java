package ch.abbts.nds.swe.swd.springstarter.logic;

public class Employee {
    private Integer age;
    private String name;

    public Employee(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOfAge(Integer age) {
        return this.age > age;
    }
}