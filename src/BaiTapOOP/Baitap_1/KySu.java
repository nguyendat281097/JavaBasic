package Baitap_1;
import java.util.*;
public class KySu extends CanBo{
	//Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
	String nganhDaoTao;
	public KySu(String hoTen, int tuoi, String gioiTinh, DiaChi diachi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diachi);
		this.nganhDaoTao = nganhDaoTao;
	}

}
