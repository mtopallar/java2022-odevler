package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
//		       satır    eleman
//				 []       []          => 0 olan "satırlar" Marmara bölgesi olsun
//									  => 1 olan İç Anadolu
//									  => 2 olan Güneydoğu Anadolu
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
		
		
		for (int i = 0; i <= 2; i++) { // => bu satırları gezecek
			// önce satırları gezeriz bu sırada o satırın sütunları gezilir: nested-look (iç içe döngüler)
			System.out.println("-------------------------------------------");
			for(int j =0; j<=2; j++) {// => i=0 iken girdik ve j = 0'dan 2 olana kadar bu dönecek. Sonra i=1 iken ve i=2 iken de aynı. 
			// Yani i=0 iken j=0, j=1, j=2; sonra i=1 iken j=0,j=1,j=2; sonra i=3 iken j=0 j=1, j=2 ve her iki döngü de bitmiş olacak.
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
