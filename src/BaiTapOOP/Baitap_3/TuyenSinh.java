package BaiTapOOP.Baitap_3;
import java.util.ArrayList;
public class TuyenSinh {
/*Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:
	         1. Thêm mới thí sinh.
	         2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
	         3. Tìm kiếm theo số báo danh.
	         4. Thoát khỏi chương trình.*/
	ArrayList<ThiSinh> danhSachThiSinh;
	public TuyenSinh() {
		danhSachThiSinh = new ArrayList();
	}
	//1. Thêm mới thí sinh.
	public void themThiSinh(ThiSinh ts) {
		danhSachThiSinh.add(ts);
	}
	//2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
	public void hienThiSinh(){
		for(ThiSinh ts: danhSachThiSinh) {
			ts.xuat();
		}
	}
	//3. Tìm kiếm theo số báo danh.
	public void timKiemSBD(int ma) {
		// duyệt danh sách
		for(ThiSinh ts: danhSachThiSinh) {
			// nếu mã báo danh cần tìm có trong danh sách
			if(ts.getsBD() == ma) {
				// xuất thí sinh đó ra
				ts.xuat();
				return;
			}				
		}
		// không có thì in k có ra màn hình
		System.out.println("Không có thí sinh có mã số báo danh này.");
	}
}
