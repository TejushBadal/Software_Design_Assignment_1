package src;
// Product.java
public abstract class Product {
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getName();
}