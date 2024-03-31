import java.util.Arrays;
import java.util.Random;

public class ArrayOps {
    public static void main(String[] args) {
        Random rand = new Random();

        //boyutları 0-5 aralığında random olarak belirleme
        int size1 = rand.nextInt(6); // 0-5 arası bir değer
        int size2 = rand.nextInt(6); // 0-5 arası bir değer1

        //oluşturma
        int[] set1 = new int[size1];
        int[] set2 = new int[size2];

        //random değerlerl
        fillArrayWithRandomValues(set1);
        fillArrayWithRandomValues(set2);

        //sıralama
        Arrays.sort(set1);
        Arrays.sort(set2);

        //yazdırma
        System.out.println("Sıralanmış 1. Dizi: " + Arrays.toString(set1));
        System.out.println("Sıralanmış 2. Dizi: " + Arrays.toString(set2));

        //elemanlarını çarpıp toplama
        int sum = multiplyAndSumArrays(set1, set2);
        System.out.println("Verilerin toplamı: " + sum);
    }

    public static void fillArrayWithRandomValues(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10); // 0-9 arası random değer
        }
    }

    public static int multiplyAndSumArrays(int[] array1, int[] array2) {
        int sum = 0;
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            sum += array1[i] * array2[i];
        }
        return sum;
    }
}
