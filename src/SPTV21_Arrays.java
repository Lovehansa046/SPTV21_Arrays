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


    }
}
