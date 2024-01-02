package BaiTapOOP.BaiTap_4;
import java.util.*;
public class HoGiaDinh {
	/**Để quản lý các hộ dân cư trong một khu phố, người ta cần các thông tin sau: Số thành viên trong gia đình, Số nhà,
	      thông tin mỗi cá nhân trong gia đình. 
	      Yêu cầu 2: Xây dựng lớp HoGiaDinh để quản lý thông tin của từng hộ gia đình.*/
	// một nhà co thể có nhiều người nên tạo mảng người
	String soNha;
	// số thành viên bằng số lượng người trong nhà bằng độ dài của mảng
	int soThanhVien;
	// tạo 1 ArrayList để chứa các thành viên trong hộ gia đình
	ArrayList<Nguoi> danhSachNguoi;
	
	public HoGiaDinh(String soNha, int soThanhVien) {
		this.soNha = soNha;
		this.soThanhVien = soThanhVien;
		this.danhSachNguoi = new ArrayList<>();
	}
    // thêm thành viên vào hộ gia đình
	public void themNguoi(Nguoi nguoi) {
		danhSachNguoi.add(nguoi);
	}
	//xuất hộ gia đìn
	public void xuatHGD() {
		// xuất số nhà
		System.out.println("Số nhà: "+soNha);
		// xuất số thành viên
		System.out.println("Số thành viên: "+soThanhVien);
		// xuất tường người trong hộ gia đình
		for(Nguoi nguoi: danhSachNguoi) {
			System.out.println("Họ tên: "+ nguoi.getHoTen());
			System.out.println("Tuổi: "+nguoi.getTuoi());
			System.out.println("Nghề nghiệp: "+nguoi.getNgheNghiep());
			System.out.println("Số chứng minh nhân dân: "+nguoi.getSoChungMinh());
		}
	}

	
}
