public class Books extends ProductForSale{

    public Books(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This book is of " + type +" type and has a price of " + price);
        System.out.println(description);
    }
}
