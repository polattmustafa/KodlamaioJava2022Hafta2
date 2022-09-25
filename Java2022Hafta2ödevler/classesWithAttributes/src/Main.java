public class Main {

    public static void main(String[] args) {

        Product product = new Product(1,"Laptop", "Asus laptop", 4000, 2, "siyak");
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(10000.0);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);


    }

}