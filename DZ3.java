// import java.util.ArrayList;
// import java.util.Arrays;

// public class DZ3 {
    // Сортировка слиянием
    // Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a 
    // и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
    // Пример:
    // a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

    // public static int[] mergeSort(int[] a) {
    //     if(a == null) return null;
    //     if (a.length < 2) return a;  
    //     int mid = a.length / 2;   
    //     int[] array_B = new int[mid];
    //     int[] array_C = new int[a.length - mid];
    //     for (int i = 0; i < mid; i++) {
    //         array_B[i] = a[i];            
    //     }
    //     for (int i = mid; i < a.length; i++) {
    //         array_C[i - mid] = a[i];
    //     }
    //     array_B = mergeSort(array_B);
    //     array_C = mergeSort(array_C);
    //     return mergeArray(array_B, array_C);
    // }

    // public static int[] mergeArray(int[] array_B, int[] array_C) {
    //     int b = array_B.length;
    //     int c = array_C.length;  
    //     int[] array_D = new int[b + c];   
    //     int i = 0, j = 0, k = 0;
    //     while(i < b && j < c){
    //         if (array_B[i] <= array_C[j]){
    //             array_D[k++] = array_B[i++];
    //         } else {
    //             array_D[k++] = array_C[j++];
    //         }
    //     }
    //     while(i < b){
    //         array_D[k++] = array_B[i++]; 
    //     } 
    //     while(j < c){
    //         array_D[k++] = array_C[j++];
    //     }
    //     return array_D;
    // }

    // public static void main(String[] args) {
    //     int[] a = new int[]{5, 1, 6, 2, 3, 4};
    //     System.out.println(Arrays.toString(a));
    //     System.out.println(Arrays.toString(mergeSort(a)));
    // }

    // Удаление четных элементов
    // Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, 
    // удаляла бы из него четные числа и выводила список без четных чисел.
    // Напишите свой код в методе removeEvenNumbers класса Answer. 
    // Метод removeEvenNumbers принимает на вход один параметр:
    // Integer[] arr - список целых чисел

    // Пример:
    // arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    // removeEvenNumbers(arr);
    // [1, 3, 5, 7, 9]

    // arr = new Integer[]{2, 4, 6, 8};
    // removeEvenNumbers(arr);
    // []

    // public static void removeEvenNumbers(Integer[] arr) {
    //   ArrayList<Integer> arr_1 = new ArrayList<>();
    //   for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] % 2 != 0) arr_1.add(arr[i]);
    //     }
    //     System.out.println(arr_1);
    // }
    
    // public static void main(String[] args) {
    //     Integer[] arr = new Integer[]{2, 4, 6, 8, 9, 10};
    //     removeEvenNumbers(arr);
    // }

    // Анализатор списка
    // Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
    // Сортирует его по возрастанию и выводит на экран
    // Находит минимальное значение в списке и выводит на экран - Minimum is {число}
    // Находит максимальное значение в списке и выводит на экран - Maximum is {число}
    // Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
    // Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
    // Integer[] arr - список целых чисел
    // Пример:
    // arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
    // analyzeNumbers(arr)
    // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    // Minimum is 1
    // Maximum is 9
    // Average is = 5
    
    // public static void analyzeNumbers(Integer[] arr) {
    //   Arrays.sort(arr);
    //   System.out.println(Arrays.toString(arr));
    //   System.out.println("Minimum is " + arr[0]);
    //   System.out.println("Maximum is " + arr[arr.length - 1]);
    //   int summa = 0;
    //   for (int s : arr) summa += s;
    //   System.out.println("Average is = " + summa / arr.length);
    // }

    // public static void main(String[] args) {
    //     Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
    //     analyzeNumbers(arr);
    // }
// }
