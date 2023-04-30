package Classes;

public class Laptop {
    

    public String model;
    public String os;
    public String brand;
    public String color;
    public int RAM;
    public int HDD;

    public Laptop(String brand, String model, String os, String color, int RAM, int HDD) {
        this.model = model;
        this.os = os;
        this.brand = brand;
        this.color = color;
        this.RAM = RAM;
        this.HDD = HDD;
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int ram) {
        RAM = ram;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int hDD) {
        HDD = hDD;
    }
    
    public void printInfo(){
        System.out.println("Brand - " + brand);
        System.out.println("Model - " + model);
        System.out.println("OS - " + os);
        System.out.println("color - " + color);
        System.out.println("RAM - " + RAM);
        System.out.println("HDD - " + HDD);
        System.out.println();
    }

}
