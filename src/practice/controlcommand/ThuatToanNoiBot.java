package practice.controlcommand;

public class ThuatToanNoiBot {
    /*Viết một chương trình java để sắp xếp dãy số bằng cách sử dụng thuật toán nổi bọt.
          Input: 18 9 33 4 84 32
          Output: 4 9 18 32 33 84*/
    /*step1 tạo 1 mảng input
      step2 chạy vòng for từ 0 đến phần tử kề cuối của mảng
      step3 chạy vong for thứ 2 chạy từ i+1 đến ptu cuối cùng trong mảng để so sáng
      step4 so sánh arr[i] với arr[j]
      step5 nếu arr[i] > arr[j]
      step6 thì hoán đổi vị trí của chúng*/
    public int[] BubbleSort(int[] arr){
        int tam =0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }
            }
        }
        return arr;
    }
}