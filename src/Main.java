
import java.security.Key;
import java.util.*;

public class Main {

    public static void main(String[] args) {
/**
 * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */

        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";

        String[] words = text.split(" ");
        Map<Integer, List<String>> stats = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            ArrayList<String> list = new ArrayList<>();
            for (String s : words) {
                if (words[i].length() == s.length()) {
                    list.add(s);
                }
            }
            stats.put(words[i].length(), list);
        }

        for (List<String> s : stats.values()) {
            System.out.println(s);
        }
    }
}