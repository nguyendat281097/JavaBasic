package BaiTap_4;
import java.util.*;
public class KhuPho{
	//Yêu cầu 3: Xây dựng lớp KhuPho để quản lý các thông tin của từng hộ gia đình.
	// tạo ArrayLisst chứa các hộ gia đình trong khu phố
	ArrayList<HoGiaDinh> danhSachHGD;

	public KhuPho() {
		danhSachHGD = new ArrayList<>();
	}
	// thêm các hộ gia đình vào khu phố
	public void themHoGiaDinh(HoGiaDinh hgd) {
		danhSachHGD.add(hgd);
	}
	// xuất các hộ gia đình
	public void xuatKP() {
		for(HoGiaDinh hgd: danhSachHGD){
			System.out.println("---------------------------");
			System.out.println("Hộ Gia Đình");
			hgd.xuatHGD();
		}
	}
	
}
