package OOP;

import java.util.Scanner;

public class Fraction {
    /* Xây dựng lớp Phanso gồm:
          Thuộc Tính: tuso, mauso.
          Phương thức:
          Hàm Khởi Tạo Không Tham Số, Hàm Hủy
          Nhập , Xuất
          Cong(), Tru(), Nhan(), Chia()
          Tính Tổng, Hiệu, Tích, Thương 2 phân số obj1 và obj2 rồi in kết quả ra màn hình
          */
    int tuso;
    int mauso;
    // hàm khởi tạo không tham số
    public Fraction(){
    }
    // hàm khởi tạo có tham số
    public Fraction(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    // Hàm hủy
    // (Java tự động quản lý bộ nhớ, nên không cần phải tạo hàm hủy)

    // hàm nhập
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tuso = input.nextInt();
        System.out.print("Nhập mẫu số: ");
        mauso = input.nextInt();
    }

    // hàm xuất phân số
    public void xuat(){
        System.out.println("Phân số: "+tuso+"/"+mauso);
    }
    // Phuơng thức cộng
    public static void cong(Fraction fr1, Fraction fr2){
        // nếu mẫu số của 2 phân số bằng nha
        if(fr1.mauso == fr2.mauso){
            // thì lấy tử cộng tử
            int tongTu = fr1.tuso + fr2.tuso;
            // thì mẫu bằng mẫu của phân số
            int tongMau = fr1.mauso;
            // in ra tổng của 2 phân số
            System.out.println("Tổng 2 phân số: ");
            System.out.println(tongTu+"/"+tongMau);
        // nếu mẫu k bằng mẫu
        }else{
            // tổng của tử số sẽ bằng tử số của phân số này nhân cho mẫu số của phân số kia cộng lại
            int tongTu = fr1.tuso * fr2.mauso + fr1.tuso * fr2.mauso;
            // lấy 2 mẫu số nhân nhau
            int tongMau = fr1.mauso * fr2.mauso;
            // in ra tổng của 2 phân số
            System.out.println("Tổng 2 phân số: ");
            System.out.println(tongTu+"/"+tongMau);
        }
    }
    // Phương thức trừ
    public static void tru(Fraction fr1, Fraction fr2){
        // nếu mẫu số này bằng mẫu số kia thì
        if(fr1.mauso == fr2.mauso){
            // lấy tử số của phân số này trừ cho tử số của phân số kia
            int truTu = fr1.tuso - fr2.tuso;
            // mẫu số bằng mẫu số 1 phân số
            int truMau = fr1.mauso;
            // in hiệu 2 phân số
            System.out.println("Hiệu 2 phân số: ");
            System.out.println(truTu+"/"+truMau);
        // nếu không bằng
        }else{
            // Hiệu của tử số sẽ bằng tử số của phân số này nhân cho mẫu số của phân số kia trừ nhau
            int truTu = fr1.tuso * fr2.mauso - fr2.tuso * fr1.mauso;
            // lấy 2 mẫu số nhân nhau
            int truMau = fr1.mauso * fr2.mauso;
            // in hiệu 2 phân số
            System.out.println("Trừ 2 phân số: ");
            System.out.println(truTu+"/"+truMau);
        }
    }

    // Phương thức nhân
    public static void nhan(Fraction fr1, Fraction fr2){
        // Lấy 2 tử số nhân nhau
        int nhanTu = fr1.tuso * fr2.tuso;
        // Lấy 2 mẫu số nhân nhau
        int nhanMau = fr1.mauso * fr2.mauso;
        // in Tích 2 phân số
        System.out.println("Tích 2 phân số: ");
        System.out.println(nhanTu+"/"+nhanMau);
    }
    // Phương thức chia
    public static void chia(Fraction fr1, Fraction fr2){
        // tử số bằng tử số của phân số này nhân mẫu số của phân số kia
        int chiaTu = fr1.tuso * fr2.mauso;
        // mẫu số bằng mẫu số của phân số này nhân cho tử số của phân số kia
        int chiaMau = fr1.mauso * fr2.tuso;
        // in Thương 2 phân số
        System.out.println("Thương 2 phân số: ");
        System.out.println(chiaTu+"/"+chiaMau);
    }

    public static void main(String[] args){
        Fraction obj1 = new Fraction(3, 5);
        obj1.nhap();
        obj1.xuat();
        Fraction obj2 = new Fraction(2, 7);
        obj2.nhap();
        obj2.xuat();
        cong(obj1, obj2);
        tru(obj1, obj2);
        nhan(obj1, obj2);
        chia(obj1, obj2);
    }

}
