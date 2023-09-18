// Перевернутый LinkedList

// Пусть дан LinkedList с несколькими элементами.
// Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.

// Дан 
// [1, One, 2, Two]
// Вывод
// [1, One, 2, Two]
// [Two, 2, One, 1]

// import java.util.LinkedList;

// class LLTasks {
//     public static LinkedList<Object> revert(LinkedList<Object> ll) {
//        LinkedList<Object> revers = new LinkedList<>();
//        for (int i = ll.size()-1; i >= 0; i--) revers.add(ll.get(i));
//        return revers;
//     }
// }


// public class DZ4{ 
//     public static void main(String[] args) { 
//         LinkedList<Object> ll = new LinkedList<>();

//         if (args.length == 0 || args.length != 4) {
//             ll.add(1);
//             ll.add("One");
//             ll.add(2);
//             ll.add("Two");
//         } else {
//             ll.add(Integer.parseInt(args[0]));
//             ll.add(args[1]);
//             ll.add(Integer.parseInt(args[2]));
//             ll.add(args[3]);
//         }

//         LLTasks answer = new LLTasks();
//         System.out.println(ll);
//         LinkedList<Object> reversedList = answer.revert(ll);
//         System.out.println(reversedList);
//     }
// }


// Реализация очереди

// В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

// queue.enqueue(1);
// queue.enqueue(10);
// queue.enqueue(15);
// queue.enqueue(5);
// System.out.println(queue.getElements()); 
// // [1, 10, 15, 5]

// queue.dequeue();
// queue.dequeue();
// System.out.println(queue.getElements());
// // [15, 5]

// System.out.println(queue.first());
// // 15

// import java.util.LinkedList;

// class MyQueue<T> {
//   private LinkedList<T> LL = new LinkedList<>();

//     public void enqueue(T element){
//     LL.addLast(element);
//     }

//     public T dequeue(){
//       return LL.pollFirst();
//     }

//     public T first(){
//       return LL.getFirst();
//     }

//     public LinkedList<T> getElements() {
//       return LL;
//     }
// }

// public class DZ4 {
//     public static void main(String[] args) {
//         MyQueue<Integer> queue;
//         queue = new MyQueue<>();

//         if (args.length == 0) {
//             queue.enqueue(1);
//             queue.enqueue(10);
//             queue.enqueue(15);
//             queue.enqueue(5);
//         } else {
//             queue.enqueue(Integer.parseInt(args[0]));
//             queue.enqueue(Integer.parseInt(args[1]));
//             queue.enqueue(Integer.parseInt(args[2]));
//             queue.enqueue(Integer.parseInt(args[3]));
//         }

//         System.out.println(queue.getElements());

//         queue.dequeue();
//         queue.dequeue();
//         System.out.println(queue.getElements());

//         System.out.println(queue.first());
//     }
// }


// Калькулятор с отменой последней операции
// В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.

// Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' 
// калькулятор должен вывести результат предпоследней операции.

// calculate('+', 3, 7)
// calculate('+', 4, 7)
// calculate('<', 0, 0)

// 10
// 11
// 10

// calculate('*', 3, 2)
// calculate('-', 7, 4)
// calculate('<', 0, 0)

// 6
// 3
// 6

// import java.util.ArrayDeque;
// import java.util.Deque;

// class Calculator {
//   private Deque<Integer> DQ = new ArrayDeque<>();

//         public int calculate(char op, int a, int b) {
//                 // Напишите свое решение ниже
//             if (op == '<') {
//                 DQ.removeLast();
//             } else {
//                 DQ.add(calculateNow(op, a, b));
//             }
//             return DQ.getLast();
//         }
                
//         public int calculateNow(char op, int a, int b) {
//             int result = 0;
//             if (op == '+') result = a + b;
//             else if (op == '-') result = a - b;
//             else if (op == '*') result = a * b;
//             else if ((op == '/') && (b != 0)) result = a / b;
//             else result = -1;
//             return result;
//         }
// }

// public class DZ4 {
//     public static void main(String[] args) {
//         int a, b, c, d;
//         char op, op2, undo;
        
//         if (args.length == 0) {
//             a = 3;
//             op = '+';
//             b = 7;
//             c = 4;
//             op2 = '+';
//             d = 7;
//             undo = '<';
//         } else {
//             a = Integer.parseInt(args[0]);
//             op = args[1].charAt(0);
//             b = Integer.parseInt(args[2]);
//             c = Integer.parseInt(args[3]);
//             op2 = args[4].charAt(0);
//             d = Integer.parseInt(args[5]);
//             undo = args[6].charAt(0);
//         }

//         Calculator calculator = new Calculator();
//         int result = calculator.calculate(op, a, b);
//         System.out.println(result);
//         int result2 = calculator.calculate(op2, c, d);
//         System.out.println(result2);
//         int prevResult = calculator.calculate(undo, 0, 0);
//         System.out.println(prevResult);
//     }
// }