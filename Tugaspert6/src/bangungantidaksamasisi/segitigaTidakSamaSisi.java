package bangungantidaksamasisi;

public class segitigaTidakSamaSisi extends BangunanTidakSamaSisi{
	private double miring;
	
	public segitigaTidakSamaSisi(int panjang, int lebar) {
		super(panjang, lebar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void luas() {
		// TODO Auto-generated method stub
		super.luas();
		luas = panjang /2  * lebar;
	}

	

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		super.keliling();
		miring = Math.sqrt(Math.pow(panjang/2, 2) + Math.pow(lebar, 2));
		System.out.println(miring);
		keliling =  panjang + 2*miring;
	}

	public segitigaTidakSamaSisi() {
		// TODO Auto-generated constructor stub
	}

}
