package OOP.VeMayBay;

import OOP.VeMayBay.HanhKhach;

import java.util.Scanner;

public class MainVeMayBay {
    public static void main(String[] args) {

    /*Chương trình chính: Nhập vào 1 danh sách n hành khách (n nhập từ bàn phím).
        Hiển thị danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.
        Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền*/
        //step1 Nhập vào 1 danh sách n hành khách
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hành khách: ");
        int n = scanner.nextInt();
        HanhKhach[] danhSach = new HanhKhach[n];
        // nhập danh sách hành khác
        for(int i = 0; i < n; i++){
            danhSach[i] = new HanhKhach("", "", 0, 0);
            System.out.println("Hành khách thứ: "+(i+1)+": ");
            danhSach[i].nhap();
        }
        // in danh sách hành khách
        System.out.println("Danh sách hành khách: ");
        for(HanhKhach hk : danhSach){
            hk.xuat();
            System.out.println("------------------");
        }
        //Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền
        for(int i = 0; i < n -1; i++){
            for(int j = i+1; j < n; j++){
                if(danhSach[i].tongTien() < danhSach[j].tongTien()){
                    HanhKhach tam = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = tam;
                }
            }
        }
        // in danh sách hành khách sau khi săp xếp
        System.out.println("Danh sách hành khách sau khi sắp xếp: ");
        for(HanhKhach hk : danhSach){
            hk.xuat();
            System.out.println("------------------");
        }
    }
}
