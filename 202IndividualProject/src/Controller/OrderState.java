package Controller;


import Model.InputModel;
import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public interface OrderState {

    void next(Order o);
    void prev(Order o);
    void printStatus();
    void processOrder(ArrayList<InputModel> p, HashMap<String, Product> map, Set<String> hashSet, String out, String cp);

}
