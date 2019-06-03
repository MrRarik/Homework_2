/**
 * Level 1 , lesson 2.
 * @author Maluy Yaroslav
 * data 03.06.2019
 */
import java.util.Arrays;

public class Homework_2 {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        checkMaxAndMin();
      }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        public static void invertArray () {
            int[] arr = {0, 1, 1, 0, 1, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i]++;
                } else {
                    arr[i]--;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        public static void fillArray () {
            int[] arr = new int[8];
            for (int i = 0, j = 0; i < arr.length; i++, j = j + 3) {
                arr[i] = j;
            }
            System.out.println(Arrays.toString(arr));
        }
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        public static void changeArray() {
         int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
         for (int i = 0; i<arr.length; i++) {
             if (arr[i] < 6) {
                 arr[i] = arr[i] * 2;
             }
         }
         System.out.println(Arrays.toString(arr));
      }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {
        int n = 4;
        int k = n - 2;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j || i == n + k - j)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
          }
        }
    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        public static void checkMaxAndMin(){
        int[] arr = {5, 7, 21, 1, 10, 6, 12, 0};
        int max = arr[0];
        int min = arr[0];
         for (int i = 0; i<arr.length; i++) {
             if (max < arr[i]) {
                 max = arr[i];
             }
             if (min > arr[i]) {
                 min = arr[i];
             }
         }
         System.out.println("Минимальное: " + min);
         System.out.println("Максимальное: " + max);
        }
    }




