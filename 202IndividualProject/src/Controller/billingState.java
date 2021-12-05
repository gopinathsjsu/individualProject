package Controller;

import Model.InputModel;
import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class billingState implements OrderState{
    @Override
    public void next(Order o) {
        System.out.println("this is the final state");

    }

    @Override
    public void prev(Order o) {
        System.out.println("this is the final state");

    }


    @Override
    public void printStatus() {
        System.out.println("This is the billing state");
    }

    @Override
    public void processOrder(ArrayList<InputModel> p, HashMap<String, Product> map, Set<String> set, String out, String cp) {

        ArrayList<String> outArr = new ArrayList<>();
        ReadWriteFacade r = new ReadWriteFacade();
        ArrayList<String> card = new ArrayList<>();
        double amount = 0;
        for(int i =0; i< p.size(); i++){
            amount += (map.get(p.get(i).getItem()).getPrice()) * p.get(i).getQuantity();
            if(!set.contains(p.get(i).getCardNum()))
            {

                set.add(p.get(i).getCardNum());
                card.add(p.get(i).getCardNum());
            }
        }
        System.out.println("writing card");
        r.appendToCsv(cp, card);
        outArr.add(Double.toString(amount));
        r.writeToCsv(out, outArr);





    }
}
