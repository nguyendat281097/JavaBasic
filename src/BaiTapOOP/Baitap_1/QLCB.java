package BaiTapOOP.Baitap_1;
import java.util.*;
public class QLCB {
	/*Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
	         Thêm mới cán bộ
	         Tìm kiếm theo họ tên.
	         Hiện thị thông tin về danh sách các cán bộ.
	         Thoát khỏi chương trình.*/
	ArrayList<CanBo> danhSachCanBo;
	
	public QLCB() {
		danhSachCanBo = new ArrayList<>();
	}
	public void themCanBo(CanBo cb) {
		danhSachCanBo.add(cb);		
	}
	public void timKiemHoTen(String hoTen) {
		for(CanBo cb : danhSachCanBo) {
			if(cb.getHoTen().equals(hoTen)){
				System.out.println("Thông tin thành viên: ");
				cb.xuat();	
				return;
			}
		}
		System.out.println("Không tìm thấy cán bộ có tên là "+hoTen);
	}
	public void hienThiDanhSachCanBo() {
		for(CanBo cb : danhSachCanBo) {
			cb.xuat();
			System.out.println("----------------------------");
		}
	}
	
	

}
