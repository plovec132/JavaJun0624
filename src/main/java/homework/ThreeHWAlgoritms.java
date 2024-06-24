package homework;

import java.util.Arrays;

public class ThreeHWAlgoritms {
    public static void main() {
        int[] arrayForOneTwoTask = {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        System.out.println(Arrays.toString(selectionSort(arrayForOneTwoTask)));
        System.out.println(Arrays.toString(insertionSort(arrayForOneTwoTask)));

        int target = 2;
        System.out.println(indexInUnsortedArray(arrayForOneTwoTask, target));

        int[] arrayForThreeTask = {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int targetForThreeTask = 8;

        System.out.println(boubleSortAndBinSerch(arrayForThreeTask, targetForThreeTask));


    }

    //        1. Сортировка массива методом выбора natural order.
    private static int[] selectionSort(int[] array) {

        // перемещаем границу неотсортированной части массива
        for (int i = 0; i < array.length; i++) {
            // Находим минимальный элемент в неотсортированной части массива
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) minIndex = j;
            }

            // Меняем местами найденный минимальный элемент с первым элементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }
        return array;

    }


    //        2. Сортировка массива методом вставок
    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];  // текущий элемент
            int j = i - 1;  //

            // Перемещаем элементы массива, которые меньше ключа,
            // на одну позицию вперёд от их текущей позиции
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

    //    3. Вывести индекс числа в неупорядоченном массиве с использованием линейного поиска. Если число не найдено, выводим -1.
    private static int indexInUnsortedArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Возвращаем -1, если элемент не найден
    }

//    1. Найти число в неупорядоченном массиве, используя бинарный поиск и сортировку массива пузырьком.
//    Если число найдено, вернуть число, если не найдено, вернуть -1.
//    Массив состоит из неотрицательных чисел.
    private static int boubleSortAndBinSerch(int[] array, int target) {
    array = boubleSort(array);

    return binarySearch(array, target);
    }

    private static int[] boubleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен arr[j] и arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    private static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверка, что ключ находится в середине массива
            if (array[mid] == key) {
                return mid; // Возвращаем индекс найденного элемента
            }

            // Если ключ больше, игнорируем левую половину
            if (array[mid] < key) {
                left = mid + 1;
            }
            // Если ключ меньше, игнорируем правую половину
            else {
                right = mid - 1;
            }
        }

        // Ключ не найден в массиве
        return -1;
    }
}


