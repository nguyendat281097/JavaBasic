package OOP.VeMayBay;

import java.util.Scanner;

public class Date {
    // lớp ngày tháng năm
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // Nhập ngày tháng năm
    public void nhapDate(){
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextInt();
        System.out.print("/");
        month = scanner.nextInt();
        System.out.print("/");
        year = scanner.nextInt();
    }
    // xuất ngày tháng năm
    public void xuatDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
