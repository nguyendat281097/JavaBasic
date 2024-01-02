package BaiTapOOP.ThuVien;
import java.util.*;
public class QuanLySach {
	/*Yêu cầu 2: Xây dựng lớp QuanLySach có các chức năng sau
    Thêm mới tài liêu: Sách, tạp chí, báo.
    Xoá tài liệu theo mã tài liệu.
    Hiện thị thông tin về tài liệu.
    Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
    Thoát khỏi chương trình.*/
	ArrayList<TaiLieu>  danhSachTaiLieu;
	public QuanLySach() {
		danhSachTaiLieu = new ArrayList();
	}
    public void themTaiLieu(TaiLieu tl) {
		danhSachTaiLieu.add(tl);
	}
    public void xoaTaiLieuTheoMa(int ma) {
    	danhSachTaiLieu.removeIf(tl -> tl.getMaTaiLieu()==ma);
    }
    public void hienThiThongTin() {
    	for(TaiLieu tl : danhSachTaiLieu) {
    		tl.xuat();
    		System.out.println("----------------------");
    		
    	}
    }
    public void timTheoLoai(String loai) {
    	System.out.println("Tìm kiếm tài liệu theo loai "+loai+" : ");
    	for(TaiLieu tl : danhSachTaiLieu) {
    		 //instanceof là một toán tử trong Java được sử dụng để kiểm tra xem một đối tượng có phải là một thể hiện của
            // một lớp cụ thể hay không, hoặc có thuộc về một lớp con của một lớp cụ thể không.
          if(tl instanceof Sach && loai.equalsIgnoreCase("Sách")){
              tl.xuat();
          }else if(tl instanceof Bao && loai.equalsIgnoreCase("Báo")){
              tl.xuat();
          }else if(tl instanceof TapChi && loai.equalsIgnoreCase("Tạp Chí")){
              tl.xuat();
            }
    	}
    }
}
