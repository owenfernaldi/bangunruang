package bangunansamasisi;
import java.util.Scanner;

public class BangunanSamaSisi {
	protected int sisi ;
	protected double luas ;
	protected int keliling;
	

	public BangunanSamaSisi() {
		// TODO Auto-generated constructor stub
		
	}
	public BangunanSamaSisi(int sisi) {
		super();
		this.sisi = sisi;
	}
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}
	
	public void luas(){
		luas = sisi * sisi ;
		
		
		
	}public void keliling(){
		keliling = 4*sisi;
		
	}
	public void print(){
		System.out.println("Luas adalah "+Math.round(luas));
		System.out.println("Keliling adalah "+ Math.round(keliling));
	}

}
