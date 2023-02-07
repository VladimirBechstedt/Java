import java.util.HashMap;
import java.util.Scanner;

public class task05 {
    public static HashMap<String, String> jornal = new HashMap<>();
    public static void main(String[] args) {
        jornal.put("+79514958785", "Иванов Иван");
        jornal.put("+79511115498", "Иванов Иван");
        jornal.put("+79505558899", "Петров Петр");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("Добывить контакт - 1\nВывести на экран - 2\nВыход - 0\nВвдите число: ");
            int a = scanner.nextInt();
            if(a == 0) break;
            switch (a) {
                case 1:
                    get(scanner);
                case 2:
                    print();
            
                default:
                    break;
            }
        }

    }
    private static void print() {
        for (var item : jornal.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        
    }
    private static void get(Scanner scanner) {
        System.out.println("Номер: ");
        String number = scanner.nextLine();
        System.out.println("Фамилия и Имя: ");
        String name = scanner.nextLine();
        jornal.put(number, name);
    }
}
