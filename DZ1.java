// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

// public class DZ1 {
//     public static void main(String[] args) {
//     System.out.println(countNTriangle(4));
// }
//     static int countNTriangle(int n) {     
//         if(n == 1) return 1;
//         return n + countNTriangle(n - 1);
//         // // Идеальное решение от GB
//         // int sum = 0;
//         // for(int i = 1; i <= n; i++){
//         //     sum += i;
//         // }
//         // return sum;
//     }
// }

// 2. Вывести все простые числа от 1 до 1000 

// public class DZ1 {
//     public static void main(String[] args) {
//         printPrimeNums();
// }
//     static void printPrimeNums() {        
//         for (int i = 1; i < 1000; i++) {
//             boolean flag = true;
//             for (int j = 2; j * j <= i; j++) {
//                 if (i % j == 0) flag = false;
//             }
//             if (flag) System.out.println(i);   
//         }
//     }
// }

// 3. Реализовать простой калькулятор

// public class DZ1 {
//     public static void main(String[] args) {
//         System.out.println(calculate('/', 4, 1));
// }
//     static int calculate(char op, int a, int b) {
//         var res = -1;
//         if (op == '+') res = a + b;
//         else if (op == '-') res = a - b;
//         else if (op == '*') res = a * b;
//         else if (op == '/' && b != 0) res = a / b;
//         else {
//             System.out.println("Некорректный оператор:'оператор'");
//         }
//         return res;
//     }
//     // static int calculate(char op, int a, int b) {
//     //     int res = 0;
//     //     switch (op) {
//     //         case '+':
//     //             res = a + b;
//     //         case '-':
//     //             res = a - b;
//     //         case '*':
//     //             res = a * b;
//     //         case '/':
//     //             if (b != 0) res = a / b;
//     //             else res = -1;
//     //         default:
//     //             System.out.println("Некорректный оператор:'оператор'");
//     //     }
//     //     return res;
//     // }
// }