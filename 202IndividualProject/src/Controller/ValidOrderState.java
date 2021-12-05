package Controller;


import Model.InputModel;
import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ValidOrderState implements OrderState{
    @Override
    public void next(Order o) {
        o.setState(new billingState());

    }

    @Override
    public void prev(Order o) {
        o.setState(new InValidOrderState());

    }

    @Override
    public void printStatus() {
        System.out.println("Inside valid order state");
    }

    @Override
    public void processOrder(ArrayList<InputModel> p, HashMap<String, Product> map, Set<String> set, String out, String cp) {
        System.out.println("Will process order inside billing");


    }
}
