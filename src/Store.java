import java.util.ArrayList;

public class Store{
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void listProducts(){
        for(var p : storeProducts){
            System.out.println("/".repeat(30));
            p.showDetails();
        }
    }

    public static void main(String[] args) {
        storeProducts.add(new Books("Hardcover", 3.4, "Has a really hard front and back cover."));
        storeProducts.add(new Books("E-book", 8.0, "Available on the web and easily accessible"));
        storeProducts.add(new Books("~Empty~", 0.0, "No book selected"));
        listProducts();
  }
}
