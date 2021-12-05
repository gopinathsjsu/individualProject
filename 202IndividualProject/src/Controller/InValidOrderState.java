package Controller;

import Model.InputModel;
import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class InValidOrderState implements OrderState{
    @Override
    public void next(Order o) {
        System.out.println("inside failure");

    }

    @Override
    public void prev(Order o) {
        System.out.println("inside failure");

    }

    @Override
    public void printStatus() {

    }

    @Override
    public void processOrder(ArrayList<InputModel> items, HashMap<String, Product> map, Set<String> set, String out, String cp) {
        ReadWriteFacade r = new ReadWriteFacade();
        final int luxury = 3;
        final int essentials = 5;
        final int misc = 6;

        int essentialsCount = 0;
        int miscCount = 0;
        int luxuryCount = 0;
        ArrayList<String> ans = new ArrayList<>();
        ans.add("incorrect");


        for(int i =0; i< items.size(); i++){
            InputModel item = items.get(i);

            if (map.get(item.getItem()).getCategory().equalsIgnoreCase("essential")){
                essentialsCount += item.getQuantity();

            }else if(map.get(item.getItem()).getCategory().equalsIgnoreCase("luxury")){
                System.out.println("inside luxury");
                luxuryCount += item.getQuantity();
            }else{
                miscCount += item.getQuantity();
            }

            if(!map.containsKey(items.get(i).getItem()))
                ans.add(items.get(i).getItem() + " Item not present");
            else if(map.get(items.get(i).getItem()).getQuantity() < items.get(i).getQuantity())
            {
                ans.add(items.get(i).getItem() + " quantity of items not present");
            }
            else if((miscCount > luxury && map.get(item.getItem()).getCategory().equalsIgnoreCase("misc"))) {
                ans.add(items.get(i).getItem() + " exceeded misc cap");
            }else if( (luxuryCount > misc && map.get(item.getItem()).getCategory().equalsIgnoreCase("luxury")))
            {
                ans.add(items.get(i).getItem() + " exceeded luxury cap");
            }
            else if (essentialsCount > essentials && map.get(item.getItem()).getCategory().equalsIgnoreCase("essential") )
            {
                ans.add(items.get(i).getItem() + " exceeded essential cap");
            }



            //System.out.println(map.get(item.getItem()).getCategory().toLowerCase());
            r.writeToCsv(out, ans);

        }






    }
}
