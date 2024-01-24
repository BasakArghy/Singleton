interface ProductFactory {
void createProduct();
}
class SingletonFactory implements ProductFactory {
    private static SingletonFactory instance;

    // Private constructor to prevent instantiation
    private SingletonFactory() {
    }

 // Method to get the singleton instance
    public static SingletonFactory getInstance() {
        if (instance == null) {
            instance = new SingletonFactory();
        }
        return instance;
    }

    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}

// Client class
public class Client {
    public static void main(String[] args) {
        // Using Singleton Pattern
        ProductFactory factory = SingletonFactory.getInstance();
        Product product = factory.createProduct();
        product.display();
    }
}