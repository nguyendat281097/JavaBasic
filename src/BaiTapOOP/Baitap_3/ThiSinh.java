package BaiTapOOP.Baitap_3;

public class ThiSinh {
	/*Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C. Các thí sinh cần quản lý các thông tin sau: 
	      Số báo danh, họ tên, địa chỉ, mức ưu tiên.
	      Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
	      Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
	      Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
	      Yêu cầu 1: Xây dựng các lớp để quản lý các thi sinh dự thi đại học.
	      Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:
	          Thêm mới thí sinh.
	          Hiện thị thông tin của thí sinh và khối thi của thí sinh.
	          Tìm kiếm theo số báo danh.
	          Thoát khỏi chương trình.*/
	int sBD;
	String hoTen;
	String diaChi;
	int mucUuTien;
	String khoiThi;
	public ThiSinh(int sBD, String hoTen, String diaChi, int mucUuTien, String khoiThi) {
		this.sBD = sBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoiThi = khoiThi;
	}
	public int getsBD() {
		return sBD;
	}
	public void xuat() {
		System.out.println("Số báo danh: "+sBD);
		System.out.println("Họ tên: "+hoTen);
		System.out.println("Địa chỉ: "+diaChi);
		System.out.println("Mức ưu tiên: "+mucUuTien);
		System.out.println("Khối thi: "+khoiThi);
	}

}
