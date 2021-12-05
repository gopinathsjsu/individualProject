package Controller;

import Model.InputModel;
import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public interface ReadWriteFacadeI {

    public HashMap<String, Product> initializeMap(String path);

    public void writeToCsv(String path, ArrayList<String> arr);

    public void appendToCsv(String path, ArrayList<String> arr);

    public ArrayList<InputModel> readInputFromCsv(String path);

    public Set<String> readCards(String path);

}
