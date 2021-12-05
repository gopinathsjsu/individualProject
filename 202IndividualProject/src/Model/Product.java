package Model;

public class Product {

    String productName;
    double price;
    int quantity;
    String category;

    public Product(String category, String productName, int quantity, double price ){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setProductName(String productName){
        this.productName = productName;

    }

    public String getProductName(){
        return this.productName;

    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int num){
        this.quantity = quantity;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }

}
