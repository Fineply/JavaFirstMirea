/*
package ru.mirea.task4.Prac4.Phone;

public class Phone {
    int number;
    int model;
    double weight;
    String name = "Dima";
    String message = "Вы ошиблись";

    public Phone(int number, int model, double weight) {    //Конструктор
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone() {    //Конструктор по умолчанию
    }

    public void receiveCall() {     //Метод
        System.out.println("Звонит "+name);
    }
    public void getNumber() {     //Метод
        System.out.println(number);
    }
    public void sendMessage() {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Phone Samsung = new Phone();      //Объект
        Samsung.number = 916234;
        Samsung.model = 1;
        Samsung.weight = 200;

        Phone Nokia = new Phone();         //Объект
        Nokia.number = 985424;
        Nokia.model = 2;
        Nokia.weight = 155;

        Phone Meizu = new Phone();         //Объект
        Meizu.number = 929325;
        Meizu.model = 3;
        Meizu.weight = 300;

        Samsung.receiveCall();
        Nokia.receiveCall();
        Meizu.receiveCall();

        Samsung.getNumber();
        Nokia.getNumber();
        Meizu.getNumber();

        Samsung.sendMessage();
        Nokia.sendMessage();
        Meizu.sendMessage();

        System.out.println("Samsung: number="+ Samsung.number+" model="+Samsung.model+" weight="+Samsung.weight);
        System.out.println("Nokia: number="+ Nokia.number+" model="+Nokia.model+" weight="+Nokia.weight);
        System.out.println("Meizu: number="+ Meizu.number+" model="+Meizu.model+" weight="+Meizu.weight);
    }
}


 */