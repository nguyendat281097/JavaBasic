package BaiTapOOP.ThuVien;

public class Sach extends TaiLieu{
	//Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
	String tenTacGia;
	int soTrang;
	public Sach(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	public void xuatSach() {
		super.xuat();
		System.out.println("Tên tác giả: "+tenTacGia);
		System.out.println("Số trang"+soTrang);

	}

}
