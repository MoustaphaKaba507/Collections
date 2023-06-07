package be.intecbrussel;

public class Product {
    private String name;
    private int productID;

    //Constructor
   public Product(String name, int getProductID){
        this.name = name;
        this.productID = productID;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                '}';
    }
}

