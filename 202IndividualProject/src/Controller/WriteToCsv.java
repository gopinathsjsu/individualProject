package Controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;


public class WriteToCsv {

    public WriteToCsv(){

    }

    public void appendToCsv(String path, ArrayList<String> arr){

        try(PrintWriter writer = new PrintWriter(new FileOutputStream(
                new File(path),
                true /* append = true */))){

            System.out.println(path);
            for(int i =0 ; i< arr.size(); i++){
                System.out.println("Writing"+ arr.get(i));
                StringBuilder sb = new StringBuilder();
                sb.append(arr.get(i));
                writer.append(sb);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    public void WriteToCsv(String path, ArrayList<String> arr){

        try(PrintWriter writer = new PrintWriter(path)){

            System.out.println(path);
            for(int i =0 ; i< arr.size(); i++){
                System.out.println("Writing"+ arr.get(i));
                StringBuilder sb = new StringBuilder();
                sb.append(arr.get(i));
                writer.println(sb);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
