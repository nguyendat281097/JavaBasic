package BaiTapOOP.Baitap_1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		Scanner sc = new Scanner(System.in);
		while(true) {
			//in các chức năng
			System.out.println("1. Thêm cán bộ");
			System.out.println("2. Tìm kiếm theo họ tên");
			System.out.println("3. Hiển thị danh sách cán bộ");
			System.out.println("4. Thoát");
			//Chọn chức năng
			System.out.print("Chọn chức năng(1-4): ");
			int chon = sc.nextInt();
			// nếu chọn chức năng 1 thêm cán bộ
			if(chon == 1) {	
				// nhập loại cán bộ
				System.out.print("Nhập loại cán bộ: ");
				sc.nextLine();
			    String loaiCanBo = sc.nextLine();	 
			    // nhập tên
				System.out.print("Nhập họ tên: ");
				String hoTen = sc.nextLine();
				// nhập tuổi
				System.out.print("Nhập tuổi: ");
				int tuoi = sc.nextInt();
				// nhập giới tính
				System.out.print("Nhập giới tính: ");
				sc.nextLine();
				String gioiTinh = sc.nextLine();
				// nhập số nhà
				System.out.print("Nhập số nhà");
				String soNha = sc.nextLine();
				// nhập tên đường
				System.out.print("Nhập tên đường: ");
				String duong = sc.nextLine();
				// nhập phường
				System.out.print("Nhập phường: ");
				String phuong = sc.nextLine();
				// nhập tên thành phố
				System.out.print("Nhập thành phố: ");
				String thanhPho = sc.nextLine();
				// nếu cán bộ là công nhân thì nhập cấp bậc
				if(loaiCanBo.equalsIgnoreCase("Công Nhân")){
					System.out.print("Nhập bậc: ");
					int bac = sc.nextInt();
					// khởi tạo 1 đối tượng công nhân và thêm vào list
					qlcb.themCanBo(new CongNhan(hoTen, tuoi, gioiTinh,new DiaChi(soNha, duong, phuong, thanhPho), bac));
					// nếu cán bộ là kỹ sư thì nhập ngành đào tạo
				}else if(loaiCanBo.equalsIgnoreCase("Kỹ Sư")) {
					System.out.print("Nhập ngành đào tạo: ");
					String nganhDaoTao = sc.nextLine();
					// khởi tạo 1 đối tượng kỹ sư và thêm vào list
					qlcb.themCanBo(new KySu(hoTen, tuoi, gioiTinh,new DiaChi(soNha, duong, phuong, thanhPho), nganhDaoTao));
					// nếu cán bộ là nhân viên thì nhập công việc
				}else if(loaiCanBo.equalsIgnoreCase("Nhân Viên")) {
					System.out.print("Nhập Công Việc: ");
					String congViec = sc.nextLine();
					// khởi tạo 1 đối tượng nhân viên và thêm vào list
					qlcb.themCanBo(new NhanVien(hoTen, tuoi, gioiTinh,new DiaChi(soNha, duong, phuong, thanhPho), congViec));
					// nếu không phải 3 loại trên thì thông báo và nhập lại
				}else {
					System.out.println("Loại cán bộ không hợp lệ");
				}
			// nếu chọn chức năng 2 tìm kiếm theo họ tên	
			}else if(chon == 2) {
				// nhập tên cần tìm
				System.out.print("Nhập tên cần tìm: ");
				sc.nextLine();
				String tenCanTim = sc.nextLine();
				// tìm 
				qlcb.timKiemHoTen(tenCanTim);
		    // nếu chọn chức năng 3 hiển thị danh sách cán bộ		
			}else if(chon == 3) {
				System.out.println("Danh sách cán bộ: ");
				qlcb.hienThiDanhSachCanBo();
			// nếu chọ chức năg 4 thoát chương trình
			}else if(chon == 4) {
				System.out.println("Thoát khỏi chương trình.");
				break;
			}else {
				System.out.println("Chọn không hợp lệ. Chọn Lại");
			}
		}
		
	}

}
