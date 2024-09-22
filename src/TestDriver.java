package src;
public class TestDriver {
    public static void main(String[] args) {
        // Create Bananas
        GroceryProductFactory bananasFactory = new BananasFactory();
        Product bananas = bananasFactory.createProduct();
        bananasFactory.setPrice(bananas);
        System.out.println(bananas.getName() + " price: $" + bananas.getPrice());

        // Create Apples
        GroceryProductFactory applesFactory = new ApplesFactory();
        Product apples = applesFactory.createProduct();
        applesFactory.setPrice(apples);
        System.out.println(apples.getName() + " price: $" + apples.getPrice());
    }
}
