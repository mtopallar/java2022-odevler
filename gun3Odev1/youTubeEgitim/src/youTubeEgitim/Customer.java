package youTubeEgitim;

public class Customer {
	
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı.");
	}
	
	private int id;
	private String city; //sonradan eklememize rağmen encapsulation dan ötürü kullanımlar bozulmadı.
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
