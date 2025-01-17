package ru.mirea.task16.prac16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;

public class Game extends JFrame {
    int number = (int)(Math.random()*21);
    int attempt = 0;
    JTextField jta = new JTextField(10); // текстовое поле
    JButton button = new JButton("Проверить"); // кнопка
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    Game() {
        super("Calculator");
        System.out.println(number);
        setLayout(new FlowLayout());
        setSize(450, 150);
        add(new JLabel("Угадайте число от 0 до 20"));
        add(jta);
        add(button);
        String message;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int x = Integer.valueOf(jta.getText().trim());
                    if (x == number) {
                        JOptionPane.showMessageDialog(null, "Угадали!", "Предупреждение", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        System.exit(0);
                    }
                    else {
                        attempt++;
                        if (attempt >= 3) {
                            JOptionPane.showMessageDialog(null, "Вы проиграли...", "Предупреждение", JOptionPane.INFORMATION_MESSAGE);
                            setVisible(false);
                            System.exit(0);
                        }
                        else {
                            if (x > number) JOptionPane.showMessageDialog(null, "Ваше число больше загаданного", "Предупреждение", JOptionPane.INFORMATION_MESSAGE);
                            else JOptionPane.showMessageDialog(null, "Ваше число меньше загаданного", "Предупреждение", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка", "Предупреждение", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        setVisible(true);
    }


    public static void main(String[] args) {
        new Game();
    }
}