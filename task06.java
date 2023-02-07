import java.util.HashMap;
import java.util.Map;

public class task06 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петрова", "Светлана");
        map.put("Белова", "Кристина");
        map.put("Мусина", "Анна");
        map.put("Крутова", "Анна");
        map.put("Юрин", "Иван");
        map.put("Лыков", "Петр");
        map.put("Чернов", "Павел");
        map.put("Чернышов", "Петр");
        map.put("Федорова", "Мария");
        map.put("Светлова", "Марина");
        map.put("Савина", "Мария");
        map.put("Рыкова", "Мария");
        map.put("Лугова", "Марина");
        map.put("Владимирова", "Анна");
        map.put("Мечников", "Иван");
        map.put("Петин", "Петр");
        map.put("Ежов", "Иван");
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        for (String c : map.values()) {
            int value = counts.get(c) == null ? 0 : counts.get(c);
            counts.put(c, value + 1);
        }
        
        counts.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);   
    }
}
