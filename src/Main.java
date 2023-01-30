import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double [] secondArray = {1.57, 7.654, 9.986};
        int [] apples = {91, 64, 55, 0, 0};
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[2]);
        double [] secondArray = {1.57, 7.654, 9.986};
        for (int i = 0; i < secondArray.length - 1; i++) {
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println(secondArray[2]);
        int [] apples = {91, 64, 55, 0, 0};
        for (int i = 0; i < apples.length - 1; i++) {
            System.out.print(apples[i] + ", ");
        }
        System.out.println(apples[4]);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 2; i >= 1; i = i - 1) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[0]);
        double [] secondArray = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 1; i = i - 1) {
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println(secondArray[0]);
        int [] apples = {91, 64, 55, 0, 0};
        for (int i = 4; i >= 1; i = i - 1) {
            System.out.print(apples[i] + ", ");
        }
        System.out.println(apples[0]);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] arr = {1, 2, 3};
        for (int i = 0; i <= 2; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}