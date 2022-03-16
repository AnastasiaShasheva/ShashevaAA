class Test{
/*
   Определить дополнительный массив, состоящий из неповторяющихся элементов исходного массива и вывести его на экран.
*/
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 2, 3, 4, 4, 5};
        int[] arr2 = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++){
            boolean flag = true;
            for (int j = 0; j < arr2.length; j++){
                if (arr[i] == arr2[j]){flag = false; break;}
            }
            if (flag == true){
                arr2[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
