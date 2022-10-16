package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Statik Yapıcı blok çalıştı.");
	}
	
	static {
		System.out.println("Statik Yapıcı blok çalıştı."); //static yapıcı bloklarından istediğin kadar ekleyebiliyorsun.
	}
	
	public ProductValidator() {
		
		System.out.println("Yapıcı blok çalıştı."); //c# a çalışırdı. yine c# ta ana class ı satatic işaretleyebiliyoruz ancak javada bu yok.
	}	
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void bisey() {
		// => bunu kullanabilmek için new lemek lazım. Çünkü static değil.
	} 
	
	public static class BaskaBirClass {
		//inner class
		public static void sil() {
			
		}
	}

}
