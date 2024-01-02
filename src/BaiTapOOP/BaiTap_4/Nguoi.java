package BaiTapOOP.BaiTap_4;
import java.util.*;
public class Nguoi {
	/*Để quản lý các hộ dân cư trong một khu phố, người ta cần các thông tin sau: Số thành viên trong gia đình, Số nhà,
	      thông tin mỗi cá nhân trong gia đình. Với mỗi cá nhân, người ta quản lý các thông tin sau:
	      Họ tên, Tuổi, Nghề nghiệp, số chứng minh nhân dân(duy nhất cho mỗi người).
	          Yêu cầu 1: Hãy xây dựng lớp Nguoi để quản lý thông tin của mỗi cá nhân.
	          Yêu cầu 2: Xây dựng lớp HoGiaDinh để quản lý thông tin của từng hộ gia đình.
	          Yêu cầu 3: Xây dựng lớp KhuPho để quản lý các thông tin của từng hộ gia đình.
	          Yêu cầu 4: Nhập n hộ dân. (n nhập từ bàn phím), hiển thị thông tin của các hộ trong khu phố.

*/
	String hoTen;
	int tuoi;
	String ngheNghiep;
	int soChungMinh;
	public Nguoi(String hoTen, int tuoi, String ngheNghiep, int soChungMinh) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.ngheNghiep = ngheNghiep;
		this.soChungMinh = soChungMinh;
		}
	// gọi các giá trị của lớp người
	public String getHoTen() {
		return hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public int getSoChungMinh() {
		return soChungMinh;
	}
	
}
