import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task03 {
    public static LinkedList<Integer> arr = new LinkedList<>();
    public static void main(String[] args) {
        //LinkedList<Integer> arr = new LinkedList<>();
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) 
        {
            arr.add(random.nextInt(100));
        }
        System.out.println(arr);
        System.out.println(rever(arr));
        System.out.printf("Выберите номер операции\n1-добавить элемент\n2-вывести и удалить первый элемент\n3-вывести первый элемент\nВаш выбор: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //scanner.close();
        switch (number) {
            case 1:
                enqueue(scanner);
                System.out.println(arr);
                break;
            case 2:
                System.out.println(dequeue());
                break;
            case 3:
                System.out.println(first());
                break;

        }
        scanner.close();
    }

    private static Integer first() {
        return arr.peekFirst();
    }

    private static Integer dequeue() {
        return arr.pollFirst();
    }

    public static void enqueue(Scanner scanner) {
        //Scanner iscanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a = scanner.nextInt();
        arr.addLast(a);
        //iscanner.close();
        
    }

    public static LinkedList<Integer> rever (LinkedList<Integer> arr){
        LinkedList<Integer> list = new LinkedList<>();
        for(Integer o : arr){
            list.addFirst(o);
        }
        return list;
    }
}
