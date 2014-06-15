package com.it.weekend.groovy;

public class HelloJavaWorld {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello" + getName();
    }

    public static void main(String[] args) {
        HelloJavaWorld hello = new HelloJavaWorld();
        hello.setName("Java");
        System.out.println(hello.greet());
    }
}
