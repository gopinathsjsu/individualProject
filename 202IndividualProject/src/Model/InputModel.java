package Model;

public class InputModel {

    String item;
    int quantity;
    String cardNum;

    public InputModel(String item, int quantity, String cardNum ){
        this.item = item;
        this.quantity = quantity;
        this.cardNum = cardNum;

    }

    public String getItem(){
        return this.item;
    }

    public void setItem(String item){
        this.item = item;

    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setCardNum(String cardNum){
        this.cardNum = cardNum;

    }

    public String getCardNum(){
        return this.cardNum;
    }

}
