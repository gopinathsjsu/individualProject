package Controller;
import Model.InputModel;
import Model.Product;

import java.io.*;
import java.util.*;

public class ReadWriteFacade implements ReadWriteFacadeI {

    HashMap<String, Product> map;
    Set<String> hashSet;
    public ReadWriteFacade(){
        this.map = new HashMap<>();
        this.hashSet = new HashSet<>();

    }


    @Override
    public HashMap<String, Product> initializeMap(String path) {
        ArrayList<String []>  f;
        ReadFromCsv r = new ReadFromCsv();

        f  = r.readCsvFile(path);

        for(int i = 0; i< f.size(); i ++){
            String[] ele  = f.get(i);
            Product p = new Product(ele[0], ele[1], Integer.parseInt(ele[2]), Double.parseDouble(ele[3]));
            this.map.put(p.getProductName(), p);;

        }


//        try {
//            String splitBy = ",";
//            String line = "";
//            int count = 0;
//            BufferedReader br = new BufferedReader(new FileReader("C:\\socket\\202IndividualProject\\src\\Resources\\Dataset.csv"));
//            while ((line = br.readLine()) != null)   //returns a Boolean value
//            {
//
//                if(count > 0){
//                    String[]  product = line.split(splitBy);    // use comma as separator
//                    Product p = new Product(product[0], product[1], Integer.parseInt(product[2]), Double.parseDouble(product[3]));
//                    this.map.put(p.getProductName(), p);
//                }
//                count += 1;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
        return this.map;

    }

    @Override
    public ArrayList<InputModel> readInputFromCsv(String path){
        ArrayList<InputModel> arr = new ArrayList<>();
        ArrayList<String []>  f;
        ReadFromCsv r = new ReadFromCsv();

        f  = r.readCsvFile(path);

        for(int i = 0; i< f.size(); i ++){
            String[] ele  = f.get(i);
            InputModel in = new InputModel(ele[0], Integer.parseInt(ele[1]), ele[2]);
            arr.add(in);

        }



//        try {
//            String splitBy = ",";
//            String line = "";
//            int count = 0;
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            while ((line = br.readLine()) != null)
//            {
//
//                if(count > 0){
//                    String[]  product = line.split(splitBy);
//                    InputModel i = new InputModel(product[0], Integer.parseInt(product[1]), product[2]);
//                    arr.add(i);
//                }
//                count += 1;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
        return arr;

    }

    @Override
    public Set<String> readCards(String path){

        ArrayList<String []>  f;
        ReadFromCsv r = new ReadFromCsv();

        f  = r.readCsvFile(path);

        for(int i = 0; i< f.size(); i ++){
            String[] ele  = f.get(i);
            String in = ele[0];
            this.hashSet.add(in);

        }

        return this.hashSet;

    }

    @Override
    public void writeToCsv(String path, ArrayList<String> arr) {
        WriteToCsv w = new WriteToCsv();
        w.WriteToCsv(path, arr);

    }

    @Override
    public void appendToCsv(String path, ArrayList<String> arr) {
        WriteToCsv w = new WriteToCsv();
        w.appendToCsv(path, arr);

    }

}
