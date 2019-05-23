package bangunansamasisi;
public class segitigaSisi extends BangunanSamaSisi {
	private double tinggi ;

	public segitigaSisi(double tinggi) {
		super();
		this.tinggi = tinggi;
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		super.keliling();
		keliling = 3*sisi;
	}
	

	@Override
	public void luas() {
		// TODO Auto-generated method stub
		super.luas();
		tinggi = Math.sqrt(Math.pow(sisi/2,2) - Math.pow(sisi, 2)) ;
		luas = tinggi * sisi/2 ;
	}
	


	public segitigaSisi(int sisi, int luas) {
		super(sisi);
		// TODO Auto-generated constructor stub
	}


	public segitigaSisi(int sisi) {
		super(sisi);
		// TODO Auto-generated constructor stub
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	public void printnoround(){
		System.out.println("Luas segitiga adalah" + luas);
		System.out.println("keliling segitiga adalah "+ keliling);
	}

	public segitigaSisi() {
		
	}

}
