package practice.controlcommand;

public class ThuatToanChen {
    /*Viết một chương trình java để sắp xếp dãy số bằng cách sử dụng thuật toán chèn(Insertion Sort).
          Input: 18 9 33 4 84 32
          Output: 4 9 18 32 33 84*/
    /*18 9 33 4 84 32
       step1 chọn key i = 1
       18 9| 33 4 84 32
       step2 so sánh key với phtu đằng trước
       step3 dặt key vào đúng vị trí của nó
       9 18 33| 4 84 32
       9 18 33 4| 84 32
       4 9 18 33 84| 32
       4 9 18 33 84 32|
       4 9 18 33 32 84

       */
    public int[] insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int key = arr[1];
            for(int j = 0; j < i; j++){
                if(arr[i] < arr[j]){
                    int tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }
            }
        }
        return arr;
    }
}
