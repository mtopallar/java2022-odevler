package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar * 1.10; 
		// => base in hesapla metodunu öğrenci için override ettik. 
		// javada aksi belirtilmedikçe her metod overrideable'dı hatırla. c# da bu virtual işlemdir.
		// java da ezilmesini istemediğimiz metodu final olarak işaretliyorduk. => public final double hesapla() {} gibi. 
	}
}
