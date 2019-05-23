package bangunansamasisi;
public class lingkaran extends BangunanSamaSisi {
	double jari;

	

	public lingkaran(int sisi) {
		super(sisi);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void luas() {
		// TODO Auto-generated method stub
		super.luas();
		jari = sisi/2;
		luas = Math.PI * jari * jari;
	}
	@Override
	public void keliling() {
		// TODO Auto-generated method stubS 
		super.keliling();
		double keliling = Math.PI * sisi ;  
	}public lingkaran() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
