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
       0 1  2  3  4  5
               j     i
                   33  84
               arr[u] = arr[u-1];
       4 9 18 33 32 84

       */
    /*step1 duyệt mảng chạy từ ptu thứ i = 1 đến ptu cuối cùng
      step2 chọn phần tử thứ i là key
      step3 duyệt mảng chạy từ 0 đến ptu trước key
      step4 kiểm tra phần tử thứ j có lớn hơn key k
      step5 duyệt mảng chạy lùi từ i tới j+1
      step6 cho phần tử thứ u = ptu thứ u-1
      step7 cho phần tử thứ j = key*/
    public int[] insertionSort(int[] arr){
        int v = arr.length ;
        for(int i = 1; i < v; i++){
            //18 9| 33 4 84 32 76 45 5 8 12
            int key = arr[i];
            int j;
            /*for(int j = 0; j < i; j++) {
                //18 9| 33 4 84 32 76 45 5 8 12
                //9 18 33| 4 84 32 76 45 5 8 12
                //9 18 33 4| 84 32 76 45 5 8 12
                //4 9 18 33 84| 32 76 45 5 8 12
                //4 9 18 33 84 32| 76 45 5 8 12
                //       j4    i5
                //4 9 18 32 33 84 76| 45 5 8 12
                //             j5  i6
                //4 9 18 32 33 76 84 45| 5 8 12
                //4 9 18 32 33 45 76 84 5| 8 12
                //             j5    i7
                if (key < arr[j]) {
                    int temp = arr[j];
                    for (int u = i; u > j; u--) {
                        arr[u] = arr[u - 1];
                    }
                    arr[j] = key;
                }
            }*/
            for( j = i-1; j>=0 && arr[j]>key; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
