package youTubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	CreditManagerInterface creditManagerInterface;
	
	public CustomerManager(Customer customer,CreditManagerInterface creditManagerInterface) {
		this.customer = customer;
		this.creditManagerInterface = creditManagerInterface;
	}

	public void save() {
		System.out.println("Müşteri kaydedildi : ");
	}
	
	public void delete() {
		System.out.println("Müşteri silindi : ");
	}
	
	public void giveCredit() {
		this.creditManagerInterface.calculate();
		System.out.println("Kredi verildi.");
	}
}
