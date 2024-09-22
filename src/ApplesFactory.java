package src;
// ApplesFactory.java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;

public class ApplesFactory implements GroceryProductFactory {

    @Override
    public Product createProduct() {
        return new Apples();
    }

    @Override
    public void setPrice(Product product) {
        // Simulating reading the price from a JSON file.
        String jsonContent = readFileAsString("./data/products.json");
        JSONObject jsonObject = new JSONObject(jsonContent);
        double price = jsonObject.getJSONObject("Apples").getDouble("price");
        product.setPrice(price);
    }

    private String readFileAsString(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return "{}";
        }
    }
}