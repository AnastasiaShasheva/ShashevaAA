/*
  Определить матрицу и ее заполнить случайными значениями. Постоить вектор В, который возвращает значение элемента матрицы, не равное заданному значению.
*/

import java.util.Vector;

class Test{
    public static void main(String[] args) {
        int n = 5; int m = 4; //размер матрицы
        int a = 8; //заданное значение
        
        int arr[][] = new int[n][m];
        Vector B = new Vector();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = (int) (Math.random()*10);
            }
        }
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr[i][j] != a){B.add(arr[i][j]);}
            }
        }
        System.out.println(B);
    }
}
