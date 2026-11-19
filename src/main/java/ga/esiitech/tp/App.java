package ga.esiitech.tp;

import com.google.gson.Gson;   // nouveau

import java.util.ArrayList;
import java.util.List;

public class App {

    public double calculeValeurStock(List<Product> produit){
        double total =0;
        for (Product p: produit){
            total+=p.getPrice()*p.getQuantity();
        }
        return total;
    }

    void main(String[] args) {
        Product clavier = new Product("Clavier", 15000, 3);
        IO.println(clavier);
        IO.println("Valeur du stock : " + clavier.getStockValue() + " FCFA");

        Product souris = new Product("Souris", 5000, 10);
        IO.println(souris);
        IO.println("Valeur du stock : "+souris.getStockValue()+" FCFA");

        List<Product> products = new ArrayList<>();
        products.add(clavier);
        products.add(souris);
        IO.println("Valeur totale du stock: "+calculeValeurStock(products)+" FCFA");

        Gson gson = new Gson();                         // nouveau
        String json = gson.toJson(clavier);             // nouveau
        IO.println("En JSON : " + json);        // nouveau
    }
}

