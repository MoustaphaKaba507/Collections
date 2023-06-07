package be.intecbrussel;

import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorter;
    private String[] foodProducts={"Apple", "Steak","Potatoes","Salad","Pear"};
    private String[] healthProducts={"Face cream","Vitamins","Eye drops","Toothpaste","Shampoo"};
    private String[] electricProducts={"Hair dryer","Vacuum","Mixer","Washing machine","Dishwasher"};
    //Constructor
    public ProductFactory(ProductSorter productSorter){
        this.productSorter =productSorter;

    }
    //Method
    public void createProducts(int amount){
        Random random = new Random();

        for(int i=0; i < amount; i++){

        int productType = random.nextInt(3);
        String productName;


        switch(productType){
            case 0:
                productName =foodProducts[random.nextInt(foodProducts.length)];
                productSorter.sortProducts(new FoodProduct(productName,random.nextInt(151)));
                break;
            case 1:
                productName=healthProducts[random.nextInt(healthProducts.length)];
                productSorter.sortProducts(new HealthProduct(productName, random.nextInt(151)));
                break;
            case 2:
                productName=electricProducts[random.nextInt(electricProducts.length)];
                productSorter.sortProducts(new ElectricProduct(productName, random.nextInt(151)));
                break;
            default:
                productName="";
                break;

        }
    }


}

}


