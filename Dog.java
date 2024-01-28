package com.javabuddy.springbootredisexample.model;

/**
 * @author Kishan
 */
public class Dog {

    private String name;
    private String gender;
    private String breed;
    private double price;

    public Dog(DogBuilder builder) {
        this.name = builder.getName();
        this.gender = builder.getGender();
        this.breed = builder.getBreed();
        this.price = builder.getPrice();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }
}

class DogBuilder{
    private String name;
    private String gender;
    private String breed;
    private double price;

    public DogBuilder() {
    }

    public String getName() {
        return name;
    }

    public DogBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public DogBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getBreed() {
        return breed;
    }

    public DogBuilder setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public DogBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Dog build(){
        return new Dog(this);
    }
}

class DogDriver{
    public static void main(String[] args) {
        Dog d = new DogBuilder().setBreed("Doberman").setPrice(1000).setGender("Male").setName("Bruno").build();
        System.out.println(d);
    }
}
/*
Notes:
#1: Used when we have lots of instance variable of the class and we dont want many combinations of the consturctors.
#2: As an owner of the class, I dont want end users to remember sequence of the variables in consturctor
#3: Once the object is created few fields I can decide not to set afterwords.
*/
