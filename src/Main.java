import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        //Целочисленный массив, заполненный тремя цифрами
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        // Массив, в котором можно хранить три дробных числа
        double[] array2 = {1.57, 7.654, 9.986};

        // Произвольный массив
        int[] array3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Задача 2
        System.out.println("Задача 2");
        // Выводим элементы первого массива
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

        // Выводим элементы второго массива
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        // Выводим элемнты третьего массива
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length - 1) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }

        // Задача 3
        System.out.println("Задача 3");
        // Выводим элементы первого массива в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

        // Выводим элементы второго массива в обратном порядке
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        // Выводим элемнты третьего массива в обратном порядке
        for (int i = array3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }

        // Задача 4
        System.out.println("Задача 4");
        int[] arrayEven = new int[array.length];
        for (int i = 0; i < arrayEven.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[i] = array[i];
            } else {
                arrayEven[i] = array[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayEven));

    }
}