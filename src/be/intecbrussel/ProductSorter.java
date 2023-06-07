package be.intecbrussel;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {

   List<Product> products;
   List<FoodProduct> foodProductList;
   List<HealthProduct> healthProductList;
   List<ElectricProduct> electricProductList;

   //Construtor
public ProductSorter(){

   products = new ArrayList<>();
   foodProductList =new ArrayList<>();
   healthProductList = new ArrayList<>();
   electricProductList = new ArrayList<>();
}

   //Getters

   public  List<Product> getProducts(){
   return products;
   }
   public List<FoodProduct>  getFoodProducts(){
      return foodProductList;
   }
   public List<HealthProduct> getHealthProduct(){
   return healthProductList;

   }
   public List<ElectricProduct> getElectricProduct(){
   return electricProductList;
   }
   public int getProductCount(){
   return products.size();

   }
   //method
   public void sortProducts(Product product){
   products.add(product);

   if(product instanceof FoodProduct){
      foodProductList.add((FoodProduct) product);
   }else if(product instanceof HealthProduct){
      healthProductList.add((HealthProduct) product);
   }else{
      electricProductList.add((ElectricProduct) product);





   }

   }







}
