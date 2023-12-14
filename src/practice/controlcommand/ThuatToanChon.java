package practice.controlcommand;

public class ThuatToanChon {
    /*Viết một chương trình java để sắp xếp dãy số bằng cách sử dụng thuật toán chọn(Selection Sort).
           Input: 18 9 33 4 84 32
           Output: 4 9 18 32 33 84
           */
    /* step1 cho mảng input
       step2 chạy vòng for từ 0 đến phần tử cuối của mảng
       step3 chạy vong for thứ 2 chạy từ i đến ptu cuối cùng trong mảng để so sáng
       step4 tìm phần tử nhỏ nhất có trong mảng
            4.1 cho min = arr[i](phần tử đầu tiên)
            4.2 duyệt step3
            4.3 arr[i] > arr[j]
            4.4 nếu > thì đổi lại min = arr[j]*/
    public int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minSort = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(minSort > arr[j]){
                    int tam = minSort;
                    minSort = arr[j];
                    arr[j] = tam;
                }
            }
        }
        return arr;
    }
}
