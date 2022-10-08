package youTubeEgitim;

public abstract class BaseCreditManager implements CreditManagerInterface{
	
	public abstract void calculate();
	
	public void save() { 
		//javada metodlar otomatik virtual kabul ediliyormuş, virtual olmaması gereken metodlar için final keywordu
		//kullanabilirsin. final kelimesi ile işaretlenen metodlara override yapılamıyor.
		System.out.println("Kaydedildi.");
	}
	
}

