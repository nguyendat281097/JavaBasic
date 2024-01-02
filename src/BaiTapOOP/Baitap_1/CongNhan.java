package Baitap_1;
import java.util.*;
public class CongNhan extends CanBo{
	//Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
	int bac;
	public CongNhan(String hoTen, int tuoi, String gioiTinh, DiaChi diachi, int bac) {
		super(hoTen, tuoi, gioiTinh, diachi);
		this.bac = bac;
	}

}
