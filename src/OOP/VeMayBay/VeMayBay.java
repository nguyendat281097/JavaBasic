package OOP.VeMayBay;

import java.util.Scanner;

public class VeMayBay {
    /*Xây dựng lớp Vemaybay gồm:
        Thuộc tính: tenchuyen, ngaybay, giave
        Phương thức: Cấu tử, Hủy, Nhap, Xuat, getgiave() : hàm trả về giá vé
        Xây dựng lớp Nguoi gồm:
        Thuộc tính: hoten, gioitinh, tuoi
        Phương thức: Cấu tử, Hủy, Nhập, Xuất
        Xây dựng lớp Hanhkhach (mỗi hành khách được mua nhiều vé) kế thừa lớp Nguoi
        bổsung thêm:
        Thuộc tính: Vemaybay *ve; int soluong;
        Phương thức: Cấu tử, Hủy, Nhập, Xuất
        tongtien(): trả về Tổng số tiền phải trả của hành khách
        Chương trình chính: Nhập vào 1 danh sách n hành khách (n nhập từ bàn phím).
        Hiển thị danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.
        Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền*/
    private String tenChuyen;
    private Date day;
    private int giaVe;

    public VeMayBay(String tenChuyen, Date day, int giaVe) {
        this.tenChuyen = tenChuyen;
        this.day = day;
        this.giaVe = giaVe;
    }

    // phương thức getgiave() : hàm trả về giá vé
    // lấy giá trị giá vé
    public int getgiave(){
        return giaVe;
    }
    // phương thức nhập hành khách
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên chuyến: ");
        tenChuyen = scanner.nextLine();
        System.out.print("Nhập ngày tháng năm: ");
        day.nhapDate();
        System.out.print("Nhập giá vé: ");
        giaVe = scanner.nextInt();
    }
    // phương thức xuất hành khách
    public void xuat(){
        System.out.println("Tên chuyến: "+ tenChuyen);
        System.out.print("Ngày Tháng Năm: ");
        day.xuatDate();
        System.out.println("Giá vé: "+ giaVe);
    }


}
