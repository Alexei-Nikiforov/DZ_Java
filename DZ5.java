// Реализуйте структуру телефонной книги с помощью Map, учитывая, что 1 человек может иметь несколько телефонов 
// и у человека уникальное имя. Поработать с методами Map.
// Отсортировать Map в обратном порядке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class DZ5 {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<String>> phonebook = new LinkedHashMap<>();
        addEntryToPhonebook(phonebook, "Иванов", "01");
        addEntryToPhonebook(phonebook, "Петров", "02");
        addEntryToPhonebook(phonebook, "Васечкин", "03");
        addEntryToPhonebook(phonebook, "Иванов", "04");
        addEntryToPhonebook(phonebook, "Петров", "05");
        addEntryToPhonebook(phonebook, "Сидоров", "06");
        addEntryToPhonebook(phonebook, "Иванова", "07");

        // System.out.println(phonebook);
        printPhonebookInReverseOrder(phonebook);
    }

    static void addEntryToPhonebook (LinkedHashMap<String, ArrayList<String>> ph, String key, String value) {
        if(ph.containsKey(key)) {
            ph.get(key).add(value);
        } else {
            ArrayList<String> tel = new ArrayList<String>();
            tel.add(value);
            ph.put(key, tel);
        }
    }

    static void printPhonebookInReverseOrder (LinkedHashMap<String, ArrayList<String>> ph) {
        // System.out.println(new TreeMap<>(ph).descendingMap()); // в обратном алфавитном порядке ключей

        List<String> listKeys = new ArrayList<String>(ph.keySet());
        Collections.reverse(listKeys);

        LinkedHashMap<String, ArrayList<String>> phNew = new LinkedHashMap<>();

        for (String stringKey : listKeys) {
            phNew.put(stringKey, ph.get(stringKey));
        }
        System.out.println(phNew);
    }
}  
