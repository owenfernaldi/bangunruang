import java.util.Scanner;

import bangunansamasisi.BangunanSamaSisi;
import bangunansamasisi.bola;
import bangunansamasisi.kubus;
import bangunansamasisi.lingkaran;
import bangunansamasisi.segitigaSisi;
import bangungantidaksamasisi.BangunanTidakSamaSisi;
import bangungantidaksamasisi.RuangUneven;
import bangungantidaksamasisi.segitigaTidakSamaSisi;

public class Main {
	Scanner scan = new Scanner(System.in);

	int datar,ruang,sisis,lebars,panjangs,bangunan,zvalue;
	public Main() {
		
		
		do {
			System.out.println("Pilih ruangan bangun datar(1.)");
			System.out.println("pilih ruangan bangun ruang(2.)");
			bangunan = scan.nextInt(); scan.nextLine();

			switch (bangunan) {
			case 1:
				System.out.println("1.persegi");
				System.out.println("2.persegi panjang");
				System.out.println("3.lingkaran");
				System.out.println("4.segitiga sama sisi");
				System.out.println("5.setiga sama kaki");
				datar = scan.nextInt(); scan.nextLine();
				switch (datar) {
				case 1:
					System.out.println("Masukan panjang sisi");
					sisis =scan.nextInt(); scan.nextLine();
					BangunanSamaSisi persegi = new BangunanSamaSisi(sisis);
					persegi.luas();
					persegi.keliling();
					persegi.print();
					break;

				case 2:
					System.out.println("masukan panjang persegi panjang");
					panjangs = scan.nextInt() ; scan.nextLine();
					System.out.println("masukan panjang lebar persegin panjang");
					lebars = scan.nextInt();scan.nextLine();
					BangunanTidakSamaSisi persegipanjang = new BangunanTidakSamaSisi(panjangs,lebars);
					persegipanjang.luas();
					persegipanjang.print();
					
					break;
				case 3:
					System.out.println("masukan panjang diameter");
					sisis = scan.nextInt(); scan.nextLine();
					lingkaran lingkarans = new lingkaran(sisis);
					lingkarans.luas();
					lingkarans.print();
					break;
				case 4:
					System.out.println("masukan Sisi Segitiga");
					sisis = scan.nextInt();scan.nextLine();
					segitigaSisi segitiga = new segitigaSisi(sisis);
					segitiga.luas();
					segitiga.keliling();
					segitiga.printnoround();
					
					break ;
					
				case 5:
					System.out.println("masukan alas segitiga :");
					panjangs = scan.nextInt(); scan.nextLine();
					System.out.println("masukan tinggi segitiga");
					lebars = scan.nextInt(); scan.nextLine();
					segitigaTidakSamaSisi segitiga2 = new segitigaTidakSamaSisi(panjangs, lebars);
					segitiga2.luas();
					segitiga2.keliling();
					segitiga2.print();
					break;
			
				}
			case 2:
				System.out.println("1.Balok");
				System.out.println("2.Kubus");
				System.out.println("3.Bola");
				ruang = scan.nextInt(); scan.nextLine();
		
				switch (ruang) {
				case 1:
					System.out.println("masukan panjang balok");
					panjangs = scan.nextInt(); scan.nextLine();
					System.out.println("masukan lebar balok");
					lebars = scan.nextInt(); scan.nextLine();
					System.out.println("masukan tinggi balok");
					zvalue = scan.nextInt(); scan.nextLine();
					RuangUneven balok = new RuangUneven(panjangs,lebars,zvalue);
					balok.volume();
					balok.luas();
					balok.keliling();
					balok.print();
					break;

				case 2:
					System.out.println("masukan panjang balok");
					sisis= scan.nextInt(); scan.nextLine();
					kubus kubus = new kubus(sisis);
					kubus.volume();
					kubus.luas();
					kubus.keliling();
					kubus.print();
					break;
				
				case 3:
					System.out.println("masukan jari jari bola");
					sisis = scan.nextInt(); scan.nextLine();
					bola bola = new bola(sisis);
					bola.luas();
					bola.volume();
					bola.print();
					break;
				}
			
			
			}		} while ( bangunan !=3 );
		//} else {

		//}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
