package practice.controlcommand;

public class SoNguyenTo {
    /*Viết một chương tình java kiểm tra số nguyên tố.
         Input: 44
         Output: không phải là số nguyên tố.
         Input: 7
         Output: là số nguyên tố.*/
    /*step1 cho 1 số n
      step2 lập vòng for chạy từ 2 đến n-1
      step3 ktra n có chia hết cho số nào trong for k
      step4 nếu chia hết in ra n k là số ngto
      step5 in ra n là số ng tố*/
    public int Prime(int numbers){
        for(int i = 2; i <= numbers -1; i++){
            if( (numbers % i) == 0){
                return 1;
            }
        }
        return -1;
    }
}
