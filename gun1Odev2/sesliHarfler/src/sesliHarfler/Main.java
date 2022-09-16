package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harftir " + harf);	
			break;		
		case 'E' :
		case 'İ' :
		case 'Ö' :
		case 'Ü' :
			System.out.println("İnce sesli harftir " + harf);
			break;
		default:
			System.out.println("Hatalı giriş yaptınız.");
		}
	}

}
