package OOP.VeMayBay;

import OOP.VeMayBay.VeMayBay;

import java.util.Scanner;

public class HanhKhach extends Nguoi {
    /*Xây dựng lớp Hanhkhach (mỗi hành khách được mua nhiều vé) kế thừa lớp Nguoi
        bổsung thêm:
        Thuộc tính: Vemaybay *ve; int soluong;
        Phương thức: Cấu tử, Hủy, Nhập, Xuất
        tongtien(): trả về Tổng số tiền phải trả của hành khách*/
    // 1 hành khách có thể có nhiều vé nên tạo mảng có vé máy bay
    VeMayBay[] ve;
    // số lượng vé hành khách mua
    private int soLuong;

    public HanhKhach(String hoTen, String gioiTinh, int tuoi, int soLuong) {
        super(hoTen, gioiTinh, tuoi);// dùng để gọi constructor của lớp cha, giúp khởi tạo các thuộc tính của đối tượng lớp cha
        this.soLuong = soLuong;
        // khởi tạo mảng vé máy bay với độ dài bằng số lượng vé mà hành khách mua
        ve = new VeMayBay[soLuong];
        // duyệt mảng
        for(int i = 0; i < soLuong; i++){
            // khởi tạo các vé máy bay
            ve[i] = new VeMayBay("", new Date(0, 0, 0),0);
        }
    }
    // nhập thông tin của hành khách
    public void nhap(){
        // lấy thông tin từ lớp người
        super.nhapNguoi();
        Scanner scanner = new Scanner(System.in);
        // nhập số lượng vé của 1 hành khách
        System.out.print("Nhập Số lượng vé: ");
        soLuong = scanner.nextInt();
        // tạo mảng vé
        ve = new VeMayBay[soLuong];
        for (int i = 0; i < soLuong; i++) {
            // khởi tạo các vé
            ve[i] = new VeMayBay("",new Date(0, 0, 0) , 0);
            System.out.println("Nhập thông tin vé thứ " + (i + 1) + ": ");
            // nhập thông tin vé từ lớp vé máy bay
            ve[i].nhap();
        }
    }
    // xuất thông tin khách hàng
    public void xuat(){
        // thông tin của khách hàng từ lớp người
            super.xuatNguoi();
            System.out.println("Số lượng vé: "+soLuong);
            for(int i = 0; i < soLuong; i++){
                System.out.println("Thông tin vé thứ: "+(i+1)+": ");
                ve[i].xuat();
            }
        System.out.println("Tổng tiền vé: "+ tongTien());

    }
    public int tongTien(){
        int tongTien = 0;
        for(int i = 0; i<soLuong; i++){
            tongTien += ve[i].getgiave();
        }
        return tongTien;
    }
}
