package BaiTapOOP.Baitap_3;
import java.util.Scanner;
public class Main {
	/*Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:
	          Thêm mới thí sinh.
	          Hiện thị thông tin của thí sinh và khối thi của thí sinh.
	          Tìm kiếm theo số báo danh.
	          Thoát khỏi chương trình.*/
	public static void main(String[] args) {
		TuyenSinh ts = new TuyenSinh();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Thêm mới thí sinh.");
			System.out.println("2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.");
			System.out.println("3. Tìm kiếm theo số báo danh.");
			System.out.println("4. Thoát khỏi chương trình.");
			System.out.print("Mời nhập chức năng(1-4): ");
			int n = sc.nextInt();
			// chọn chức năng 1, thêm thí sinh mới
			if(n == 1) {
				// nhập số báo danh
				System.out.print("Nhập số báo danh: ");
				int sbd = sc.nextInt();
				// nhập họ tên
				System.out.print("Nhập họ tên: ");
				sc.nextLine();
				String hoTen = sc.nextLine();
                //nhập địa chỉ
				System.out.print("Nhập địa chỉ: ");
				String diaChi = sc.nextLine();
				// nhập mức ưu tiên
				System.out.print("Nhập mức ưu tiên: ");
				int mucUuTien = sc.nextInt();
				//nhập khối thi
				System.out.print("Nhập khối thi: ");
				sc.nextLine();
				String khoiThi = sc.nextLine();
				// thêm thí sinh vào danh sách
				ts.themThiSinh((new ThiSinh(sbd, hoTen, diaChi, mucUuTien, khoiThi)));
			// nếu chọn chức năng 2, hiện thị thông tin và khối thi thí sing	
			}else if(n == 2) {
				System.out.println("Hiển thị danh sách thí sinh: ");
				ts.hienThiSinh();
			// chọn chức năng 3, tìm kiếm thí sinh theo số báo danh	
			}else if(n == 3) {
				// nhập mã số báo danh cần tìm
				System.out.print("Nhập mã cần tìm: ");
				int maCanTim = sc.nextInt();	
			    ts.timKiemSBD(maCanTim);
            // chọn chức năng 4, thoát chương trình
			}else if(n == 4) {
				System.out.println("Thoát khỏi chương trình.");
				break;
			}else {
				System.out.println("Chọn chức năng sai, nhập lại.");
			}
		}
	}
}
