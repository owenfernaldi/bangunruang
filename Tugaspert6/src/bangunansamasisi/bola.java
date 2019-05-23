package bangunansamasisi;

public class bola extends lingkaran {
	private double volume;
	private double rusuk = sisi/2;
	public bola(int sisi) {
		super(sisi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void luas() {
		// TODO Auto-generated method stub
		super.luas();
		luas = 22*Math.pow(rusuk, 2)/7*4;
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		super.keliling();
		keliling=(int)luas;
	}public void volume(){
		volume = 22*Math.pow(rusuk, 3)/7*4/3;
	}
	public void print (){
		System.out.println("Luas bola " + luas);
		System.out.println("Keliling bola = Luas =" + luas);
		System.out.println("volume bola adalah "+ volume);
	}

	public bola() {
		// TODO Auto-generated constructor stub
	}

}
