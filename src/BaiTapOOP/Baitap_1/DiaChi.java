package Baitap_1;
import java.util.Scanner;
public class DiaChi {
	String soNha;// Số nhà
	String duong;// tên đường
	String phuong;// phường 
	String thanhPho;// thanhf phố
	public DiaChi(String soNha, String duong, String phuong, String thanhPho) {
		this.soNha = soNha;
		this.duong = duong;
		this.phuong = phuong;
		this.thanhPho = thanhPho;
	}
	public void nhapDC() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nhà: ");
		soNha = sc.nextLine();
		
		
	}
	public void xuatDC(){
		System.out.println(soNha+" / "+duong+" / "+phuong+" / "+thanhPho);
	}
}
