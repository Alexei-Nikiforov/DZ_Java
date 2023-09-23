// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (Set).
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
// Например:
// 	“Введите цифру, соответствующую необходимому критерию:
// 	1 - ОЗУ
// 	2 - Объем ЖД
// 	3 - Операционная система
// 	4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DZ6 {
    public static void main(String[] args) {

        Notebook notebook_1 = new Notebook(Brand.LENOVO, Color.Black, 32000);
        Notebook notebook_2 = new Notebook(Brand.LENOVO, Color.White, 45000);
        Notebook notebook_3 = new Notebook(Brand.ASUS, Color.Gray,73000);
        Notebook notebook_4 = new Notebook(Brand.ASUS, Color.Black, 37000);
        Notebook notebook_5 = new Notebook(Brand.APPLE, Color.White, 91000);
        Notebook notebook_6 = new Notebook(Brand.APPLE, Color.Gray,82000);
        Notebook notebook_7 = notebook_1;

        Set<Notebook> notebookSet = new HashSet<>();

        notebookSet.add(notebook_1);
        notebookSet.add(notebook_2);
        notebookSet.add(notebook_3);
        notebookSet.add(notebook_4);
        notebookSet.add(notebook_5);
        notebookSet.add(notebook_6);
        notebookSet.add(notebook_7);

        // System.out.println(notebookSet);
        
        ArrayList<Notebook> arrLenovo = new ArrayList<Notebook>();
        for (Notebook notebook : notebookSet) {
            if(notebook.getBrand() == Brand.LENOVO){
                arrLenovo.add(notebook);
            }
        }

        ArrayList<Notebook> arrAsus = new ArrayList<Notebook>();
        for (Notebook notebook : notebookSet) {
            if(notebook.getBrand() == Brand.ASUS){
                arrAsus.add(notebook);
            }
        }

        ArrayList<Notebook> arrApple = new ArrayList<Notebook>();
        for (Notebook notebook : notebookSet) {
            if(notebook.getBrand() == Brand.APPLE){
                arrApple.add(notebook);
            }
        }

        ArrayList<Notebook> arrBlack = new ArrayList<Notebook>();
        for (Notebook notebook : notebookSet) {
            if(notebook.getColor() == Color.Black){
                arrBlack.add(notebook);
            }
        }

        ArrayList<Notebook> arrWhite = new ArrayList<Notebook>();
        for (Notebook notebook : notebookSet) {
            if(notebook.getColor() == Color.White){
                arrWhite.add(notebook);
            }
        }

        ArrayList<Notebook> arrGray = new ArrayList<Notebook>();
        for (Notebook notebook : notebookSet) {
            if(notebook.getColor() == Color.Gray){
                arrGray.add(notebook);
            }
        }

        Map<String, ArrayList<Notebook>> mapNotebokChoise = new HashMap<>();

        mapNotebokChoise.put("LENOVO", arrLenovo);
        mapNotebokChoise.put("ASUS", arrAsus);
        mapNotebokChoise.put("APPLE", arrApple);
        mapNotebokChoise.put("Black", arrBlack);
        mapNotebokChoise.put("White", arrWhite);
        mapNotebokChoise.put("Gray", arrGray);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите критерий для фильтрации: 1 - по бренду, 2 - по цвету, 3 - по цене");
        int choice;

        while (true) {
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите цифру для выбора бренда ноутбука: 1 - LENOVO, 2 - ASUS, 3 - APPLE");
                    int brand = scanner.nextInt();
                    if(brand == 1) System.out.println(mapNotebokChoise.get("LENOVO"));
                    else if (brand == 2) System.out.println(mapNotebokChoise.get("ASUS"));
                    else if (brand == 3) System.out.println(mapNotebokChoise.get("APPLE"));
                    break;
                case 2:
                    System.out.println("Введите цифру для выбора цвета ноутбука: 1 - Black, 2 - White, 3 - Gray");
                    int color = scanner.nextInt();
                    if(color == 1) System.out.println(mapNotebokChoise.get("Black"));
                    else if (color == 2) System.out.println(mapNotebokChoise.get("White"));
                    else if (color == 3) System.out.println(mapNotebokChoise.get("Gray"));
                    break;
                case 3:
                    System.out.println("Введите значение до какой цены нужны ноутбуки:");
                    int price = scanner.nextInt();
                    ArrayList<Notebook> arrPrice = new ArrayList<Notebook>();
                    for (Notebook notebook : notebookSet) {
                        if(notebook.getPrice() < price){
                            arrPrice.add(notebook);
                       }
                    }
                    System.out.println(arrPrice);
                    break;
                default:
                    System.out.println("Что то пошло не так");
            }
            System.exit(choice);
        }
    }
}