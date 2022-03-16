/*
  Дан двумерный массив A, размером (nxn). Найти среднее арифметрическое положительный элементов параллели главной диагонали, расположенной над главной диагональю.
*/

class Test{
    public static void main(String[] args) {
        int A[][] = {{1, 5, 7, 8},
                     {5, -8, -1, -12},
                     {7, -12, 7, 2},
                     {-12, 45, 7, 8}};
        int sum = 0; int k = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (j == i+1){
                    if (A[i][j] > 0){sum+=A[i][j];k++;}
                    break;
                }
            }
        }
        System.out.println(sum/k);
    }
}
