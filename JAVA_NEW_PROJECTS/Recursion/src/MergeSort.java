public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        sort(arr,arr.length);
        for (int i: arr)
        {
            System.out.print(i+" ");

        }
    }
    public  static  void sort(int[] arr, int high){
            if(high<=1)
                return;
            int mid = high/2;
            int[] l = new int[mid];
            int[] r = new int[high-mid];
        for(int i = 0; i < mid ; i++) {
                l[i] = arr[i];

        }
        int k = 0;
        for (int j = mid; j < high ; j++) {
            r[k] = arr[j];
            k++;

        }
        k++;
        sort(l,mid);
        sort(r,high-mid);
        merge(arr,l,r,mid,high-mid);

    }

    private static void merge(int[] arr, int[] l, int[] r, int low, int high) {
            int i = 0, j = 0, k = 0;
            while(i<low && j<high){
                    if(l[i]<=r[j]){
                        arr[k++]=l[i++];

                    }else {
                        arr[k++]=r[j++];

                    }
            }
            while (i<low){
                arr[k++]=l[i++];

            }
        while (j<high){
            arr[k++]=l[j++];

        }
    }
}
