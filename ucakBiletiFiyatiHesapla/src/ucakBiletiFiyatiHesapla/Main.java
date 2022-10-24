package ucakBiletiFiyatiHesapla;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double mesafe,mesafeBasinaUcret=0.10,tutar=0,yasIndirimi = 0,yolculukTipiIndirim;
		int yolculukTipi,yas;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Mesafeyi KM türünden giriniz: ");
		mesafe=scan.nextDouble();
		
		System.out.print("Yaþýnýzý giriniz: ");
		yas=scan.nextInt();
		
		System.out.print("Yolculuk Tipini giriniz(1 => Tek Yön, 2 => Gidiþ Dönüþ): ");
		yolculukTipi=scan.nextInt();
		
		if(mesafe>0 && yas>=0 && (yolculukTipi==1 || yolculukTipi==2)) {
			tutar=mesafe*mesafeBasinaUcret;
			if(yas<12) {
				yasIndirimi=tutar*0.50;
			}
			else if(yas<=24) {
				yasIndirimi=tutar*0.10;
			}
			else if(yas>65) {
				yasIndirimi=tutar*0.30;
			}
			tutar=(tutar-yasIndirimi);
			if(yolculukTipi==2) {
				yolculukTipiIndirim=tutar*0.20;
				tutar=(tutar-yolculukTipiIndirim)*2;
			}
			System.out.println("Topla Tutar: "+(tutar)+" TL");
		}else {
			System.out.println("Hatalý Veri Girdiniz !");
		}
	}

}
