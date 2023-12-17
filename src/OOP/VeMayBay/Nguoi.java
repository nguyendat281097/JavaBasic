package OOP.VeMayBay;

import java.util.Scanner;

public class Nguoi {
    /*Xây dựng lớp Nguoi gồm:
        Thuộc tính: hoten, gioitinh, tuoi
        Phương thức: Cấu tử, Hủy, Nhập, Xuất*/
    private String hoTen;
    private String gioiTinh;
    private int tuoi;

    public Nguoi(String hoTen, String gioiTinh, int tuoi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }
    // phương thức nhập thông tin người
    public void nhapNguoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Họ Tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập Giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập Tuổi: ");
        tuoi = scanner.nextInt();
    }
    // phương thức xuất thông tin người
    public void xuatNguoi(){
        System.out.println("Họ Tên: "+ hoTen);
        System.out.println("Giới Tính: "+gioiTinh);
        System.out.println("Tuổi: "+tuoi);
    }
}
