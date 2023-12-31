package services;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IDDBBManager {
    ArrayList<Product> getAllBBDD();
    void updateDDBB(List<Product> products);
    //boolean existProductId(int id);
    void addProduct(List<Product> products);
    void removeProduct(List<Integer> idProducts);
    int nextIdBBDD();
}
