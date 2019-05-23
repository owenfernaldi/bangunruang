package bangungantidaksamasisi;

public class BangunanTidakSamaSisi {
	protected int panjang , lebar;
	protected double luas ;
	protected double keliling ;
	
	public double getLuas() {
		return luas;
	}
	public void setLuas(double luas) {
		this.luas = luas;
	}
	public BangunanTidakSamaSisi(int panjang, int lebar) {
		super();
		this.panjang = panjang;
		this.lebar = lebar;
	}
	public int getPanjang() {
		return panjang;
	}
	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}
	public int getLebar() {
		return lebar;
	}
	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	public void luas() {
		luas = panjang * lebar ;
		
	}
	public void keliling(){
		setKeliling(2*panjang + 2*lebar);
	}
	public void print(){
		System.out.println("luas adalah" + Math.round(luas));
		System.out.println("keliling adalah"+ Math.round(keliling));
	}
	public void printnoround(){
		System.out.println("luas adalah" + luas);
		System.out.println("keliling adalah"+ luas);
	}
	
	public BangunanTidakSamaSisi() {
	
	}
	public double getKeliling() {
		return keliling;
	}
	public void setKeliling(int keliling) {
		this.keliling = keliling;
	}

}
