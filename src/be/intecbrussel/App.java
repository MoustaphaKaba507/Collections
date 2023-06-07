package be.intecbrussel;

public class App {
    public static void main(String[] args) {
        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);

        //Create 100 random products
        productFactory.createProducts(100);

        //Get the sorted product lists
        System.out.println("All Products:");
        System.out.println(productSorter.getProducts());
        System.out.println();

        System.out.println("Food Products: ");
        System.out.println(productSorter.getFoodProducts());
        System.out.println();

        System.out.println("Health Products: ");
        System.out.println(productSorter.getHealthProduct());
        System.out.println();

        System.out.println("Electric Products: ");
        System.out.println(productSorter.getElectricProduct());
        System.out.println();

        //get the total product amount
        System.out.println("Total Products: "+productSorter.getProductCount());

    }
}
