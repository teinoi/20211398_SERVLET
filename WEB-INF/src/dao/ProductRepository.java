package dao;
import java.util.ArrayList;
import dto.Product;

   public class ProductRepository {
   private ArrayList<Product> listOfProducts = new ArrayList<Product>();
   private static ProductRepository instance = new ProductRepository();

   public static ProductRepository getInstance(){
	return instance;
   }
    
	public ProductRepository() {
		Product cpu1 = new Product("P1234", "인텔 코어i9-13세대 13900KS (랩터레이크) (정품)", 1064780);
		cpu1.setDescription("인텔(소켓1700)/10nm(인텔7)/8+16코어/16+16쓰레드/기본 클럭:3.2GHz/최대 클럭:6.0GHz");
		cpu1.setCategory("CPU");
		cpu1.setManufacturer("인텔");
		cpu1.setUnitsInStock(1000);
		cpu1.setCondition("New");
        cpu1.setFilename("P1234.png");
        
		Product cpu2 = new Product("P1235", "인텔 코어i9-13세대 13900K (랩터레이크) (정품)", 843480);
		cpu2.setDescription("인텔(소켓1700)/10nm(인텔7)/8+16코어/16+16쓰레드/기본 클럭:3.0GHz/최대 클럭:5.8GHz");
		cpu2.setCategory("CPU");
		cpu2.setManufacturer("인텔");
		cpu2.setUnitsInStock(1000);
		cpu2.setCondition("New");
        cpu2.setFilename("P1235.png");
        
		Product cpu3 = new Product("P1236", "인텔 코어i9-13세대 13900 (랩터레이크) (정품)", 831500);
		cpu3.setDescription("인텔(소켓1700)/10nm(인텔7)/8+16코어/16+16쓰레드/기본 클럭:2.0GHz/최대 클럭:5.6GHz");
		cpu3.setCategory("CPU");
		cpu3.setManufacturer("인텔");
		cpu3.setUnitsInStock(1000);
		cpu3.setCondition("New");
		cpu3.setFilename("P1236.png");        
        
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(cpu1);
		listOfProducts.add(cpu2);
		listOfProducts.add(cpu3);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    
    public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
   
   public void addProduct(Product product) {
	listOfProducts.add(product);
   }
}
