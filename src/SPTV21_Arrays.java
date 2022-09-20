import java.util.Random;

public class SPTV21_Arrays {
    public static void main(String[] args) {
        System.out.println("-------------Демонстрация массивов-------------");
        int[] arr1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        int sum = 0;
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%2d", arr1[i]);
            sum += arr1[i];
        }
        int maxNum = arr1[0];
        for (int j : arr1) {
            if (j > maxNum)
                maxNum = j;
        }
        int minNum = arr1[0];
        for (int j : arr1) {
            if (j < minNum)
                minNum = j;
        }
        System.out.print("]");
        System.out.println();
        System.out.println("sum = " + sum);
        System.out.println("Maximum number = " + maxNum);
        System.out.println("Minimum number = " + minNum);

        System.out.println("-------Демонтрация массивов [][]-----------");
        int summa = 0;
        int[][] arr2 = new int[10][10];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = random.nextInt(10);
            }
        }
        int minimumNum = arr2[0][0];
        int maximNum = arr2[0][0];
        int sumUp = 0;
        int sumDown = 0;
        int sumdia1 = 0;
        int sumdia2 = 0;
        int i1 = 0;
        int j1 = 0;
        int i2 = 0;
        int j2 = 9;
        int d = 0;
        int x = arr2.length;
        int s = 0;
        int linesum = 0;
        for (; i1 < arr2[i1].length; i1++, j1++) {
            if (j1 == 9) {
                sumdia1 += arr2[9][9];
                break;

            } else {
                sumdia1 += arr2[i1][j1];
            }

        }
        for (; i2 < arr2[i2].length; i2++, j2--) {
            if (j2 == 0) {
                sumdia2 += arr2[9][0];
                break;
            } else {
                sumdia2 += arr2[i2][j2];

            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%4d", arr2[i][j]);
                if (minimumNum > arr2[i][j]) minimumNum = arr2[i][j];
                if (maximNum < arr2[i][j]) maximNum = arr2[i][j];
                summa += arr2[i][j];
            }
            System.out.println();
        }
        {
            while (s < x) {
                for (int i = 0; i < x; i++) {
                    linesum += arr2[i][s];
                }
                s++;
                System.out.println("Сумма елементов столбца " + s + " равна: " + linesum);
                linesum = 0;
            }
            System.out.println();

            {
                while (d < x) {
                    for (int i = 0; i < x; i++) {
                        sumUp += arr2[d][i];
                    }
                    d++;
                    System.out.println("Сумма елементов строки " + d + " равна: " + sumUp);
                    sumUp = 0;
                }
                System.out.println("Сумма елементов 1 диагонали равна: " + sumdia1);
                System.out.println("Сумма елементов 2 диагонали равна: " + sumdia2);
                System.out.println("Максимальное число: " + maximNum);
                System.out.println("Мнимальное число: " + minimumNum);
                System.out.println("Сумма: " + summa);
                System.out.println("Сумма елементов второго столбца равна: " + sumUp);


            }
        }
    }
}
