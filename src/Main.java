import lesson.classandobject.Student;
import practice.controlcommand.*;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        Student a = new Student("Nguyễn Văn A", 22, "DH20DT");
        Student b = new Student();
        b.setAge(33);
        Student c = new Student("Nguyễn Văn C", 25);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int input = 10;
        Fibonacci f = new Fibonacci();
        System.out.print("k đệ qui: ");
        f.printFibonacciNotUseRecursion(input);
        System.out.println();
        System.out.print(" đệ qui: ");
        for(int i = 0; i< input; i++){
            System.out.print(f.printFibonacciUseRecursion(i)+" ");
        }
        System.out.println();
        SoNguyenTo s = new SoNguyenTo();
        int soInput = 3;
        if(s.Prime(soInput) == 1){
            System.out.println(soInput+" k là số nguyên tố");
        }else{
            System.out.println(soInput+" là số nguyên tố");
        }
        int soN = 3;
        GiaiThua g = new GiaiThua();
        System.out.println("k đệ qui: ");
        g.factorialNotUseRecursion(soN);
        System.out.println();
        System.out.println("đệ qui: ");
        System.out.println("Giai thừa của số "+ soN+ " là: "+g.factorialUseRecursion(soN));

        System.out.print("Input: ");
        print(arr);
        System.out.println("Thuật toán nổi bọt");
        System.out.print("Output: ");
        ThuatToanNoiBot t = new ThuatToanNoiBot();
        print(t.BubbleSort(arr));
        System.out.println("Thuật toán chọn");
        System.out.print("Output: ");
        ThuatToanChon tc = new ThuatToanChon();
        print(tc.selectionSort(arr));*/
        /*int[] arr = {18, 9, 76,34, 21, 6, 0, 45, 5, 8, 12};
        print(arr);
        System.out.println("Thuật toán chèn");
        System.out.print("Output: ");
        ThuatToanChen ttc = new ThuatToanChen();
        print(ttc.insertionSort(arr));*/
        /*System.out.println("Chuyển đổi hệ cơ số");
        int n =26;
        System.out.println("Inpur n: "+n);
        System.out.print("Output: ");
        ChuyenHeCoSo cs = new ChuyenHeCoSo();
        cs.conversionCoefficient(n);
        System.out.println("String");
        cs.stringconversionCoefficient(n);*/
    }
    public static void print(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}