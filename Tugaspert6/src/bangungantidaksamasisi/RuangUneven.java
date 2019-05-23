package bangungantidaksamasisi;

public class RuangUneven extends BangunanTidakSamaSisi{
	protected int zvalue ;
	protected double volume ;
	
	public RuangUneven(int panjang, int lebar,int zvalue) {
		super(panjang, lebar);
		this.zvalue = zvalue;
		// TODO Auto-generated constructor stub
	}
	public RuangUneven() {
		// TODO Auto-generated constructor stub
		
	}
	public void volume(){
		volume = panjang* lebar * zvalue; 
	}
	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		super.keliling();
		keliling = 4 *panjang+4*lebar+4*zvalue;
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Volume bangunan adalah" + Math.round(volume));
	}
	@Override
	public void luas() {
		// TODO Auto-generated method stub
		super.luas();
		luas =( 2* panjang * lebar) +(2*panjang*zvalue)+(2*lebar*zvalue); 
	}
	@Override
	public void printnoround() {
		// TODO Auto-generated method stub
		super.printnoround();
		System.out.println("Volume bangunan adalah" +volume);
	}
}
