package practice.controlcommand;

public class ChuyenHeCoSo {
    /*Viết một chương trình java để chuyển đổi số nguyên N sang hệ cơ số B.
        Input: Chuyển số 15 sang hệ cơ số 2
        Output: 1111
        */
     /* step1 cho số n = 15
        step2 cho n/=2 lấy số nguyên chia cho đến khi n = 0, đếm xem chia đc bn lần sẽ đc số chữ trong B
        step3 tạo mảng arr chứa các số B(input)
        step4 cho index u = 0
        step5 ktra xem n!= 0
            5.1 nếu khác thì lấy a[u] = n%2 lấy phần dư, n /= 2, index u++
            5.2 nếu n = 0 thì kết thúc
        step6 đảo ngược mảng vừa tìm lại ra output*/
    public void conversionCoefficient(int n){
        int dem = 0;
        int tam = n;
        //step2 cho n/=2 lấy số nguyên chia cho đến khi n = 0
        while(tam != 0){
            tam /= 2;
            //đếm xem chia đc bn lần sẽ đc số chữ trong B
            dem++;
        }
        //step3 tạo mảng arr chứa các số B(input)
        int[] arr = new int[dem];
        //step4 cho index u = 0
        int u = 0;
        //step5 ktra xem n!= 0
        while(n != 0){
            // 5.1 nếu khác thì lấy a[u] = n%2 lấy phần dư, n /= 2, index u++
            arr[u] = n%2;
            n /= 2;
            u++;
            //5.2 nếu n = 0 thì kết thúc
        }
        //step6 đảo ngược mảng vừa tìm lại ra output
        for(int i = 0; i < dem/2 ; i++){
            tam = arr[i];
            arr[i] = arr[dem - i - 1];
            arr[dem - i - 1] = tam;
        }
        print(arr);
    }
    public void print(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
