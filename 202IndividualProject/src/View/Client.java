package View;

import Controller.ReadWriteFacade;
import Model.InputModel;
import Model.Product;
import  Controller.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

public class Client {



    public static void main(String args[]){

        final int luxury = 3;
        final int essentials = 5;
        final int misc = 6;

        Order o = new Order();
        HashMap<String, Product> map;
        ArrayList<InputModel> arr;
        Set<String> hashSet;

        ReadWriteFacade r = new ReadWriteFacade();
        map = r.initializeMap(args[0]);
        hashSet =  r.readCards(args[1]);

        arr = r.readInputFromCsv(args[2]);


        int luxuryCount = 0;
        int essentialsCount = 0;
        int miscCount = 0;
        int i = 0;
        while(i < arr.size()){

            InputModel item = arr.get(i);

            if(!map.containsKey(item.getItem())){
                o.previousState();
                //o.getState().processOrder(arr, map, hashSet, "C:\\socket\\202IndividualProject\\src\\Output\\out.csv");
                break;
            }


            //check map contains the required amt
            if (map.get(item.getItem()).getQuantity() < item.getQuantity()){
                o.previousState();
                //o.getState().processOrder(arr, map, hashSet);
                break;
            }

            //check if the item category threshold are met
            if (map.get(item.getItem()).getCategory().equalsIgnoreCase("essential")){
                essentialsCount += item.getQuantity();

            }else if(map.get(item.getItem()).getCategory().equalsIgnoreCase("luxury")){
                luxuryCount += item.getQuantity();
            }else{
                miscCount += item.getQuantity();
            }

            //chek if the thresholds are met

            if(luxuryCount > luxury || miscCount > misc || essentialsCount > essentials){
                System.out.println("entered cap ");
                o.previousState();
                //o.getState().processOrder(arr, map, hashSet);
                break;
            }

            i += 1;
        }

        if(i == arr.size()) {
            o.nextState(); // moving to billing state
        }
        o.getState().processOrder(arr, map, hashSet, args[3], args[1]);  //generating bill or generate error


    }


}
