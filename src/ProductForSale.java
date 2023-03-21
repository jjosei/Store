public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public double getPrice(int qty){
        return (price * qty);
    }

    public void pricedLineItem(int qty) {
        System.out.println("Quantity " + qty + " Price: " + getPrice(qty));
    }

    public void printPricedItem2(int qty) {

        System.out.printf("%2d qty at $%8.2f each,  %-15s %-35s %n",
                qty, price, type, description);
    }

    public abstract void showDetails();
}
