/*
  Дан массив b(n). Переписать в массив С(n) отрицательные элементы b(n). (Со сжатием). Затем упорядочить по возрастанию новый массив.
*/

class Test{
    public static void main(String[] args) {
        int b[] = new int[] {-1, 5, -5, 56, -8, -80, -50, 100};
        int k = 0; int n = 0;
        for (int i = 0; i < b.length; i++){if (b[i] < 0){k++;}}

        int c[] = new int[k];
        for (int i = 0; i < b.length; i++){
            if (b[i] < 0){c[n] = b[i]; n++;}
        }

        for (int i = 0; i < c.length-1; i++) {
            for (int j = i+1; j < c.length; j++) {
                if (c[i] < c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        for (int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}
