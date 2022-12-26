/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

  public static void main(String[] args) {
        Map<String, String> bookPhone = new HashMap<>();
        bookPhone.put("Маша", "89123456789");
        bookPhone.put("Саша", "89123456799");
        bookPhone.put("Петя", "89123456790");
        bookPhone.put("Даша", "89123456791");

        System.out.println("Справочник: \n" + bookPhone);

        add(bookPhone, "Вася", "89123456792");
        System.out.println("После добавления: \n" + bookPhone);

        remove(bookPhone, "Маша");
        System.out.println("После удаления: \n" + bookPhone);
    }

    public static void add(Map<String, String> note, String name, String num){
        note.put(name, num);
    }

    public static void remove(Map<String, String> note, String name){
        note.remove(name);
    }
}