package pl.mlopatka.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Inner {

    private String name;
    private Integer age;
    private Type type;

    public Inner() {
    }

    public Inner(String name, Integer age, Type type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @JsonSetter("type")
    public void setType(String type) {
        this.type = Type.valueOf(type.toUpperCase());
    }

    @Override
    public String toString() {
        return "Inner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}
