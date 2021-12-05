package Controller;

import Model.InputModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromCsv {


    public ReadFromCsv(){



    }

    public ArrayList<String []> readCsvFile(String path){

        ArrayList<String []> arr = new ArrayList<>();

        try {
            String splitBy = ",";
            String line = "";
            int count = 0;
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null)
            {

                if(count > 0){
                    String[]  input = line.split(splitBy);
                    //InputModel i = new InputModel(product[0], Integer.parseInt(product[1]), product[2]);
                    arr.add(input);
                }
                count += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;

    }


}
