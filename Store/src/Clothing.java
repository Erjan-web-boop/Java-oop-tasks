class Clothing extends Product implements Discountable {

    private double size;
    private String category;

    public Clothing(String name, double price, double size, String category) {
        super(name, price);
        this.size = size;
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void applyDiscount(double percent) {
        double newPrice = getPrice() - getPrice() * percent / 100;
        setPrice(newPrice);
    }
}