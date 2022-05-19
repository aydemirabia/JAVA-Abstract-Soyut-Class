package java_abstract_class;

import java.util.Scanner;
import java_abstract_class.Tedarikci;

public class Alici {
	Tedarikci tedarikci;
	Scanner yaz = new Scanner(System.in);
	
	void UrunAl() {
		System.out.print("Kac ton alacaksiniz? : ");
		int alinacakUrunTonMiktari = yaz.nextInt();
		System.out.println("--->Urun Fiyat: " + tedarikci.urunAl(alinacakUrunTonMiktari) / alinacakUrunTonMiktari + " TL");
		System.out.println(alinacakUrunTonMiktari + " ton : " + tedarikci.urunAl(alinacakUrunTonMiktari) + " TL");
		System.out.println("----------------");
	}
public class Main{
	public static void main(String[] args) {
		System.out.println("----- Turkiye Cumhuriyeti Tarim ve Orman Bakanligi ----");
		
		System.out.println("Ihracat Urunlerimiz \n\t [B] : Bugday \n\t [F] : Findik\n\n");
		System.out.print("Ithal Urunlerimiz \n\t [S] : Siviyag \n\t [M] : Misir\n\n");

		System.out.print("----- Turkiye Cumhuriyeti Tarim ve Orman Bakanligi -----"
				+ "\nIhracat icin E\t-----\tIthalat icin I : ");
		String karar;
		Scanner tercih = new Scanner(System.in);
		karar = tercih.next();

		if(karar == "E") {
			String urunSec;
			System.out.print("Urun seciminiz: ");
			Scanner urunTercih = new Scanner(System.in);
			urunSec = urunTercih.next();
			
			switch (urunSec) {
			case "B":
				Alici aliciB = new Alici();
				aliciB.tedarikci = new IhracEdilenUrunBugday();
				aliciB.UrunAl();
				break;
			case "F":
				Alici aliciF = new Alici();
				aliciF.tedarikci = new IhracEdilenUrunFindik();
				aliciF.UrunAl();
				break;
			}
		}
			else if(karar == "I") {
				String urunSecimi;
				System.out.print("Urun seciminiz: ");
				Scanner urunTercihi = new Scanner(System.in);
				urunSecimi = urunTercihi.next();
				
				
				switch (urunSecimi) {
				case "S":
					Alici aliciS = new Alici();
					aliciS.tedarikci = new IthalEdilenUrunSiviyag();
					aliciS.UrunAl();
					break;
				case "M":
					Alici aliciM = new Alici();
					aliciM.tedarikci = new IthalEdilenUrunMisir();
					aliciM.UrunAl();
					break;
				}
			}
		}		
	}
}
