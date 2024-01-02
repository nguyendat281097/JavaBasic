package BaiTapOOP.BaiTap_4;
import java.util.*;
public class Main {
//Yêu cầu 4: Nhập n hộ dân. (n nhập từ bàn phím), hiển thị thông tin của các hộ trong khu phố.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thông tin của khu phố: ");
		System.out.print("Nhập số hộ dân : ");
		int n = sc.nextInt();
		KhuPho kp = new KhuPho();
		// cho for chạy từng hộ gia đình
		for(int i=0; i<n; i++) {
			System.out.println("Nhập thông tin của hộ gia đình thứ "+ (i+1) +" : ");
			System.out.print("Nhập số nhà: ");
			sc.nextLine();
			String soNha = sc.nextLine();
			System.out.print("Nhập số thành viên: ");
			int soThanhVien = sc.nextInt();
			// khởi tạo một hộ gia đình
			HoGiaDinh hoGiaDinh = new HoGiaDinh(soNha, soThanhVien);
			for(int j = 0; j < soThanhVien; j++) {
				System.out.println("Nhập thông tin của hộ gia đình thứ "+(i+1)+" : ");
				System.out.print("Nhập họ tên: ");
				sc.nextLine();
				String hoTen = sc.nextLine();
				System.out.print("Nhập tuổi: ");
				int tuoi = sc.nextInt();
				System.out.print("Nghề nghiệp: ");
				sc.nextLine();
				String ngheNghiep = sc.nextLine();
				System.out.print("Nhập số chứng minh nhân dân: ");
				int soCM = sc.nextInt();
				hoGiaDinh.themNguoi(new Nguoi(hoTen, tuoi, ngheNghiep, soCM));
			}
			kp.themHoGiaDinh(hoGiaDinh);
		}
		kp.xuatKP();
		
		
	}

}
