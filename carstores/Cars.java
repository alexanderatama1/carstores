/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse1iox.carstores;

/**
 *
 * @author alexa
 */
public class Cars {
    // fields/instance variables
    private String manufacturer;
    private int year;
    private String color;
    private float price;
    private float mileage;

    //Constructors
    public Cars(String manufacturer, int year, String color, float price, float mileage) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
    }

    // Accessors/Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public float getMileage() {
        return mileage;
    }

    // Accessors/Setters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    
    
}
