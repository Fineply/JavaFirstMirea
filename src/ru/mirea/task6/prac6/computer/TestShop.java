package ru.mirea.task6.prac6.computer;

import java.util.Scanner;

public class TestShop {
    static public Computer enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите информацию о мониторе - диагональ и частота: ");
        Monitor monitor = new Monitor(sc.nextInt(), sc.nextInt());
        System.out.println("Введите объем памяти: ");
        Memory memory = new Memory(sc.nextInt());
        System.out.println("Введите тактовую частоту процессора: ");
        Processor processor = new Processor(sc.nextInt());
        int num;
        Name name;
        System.out.println("Введите номер компьютера: ");
        num = sc.nextInt();
        System.out.println("Введите марку - Lenovo, Acer, HP, Asus: ");
        String brandName = sc.next();
        switch (brandName) {
            case "Lenovo":
                name = Name.Lenovo;
                break;
            case "HP":
                name = Name.HP;
                break;
            case "Asus":
                name = Name.Asus;
            default:
                name = Name.Acer;
        }
        Computer computer = new Computer(name, num, monitor, memory, processor);
        return computer;
    }

    public static void main(String[] args) {
        String command;
        Shop s = new Shop();
        Computer c;
        Scanner sc = new Scanner(System.in);
        command = sc.next();
        while (true) {
            switch (command) {
                case "добавить":
                    s.addComputer(enter());
                    break;
                case "удалить":
                    System.out.println("Введите номер ");
                    s.deleteComputer(sc.nextInt());
                    break;
                case "найти":
                    System.out.println("Введите номер: ");
                    System.out.println(s.findComputer(sc.nextInt()));
                    break;
                case "показать":
                    System.out.println(s);
                    break;
                case "выйти":
                    return;
                default:
                    System.out.println("неизвестная команда");
            }
            command = sc.next();
        }
    }
}
