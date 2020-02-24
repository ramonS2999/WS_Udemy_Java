package entities;

/**
 * Product
 */
public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totelValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity = this.quantity + quantity;
    }

    public void removeProducts(int quantity){
        this.quantity = this.quantity - quantity;
    }

    public String toString(){
        return name
            +", $ "
            +String.format("%.2f", price)
            +", "
            +quantity
            +" units, Total: $ "
            +String.format("%.2f", totelValueInStock());
    }
}