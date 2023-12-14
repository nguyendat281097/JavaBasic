package practice.controlcommand;

public class Fibonacci {
    /*Viết một chương trình java in ra dãy số Fibonacci không sử dụng đệ quy và có sử dụng đệ quy.
           Input: 10
           Output: 0 1 1 2 3 5 8 13 21 34*/
    /*step1 tạo 1 mảng với kích thước bằng Input
      step2 duyệt mảng
      step3  ktr index=0|1, arr[0] và arr[1] = index [0,1,....]
      step4  nếu không thì arr[i] = arr[i-1] + arr[i-2] (i != 0, 1)
      step5 in */
    public void printFibonacciNotUseRecursion(int numbers) {
        int[] arr = new int[numbers];
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || i == 1){
                arr[i] = i;
                System.out.print(arr[i]+" ");
            }else{
                arr[i] = arr[i - 1] + arr[i - 2];
                System.out.print(arr[i]+" ");
            }
        }
    }
    /*  phương pháp đệ qui
            step1 duyệt mảng
            step2 kiểm tra i có bằng 0 || 1
            step3 nếu bằng return i
            step4 k bằng return printFibonacciUseRecursion(i -1) + printFibonacciUseRecursion(i - 2)
            step5 in ra màn hình
    */
    public int printFibonacciUseRecursion(int numbers) {
        int i = numbers;
            if( i == 0 || i == 1){
                return i;
            }else{
                return printFibonacciUseRecursion(i -1) + printFibonacciUseRecursion(i - 2);
            }
    }

}
