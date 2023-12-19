package OOP;

import java.util.Scanner;

public class VanDongVien implements Comparable<VanDongVien> {
    /*Xây dựng lớp vận động viên VanDongVien gồm:
        Thuộc tính: hoten (chuỗi ký tự), tuoi (số nguyên), monthidau (chuỗi ký tự), cannang (số thực), chieucao (số thực).
        Phương thức:
        Thiết lập không tham số.
        Thiết lập 5 tham số
        Hủy bỏ
        Nạp chồng toán tử nhập >>
        Nạp chồng toán tử xuất <<
        Nạp chồng toán tử so sánh > (một vận động viên là lớn hơn nếu chiều cao lớn hơn,trong trường hợp chiều cao bằng nhau thì xét cân nặng lớn hơn)
        Xây dựng chương trình chính:
        Khai báo p là đối tượng lớp Vandongvien (sử dụng hàm thiết lập 5 tham số), hiển thị thông tin của p ra màn hình.
        Nhập vào một mảng gồm n vận động viên.
        Hiển thị danh sách đã nhập ra màn hình.
        Sắp xếp mảng đã nhập theo thứ tự tăng dần, hiển thị danh sách đã sắp ra màn hình.*/

    private String hoten;
    private int tuoi;
    private String monThiDau;
    private float canNang;
    private float chieuCao;
    // thiết lập không tham số
    public VanDongVien(){
    }
    // thiết lập 5 tham số
    public VanDongVien(String hoten, int tuoi, String monThiDau, float canNang, float chieuCao) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.monThiDau = monThiDau;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
    }
    // Hàm hủy bỏ
    // (Java tự động quản lý bộ nhớ, nên không cần phải tạo hàm hủy bỏ)

    // Nạp chồng toán tử nhập >>
    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoten = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine(); // Đọc kí tự Enter còn lại
        System.out.print("Nhập môn thi đấu: ");
        monThiDau = scanner.nextLine();
        System.out.print("Nhập cân nặng: ");
        canNang = scanner.nextFloat();
        System.out.print("Nhập chiều cao: ");
        chieuCao = scanner.nextFloat();
    }
    // Nạp chồng toán tử xuất <<
    public void xuatThongTin() {
        System.out.println("Họ tên: " + hoten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Môn thi đấu: " + monThiDau);
        System.out.println("Cân nặng: " + canNang);
        System.out.println("Chiều cao: " + chieuCao);
    }
    //Nạp chồng toán tử so sánh > (một vận động viên là lớn hơn nếu chiều cao lớn hơn,
    // trong trường hợp chiều cao bằng nhau thì xét cân nặng lớn hơn)
    public int compareTo(VanDongVien other){
        if(this.chieuCao == other.chieuCao){
              return Double.compare(this.canNang, other.canNang);
        }else
            return Double.compare(this.chieuCao, other.chieuCao);
    }


    public static void main(String[] args) {
        //Khai báo p là đối tượng lớp Vandongvien (sử dụng hàm thiết lập 5 tham số), hiển thị thông tin của p ra màn hình.
        //        Nhập vào một mảng gồm n vận động viên.
        //        Hiển thị danh sách đã nhập ra màn hình.
        //        Sắp xếp mảng đã nhập theo thứ tự tăng dần, hiển thị danh sách đã sắp ra màn hình.
        // khởi tạo đối tượng p tên Nguyễn Văn A tuổi 24, môn thi đấu Bóng Đá, cân nặng 75.4, chiều cao 179.2
        VanDongVien p = new VanDongVien("Nguyễn Văn A", 24, "Bóng Đá", 75.4F, 179.2F);
        // Nhập vào một mảng gồm n vận động viên.
        Scanner input = new Scanner(System.in);
        // n vận động viên
        System.out.print("nhập số vận động viên: ");
        int n = input.nextInt();
        // mảng gồm n vận động viên
        VanDongVien[] danhSach = new VanDongVien[n];
        // chạy mảng
        for(int i = 0; i < n; i++){
            // khai báo phần tử thứ i trong danh sách là 1 vận động viên
            danhSach[i] = new VanDongVien();
            System.out.print("vận động viên thứ "+ i+1+ ": " );
            // nhập dữ liêuj cho vận động viên thứ i
            danhSach[i].nhapDuLieu();
        }
        //Hiển thị danh sách đã nhập ra màn hình.
        System.out.println("Danh sách vận động viên: ");
        for(VanDongVien vd : danhSach){
            vd.xuatThongTin();
            System.out.println("----------------");
        }
        // Sắp xếp mảng đã nhập theo thứ tự tăng dần, hiển thị danh sách đã sắp ra màn hình.
        // step1 duyệt mảng, so sánh vdv đầu tiên với các vdv khác sẽ tìm đc vdv có chiều cao nhỏ nhất sắp ở đầu, lm tương tự ở sau
        for(int i = 0; i < n -1; i++){
            for(int j = i + 1; j < n; j++){
                // dùng phương thức só sánh ở trên (một vận động viên là lớn hơn nếu chiều cao lớn hơn,
                // trong trường hợp chiều cao bằng nhau thì xét cân nặng lớn hơn)
                // nếu phương thức trả về > 0 tức phần tử ở trước cao hơn (hoặc nặng hơn nếu chiều cao 2 vdv bằng nhau)
                if(danhSach[i].compareTo(danhSach[j]) > 0) {
                    // thì đổi chỗ 2 vdv
                    VanDongVien tam = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = tam;
                }
            }
        }
        // Hiển thị danh sách đã nhập ra màn hình.
        System.out.println("Danh sách đã sắp xếp: ");
        for(VanDongVien vd : danhSach){
            vd.xuatThongTin();
            System.out.println();
        }


    }



}
