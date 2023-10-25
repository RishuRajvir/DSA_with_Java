public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        sort(arr,0,arr.length-1);
        for (int i: arr) {
            System.out.print(i+" ");;

        }
    }
    public  static  void sort(int[] arr,int low, int high) {
        if (low < high) {
            int pidx = partion(arr,low,high);
                sort(arr,low,pidx-1);
                sort(arr,pidx+1,high);
            ;
        }
    }

    private static int partion(int[] arr, int low, int high) {
                int pivot = arr[high];
                int idx = low -1;
                for(int i = low; i < high ; i++) {
                        if(arr[i]<pivot) {
                            idx++;
                            int temp = arr[idx];
                            arr[idx] = arr[i];
                            arr[i] = temp;
                        }
                }int temp = arr[idx+1];
                        arr[idx +1] = arr[high];
                        arr[high] = temp;

                        return idx+1;
                }

}
