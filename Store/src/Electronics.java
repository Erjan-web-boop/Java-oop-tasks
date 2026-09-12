class Electronics extends Product implements Discountable {

    private double memory;
    private String category;

    public Electronics(String name, double price, double memory, String category) {
        super(name, price);
        this.memory = memory;
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