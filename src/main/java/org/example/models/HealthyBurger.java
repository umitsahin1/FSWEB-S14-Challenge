package org.example.models;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }


    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
            System.out.println(this.healthyExtra1Name + ": $" + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
            System.out.println(this.healthyExtra2Name + ": $" + this.healthyExtra2Price);
        }

        System.out.println("Toplam Fiyat (Healty Burger dahil): $" + totalPrice);
        return totalPrice;
    }

    @Override
    public double getPrice() {
        return itemizeHamburger();
    }
}
