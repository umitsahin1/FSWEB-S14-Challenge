package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    private double totalPrice;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.totalPrice = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        this.totalPrice += price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        this.totalPrice += price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        this.totalPrice += price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        this.totalPrice += price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println(this.name + " hamburger " + this.breadRollType + " ekmeğiyle sunuluyor.");
        System.out.println("Meat: " + this.meat);
        System.out.println("Price: $" + this.price);

        if (this.addition1Name != null) {
            totalPrice += this.addition1Price;
            System.out.println(this.addition1Name + ": $" + this.addition1Price);
        }
        if (this.addition2Name != null) {
            totalPrice += this.addition2Price;
            System.out.println(this.addition2Name + ": $" + this.addition2Price);
        }
        if (this.addition3Name != null) {
            totalPrice += this.addition3Price;
            System.out.println(this.addition3Name + ": $" + this.addition3Price);
        }
        if (this.addition4Name != null) {
            totalPrice += this.addition4Price;
            System.out.println(this.addition4Name + ": $" + this.addition4Price);
        }
        System.out.println("Total Price: $" + totalPrice);
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return totalPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
}
