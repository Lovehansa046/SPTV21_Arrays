import java.util.Random;

public class SPTV21_Arrays {
    public static void main(String[] args) {
        System.out.println("-------------Демонстрация массивов-------------");
        int[]arr1 = new int[10];
        Random random = new Random();
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        int sum = 0;
        System.out.print("[");
        for (int j : arr1) {
            System.out.printf("%2d", j);
            sum += j;
        }
        int maxNum = arr1[0];
        for(int j : arr1) {
            if (j>maxNum)
                maxNum = j;
        }
        int minNum = arr1[0];
        for(int j : arr1) { 
            if (j < minNum)
                minNum = j;
        }
        System.out.print("]");
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println("Maximum number = " + maxNum);
        System.out.println("Minimum number = " + minNum);
        
        System.out.println("-------Демонтрация массивов [][]-----------");
        int[][] arr2 = new int[10][10];
        for(int i=0;i<arr2.length;i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = random.nextInt(100);
            }
        }
        for(int i=0;i<arr2.length;i++) {
            for (int j = 0; j < arr2[i].length; j++){
                System.out.printf("%4d", arr2[i][j]);
                if(minNum > arr2[i][j]) minNum = arr2[i][j];
                if(maxNum < arr2[i][j]) maxNum = arr2[i][j];
                sum += arr2[i][j];
            }
            System.out.println();
        }
        System.out.println("Максимальное число: " + maxNum);
        System.out.println("Мнимальное число: " + minNum);
        System.out.println("Сумма: " + sum);


    }
}
