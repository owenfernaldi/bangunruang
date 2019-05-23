package bangunansamasisi;

public class kubus extends BangunanSamaSisi{
	private double volume;
	public kubus(int sisi) {
		super(sisi);
		// TODO Auto-generated constructor stub
	}public void volume(){
		volume = Math.pow(sisi, 3);
	}
	@Override
	public void luas() {
		// TODO Auto-generated method stub
		super.luas();
		luas = 6* Math.pow(sisi, 2);
	}
	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		super.keliling();
		keliling = sisi * 12 ;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("volume bangunan"+volume);
		super.print();
	}
	public kubus() {
		// TODO Auto-generated constructor stub
	}

}
