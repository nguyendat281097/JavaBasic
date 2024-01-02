package BaiTapOOP.BaiTap_5;
import java.util.*;
public class KhachSan {
	/*Để quản lý khách hàng đến thuê phòng của một khách sạn, người ta cần các thông tin sau: 
	     Số ngày thuê, loại phòng, thông tin cá nhân của những người thuê phòng.
	     Biết rằng phòng loại A có giá 500$, phòng loại B có giá 300$ và loại C có giá 100$.
	     Với mỗi cá nhân cần quản lý các thông tin sau: Họ tên, tuổi, số chứng minh nhân dân.
	     Yêu cầu 1: Hãy xây dựng lớp Nguoi để quản lý thông tin cá nhân của những người thuê phòng.
	     Yêu cầu 2: Xây dựng lớp KhachSan để quản lý các thông tin về các phòng trong khác sạn.
	     Yêu cầu 3: Xây dựng các phương thức thêm mới, xoá khách theo số chứng minh nhân dân.
	      Tính tiền thuê phòng cho khách(xác định khách bằng số chứng minh nhân dân) dựa vào công thức: (
	      số ngày thuê * giá của từng loại phòng)*/
	Map<String, Integer> giaPhong = new HashMap<>();
	Map<String, ArrayList<Nguoi>> nguoiThuePhong = new HashMap<>();
	 
	int soNgayThue;
	public KhachSan() {
		giaPhong = new HashMap<>();
		giaPhong.put("Loại A", 500);
		giaPhong.put("Loại B", 300);
		giaPhong.put("Loại C", 100);
		this.soNgayThue = soNgayThue;
		nguoiThuePhong = new HashMap<>();
	}
	public void themMoi(String loaiPhong,Nguoi nguoi) {
		nguoiThuePhong.get(loaiPhong).add(nguoi);
	}
	public void xoaKhach(int soCM) {
		for(ArrayList<Nguoi> danhSach : nguoiThuePhong.values()) {
			danhSach.removeIf(khachHang -> khachHang.getSoCM() == soCM);
}
	}
	
}
