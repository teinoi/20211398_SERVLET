package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅

	public ProductRepository() {
		Product phone = new Product("P1234", "인텔 코어i9-13세대 13900KS (랩터레이크) (정품)", 1064780);
		phone.setDescription("인텔(소켓1700)/10nm(인텔7)/8+16코어/16+16쓰레드/기본 클럭:3.2GHz/최대 클럭:6.0GHz/L2 캐시:32MB/L3 캐시:36MB/PBP/MTP:150~253W/PCIe5.0, 4.0/메모리 규격:DDR5, DDR4/5600, 3200MHz/내장그래픽:탑재/인텔 UHD 770/기술 지원:하이퍼스레딩/쿨러:미포함/출시가: 689~699달러 (VAT별도)");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
        
		Product notebook = new Product("P1235", "인텔 코어i9-13세대 13900K (랩터레이크) (정품)", 843480);
		notebook.setDescription("인텔(소켓1700)/10nm(인텔7)/8+16코어/16+16쓰레드/기본 클럭:3.0GHz/최대 클럭:5.8GHz/L2 캐시:32MB/L3 캐시:36MB/PBP/MTP:125~253W/PCIe5.0, 4.0/메모리 규격:DDR5, DDR4/5600, 3200MHz/내장그래픽:탑재/인텔 UHD 770/기술 지원:하이퍼스레딩/쿨러:미포함/시네벤치R23(싱글):2251/시네벤치R23(멀티):38207/출시가: 589달러 (VAT별도)");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");

		Product tablet = new Product("P1236", "인텔 코어i9-13세대 13900 (랩터레이크) (정품)", 831500);
		tablet.setDescription("인텔(소켓1700)/10nm(인텔7)/8+16코어/16+16쓰레드/기본 클럭:2.0GHz/최대 클럭:5.6GHz/L2 캐시:32MB/L3 캐시:36MB/PBP/MTP:65~219W/PCIe5.0, 4.0/메모리 규격:DDR5, DDR4/5600, 3200MHz/내장그래픽:탑재/인텔 UHD 770/기술 지원:하이퍼스레딩/쿨러:인텔 기본쿨러 포함/출시가: 549~579달러 (VAT별도)");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
}
