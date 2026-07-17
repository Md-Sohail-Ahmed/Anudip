package com.aggregation;

class Bike{
    private String brand;
    private int mileage;

    public Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }
}

class Book{
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}

class Heart{
    private int weight;
    private int bpm;

    public Heart(int weight, int bpm) {
        this.weight = weight;
        this.bpm = bpm;
    }

    public int getWeight() {
        return weight;
    }

    public int getBpm() {
        return bpm;
    }
}

class Brain{
    private int weight;
    private String color;

    public Brain(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor(){
        return color;
    }
}

class Student{
    Heart h=new Heart(300,80);
    Brain b=new Brain(700,"pink");

    void hasBike(Bike bike, Book book){
        System.out.println(bike.getBrand());
        System.out.println(bike.getMileage());

        System.out.println(book.getAuthor());
        System.out.println(book.getName());
    }
    void hasHeart(){
        System.out.println(h.getWeight());
        System.out.println(h.getBpm());
    }
    void hasBrain(){
        System.out.println(b.getColor());
        System.out.println(b.getWeight());
    }
}
public class Main {
    public static void main(String[] args) {
        Bike bike=new Bike("Honda",55);
        Book book=new Book("java","sohail");

        Student s=new Student();
        s.hasBike(bike,book);

        System.out.println("---------------------");
//        s=null;
        s.hasBrain();
        s.hasHeart();
    }
}
