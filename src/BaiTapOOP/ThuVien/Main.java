package ThuVien;
import java.util.*;
public class Main {
	public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Các chức năng của chương trình: ");
            System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo.");
            System.out.println("2. Xoá tài liệu theo mã tài liệu.");
            System.out.println("3. Hiện thị thông tin về tài liệu.");
            System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
            System.out.println("5. Thoát khỏi chương trình.");
            System.out.print("Mời chọn chức năng(1-5): ");
            int chon = sc.nextInt();
            // chọn 1, thêm mới tài liệu
            if(chon == 1){
                System.out.print("Nhập loại tài liệu: ");
                sc.nextLine();
                String loai = sc.nextLine();
                System.out.print("Nhập mã tài liệu: ");
                int maTL = sc.nextInt();
                System.out.print("Nhập tên nhà xuất bản: ");
                sc.nextLine();
                String tenNXB = sc.nextLine();
                System.out.print("Nhập số bản phát hành: ");
                int soBPH = sc.nextInt();
                // nếu loại của tài liệu là sách
                if(loai.equalsIgnoreCase("Sách")){
                    //nhập tên tác giả
                    System.out.print("Nhập tên tác giả: ");
                    sc.nextLine();
                    String tenTG = sc.nextLine();
                    // nhập số trang
                    System.out.print("Nhập Số trang: ");
                    int soTrang = sc.nextInt();
                    qls.themTaiLieu(new Sach(maTL, tenNXB, soBPH, tenTG, soTrang));
                // nếu loại tài liệu là báo
                }else if(loai.equalsIgnoreCase("Báo")){
                    //thì nhập ngày phát hành
                    System.out.print("Nhập ngày phát hành: ");
                    int ngayPH = sc.nextInt();
                    qls.themTaiLieu(new Bao(maTL, tenNXB, soBPH, ngayPH));
                // nếu loại tài liệu là tạp chí
                }else if(loai.equalsIgnoreCase("Tạp Chí")){
                    // thì nhập số ohats hành
                    System.out.print("Nhập số phát hành");
                    int soPH = sc.nextInt();
                    // tháng phát hành
                    System.out.print("Nhập tháng phát hành");
                    int thangPH = sc.nextInt();
                    qls.themTaiLieu(new TapChi(maTL, tenNXB, soBPH, soPH, thangPH));
                }else{
                    System.out.println("Loại không hợp lệ");
                }
            // chọn 2 xóa tài liệ theo mã
            }else if(chon == 2){
                System.out.println("Xoá tài liệu theo mã tài liệu:");
                System.out.print("Nhập mã cần tìm: ");
                int ma = sc.nextInt();
                qls.xoaTaiLieuTheoMa(ma);
            // chọn 3 hiển thị thông tin tài liệu
            }else if(chon == 3){
                System.out.println("Hiển thị thông tin tài liệu: ");
                qls.hienThiThongTin();
            // chọn 4 tìm kiếm tài liệu theo loại: sách báo tạp chí
            }else if(chon == 4){
                System.out.print("Nhập loại tài liệu cần tìm: ");
                sc.nextLine();
                String loai = sc.nextLine();
                qls.timTheoLoai(loai);
            // chọn 5 thoát chương trình
            }else if(chon == 5){
                System.out.println("Thoát chương trình.");
                break;
            // chọn khác 1-5
            }else{
                System.out.println("chọn không hợp lệ, nhập lại");
            }
        }

    }
}
