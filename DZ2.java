// Дана строка sql-запроса:
// select * from students where " 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Пример данных для фильтрации приведены ниже в виде json-строки. 
// Если значение null, то параметр не должен попадать в запрос.

// Пример:
// {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"} 
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

// String QUERY - начало SQL-запроса 
// String PARAMS - JSON с параметрами

// public class DZ2 {
//     public static void main(String[] args) {
//         String QUERY = "select * from students where ";
//         String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//         String[] mas = PARAMS.split(",");
//         String nameArray = mas[0].replace("{", "").replace("\"", "");
//         String countryArray = mas[1].replace("\"", "");
//         String cityArray = mas[2].replace("\"", "");
//         String ageArray = mas[3].replace("\"", "").replace("}", "");
//         String name_0 = nameArray.split(":")[0];
//         String country_0 = countryArray.split(":")[0];
//         String city_0 = cityArray.split(":")[0];
//         String age_0 = ageArray.split(":")[0];
//         String name_1 = nameArray.split(":")[1];
//         String country_1 = countryArray.split(":")[1];
//         String city_1 = cityArray.split(":")[1];
//         String age_1 = ageArray.split(":")[1];  
//         StringBuilder sb = new StringBuilder(QUERY);    
//         if(!name_1.equals("null")) {
//             sb.append(name_0).append("=").append("'").append(name_1).append("'").append(" and");
//         }       
//         if(!country_1.equals("null")) {
//             sb.append(country_0).append("=").append("'").append(country_1).append("'").append(" and");
//         }
//         if(!city_1.equals("null")) {
//             sb.append(city_0).append("=").append("'").append(city_1).append("'").append(" and");
//         }
//         if(!age_1.equals("null")) {
//             sb.append(age_0).append("=").append("'").append(age_1).append("'").append(" and");
//         }
//         // sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1);
//         sb.replace(sb.length() - 4, sb.length(), "");
//         System.out.println(sb);
//     }
// }

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
// int[] arr - числовой массив

// После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' 
// в формате год-месяц-день час:минуты {массив на данной итерации}.

// Пример
// arr = new int[]{9, 4, 8, 3, 1}; 
// sort(arr)
// При чтении лог-файла получим: 
// 2023-05-19 07:53 [4, 8, 3, 1, 9] 
// 2023-05-19 07:53 [4, 3, 1, 8, 9] 
// 2023-05-19 07:53 [3, 1, 4, 8, 9] 
// 2023-05-19 07:53 [1, 3, 4, 8, 9] 
// 2023-05-19 07:53 [1, 3, 4, 8, 9]

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.text.SimpleDateFormat;
// import java.util.Arrays;
// import java.util.Date;

// public class DZ2 {
//     private static File log; 
//     private static FileWriter fileWriter;
//     public static void main(String[] args) {
//         try {
//             log = new File("log.txt");
//             log.createNewFile();
//             fileWriter = new FileWriter(log);    
//             int[] mas = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
//             boolean sorted = false;
//             int temp;
//             while(!sorted) {
//                 sorted = true;
//                 for (int i = 0; i < mas.length - 1; i++) {
//                     if (mas[i] > mas[i+1]) {
//                         temp = mas[i];
//                         mas[i] = mas[i+1];
//                         mas[i+1] = temp;
//                         sorted = false;
//                     }
//                 }
//                 try {
//                     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//                     String timestamp = dateFormat.format(new Date());
//                     fileWriter.write(timestamp + " " + Arrays.toString(mas) + "\n");
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }  
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 fileWriter.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
