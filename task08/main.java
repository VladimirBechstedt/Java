package task08;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        notbook nb0 = new notbook();
        nb0.maker = "Lenovo";
        nb0.ram = 2;
        nb0.memory = 256;
        nb0.os = "Windows";
        nb0.color = "черный";

        notbook nb1 = new notbook();
        nb1.maker = "ASUS";
        nb1.ram = 4;
        nb1.memory = 512;
        nb1.os = "Windows";
        nb1.color = "черный";

        notbook nb2 = new notbook();
        nb2.maker = "Lenovo";
        nb2.ram = 4;
        nb2.memory = 256;
        nb2.os = "Linux";
        nb2.color = "синий";

        notbook nb3 = new notbook();
        nb3.maker = "Acer";
        nb3.ram = 2;
        nb3.memory = 256;
        nb3.os = "Linux";
        nb3.color = "серый";

        notbook nb4 = new notbook();
        nb4.maker = "Lenovo";
        nb4.ram = 6;
        nb4.memory = 256;
        nb4.os = "Windows";
        nb4.color = "черный";

        notbook nb5 = new notbook();
        nb5.maker = "Acer";
        nb5.ram = 2;
        nb5.memory = 128;
        nb5.os = "Linux";
        nb5.color = "белый";

        notbook nb6 = new notbook();
        nb6.maker = "Lenovo";
        nb6.ram = 4;
        nb6.memory = 256;
        nb6.os = "Windows";
        nb6.color = "белый";

        notbook nb7 = new notbook();
        nb7.maker = "DELL";
        nb7.ram = 4;
        nb7.memory = 512;
        nb7.os = "Windows";
        nb7.color = "серый";

        notbook nb8 = new notbook();
        nb8.maker = "Lenovo";
        nb8.ram = 2;
        nb8.memory = 256;
        nb8.os = "Windows";
        nb8.color = "белый";

        notbook nb9 = new notbook();
        nb9.maker = "DELL";
        nb9.ram = 6;
        nb9.memory = 512;
        nb9.os = "Linux";
        nb9.color = "синий";

        Set<notbook> laptop = new HashSet<>();
        laptop.add(nb0); laptop.add(nb1); laptop.add(nb2);
        laptop.add(nb3); laptop.add(nb4); laptop.add(nb5);
        laptop.add(nb6); laptop.add(nb7);
        laptop.add(nb8); laptop.add(nb9);

        System.out.printf("Фильтр\n");
        System.out.printf("1 - ОЗУ\n");
        System.out.printf("2 - Объем ЖД\n");
        System.out.printf("3 - Операционная система\n");
        System.out.printf("4 - Цвет\n");
        System.out.println("Ввод: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int choce;
        switch (num) {
            case 1:
                System.out.printf("Фильтр\n");
                System.out.printf("1 - 2Гб\n");
                System.out.printf("2 - 4Гб\n");
                System.out.printf("3 - 6Гб\n");
                System.out.println("Введите числом количество Гб: ");
                choce = scanner.nextInt();
                for(notbook i : laptop){
                    if (i.filterRam(choce) != null){
                        System.out.print(i + "\n");
                    }
                }
                break;
            case 2:
                System.out.printf("Фильтр\n");
                System.out.printf("1 - 128Гб\n");
                System.out.printf("2 - 256Гб\n");
                System.out.printf("3 - 512Гб\n");
                System.out.println("Введите числом количество Гб: ");
                choce = scanner.nextInt();
                for(notbook i : laptop){
                    if (i.filterMemory(choce) != null){
                        System.out.print(i + "\n");
                    }
                }
                break;
            case 3:
                System.out.printf("Фильтр\n");
                System.out.printf("1 - Windows\n");
                System.out.printf("2 - Linux\n");
                System.out.println("Ввод: ");
                choce = scanner.nextInt();
                switch (choce) {
                    case 1:
                        for(notbook i : laptop){
                            if (i.filterOs("Windows") != null){
                                System.out.print(i + "\n");
                            }
                        }
                        break;
                    case 2:
                        for(notbook i : laptop){
                            if (i.filterOs("Linux") != null){
                                System.out.print(i + "\n");
                            }
                        }
                        break;
                
                    default:
                        break;
                }
                break;
            case 4:
                System.out.printf("Фильтр\n");
                System.out.printf("1 - черный\n");
                System.out.printf("2 - белый\n");
                System.out.printf("3 - серый\n");
                System.out.printf("4 - синий\n");
                System.out.println("Ввод: ");
                choce = scanner.nextInt();
                switch (choce) {
                    case 1:
                        for(notbook i : laptop){
                            if (i.filterColor("черный") != null){
                                System.out.print(i + "\n");
                            }
                        }
                        break;
                    case 2:
                        for(notbook i : laptop){
                            if (i.filterColor("белый") != null){
                                System.out.print(i + "\n");
                            }
                        }
                        break;
                    case 3:
                        for(notbook i : laptop){
                            if (i.filterColor("серый") != null){
                                System.out.print(i + "\n");
                            }
                        }
                        break;
                    case 4:
                        for(notbook i : laptop){
                            if (i.filterColor("синий") != null){
                                System.out.print(i + "\n");
                            }
                        }
                        break;
                
                    default:
                        break;
                }
                break;
        
            default:
                break;
        }
        scanner.close();
    }
}
