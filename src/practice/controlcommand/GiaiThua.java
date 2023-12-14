package practice.controlcommand;

public class GiaiThua {
    /*Viết một chương trình java tính giai thừa của một số không sử dụng đệ quy và có sử dụng đệ quy.
          Input: 0
          Output: 1
          Input: 5
          Output: 120*/
    // không dùng đệ qui
    /* step1 cho số n
       step2 tạo 1 tổng sum =1
       step3 chạy vòng for chạy từ 1 đến n
       step4 sum = sum * i
       step5 in sum */
    public void factorialNotUseRecursion(int numbers){
        int sum = 1;
        for(int i = 1;i <= numbers; i++ ){
            sum *= i;
        }
        System.out.println("Giai thừa của số "+numbers+ " là: "+sum);
    }
    // sử dụng đệ qui
    /* step1 cho số n
       step2 cho tổng sum = 1
       step3 kiểm tra n có bằng 1 k
       step4 nếu bằng 1 thì return sum
       step5 k bằng 1 thì lấy n nhân với đệ quy của (n-1)
    public int factorialUseRecursion(int numbers){
        int sum = 1;
        if(numbers == 1)
            return sum;
        else{
            return factorialUseRecursion(numbers -1)* numbers;
        }

    }
}
