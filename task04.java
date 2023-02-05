import java.util.LinkedList;
import java.util.Scanner;

public class task04 {
    public static LinkedList<Integer> result = new LinkedList<>();
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Выберите действие / , * , : , +: ");
        String c = iScanner.nextLine();
        System.out.printf("Введите число 1: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число 2: ");
        int b = iScanner.nextInt();
        
        result.addLast(action(a, b, c));


        while(true){
            System.out.printf("Выберите действие / , * , : , + или напишите 'Отмена': ");
            c = iScanner.next();
            if (c == "Выход"){
                break;
            }
            if (c != "Отмена"){
                System.out.printf("Введите число 1: " + result.peekLast() + "\n");
                a = result.peekLast();
                System.out.printf("Введите число 2: ");
                b = iScanner.nextInt();
                result.addLast(action(a, b, c));
                System.out.println(result.peekLast());
            }
            delete();
        }
        iScanner.close();
    }

    private static Integer action(int a, int b, String c) {
        switch (c) {
            case "/":
                return a / b;
                
            case "*":
                return a * b;
                
            case "-":
                return a - b;
                
            case "+":
                return a + b;
                
            case "Отмена":
                delete();
            default:
                break;
        }
        return null;
    }

    private static void delete() {
        result.pollLast();
    }
}
