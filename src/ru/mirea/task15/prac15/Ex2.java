package ru.mirea.task15.prac15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 extends JFrame {
    String[] items = {
            "Австралия",
            "Китай",
            "Россия",
            "Англия"
    };
    String[] itemsDescription = {
            "Австралия –государство в Южном полушарии, занимающее одноимённый материк, остров Тасмания и несколько других островов Индийского и Тихого океанов; является шестым государством по площади в мире.",
            "Китай – государство в Восточной Азии. Занимает третье место в мире по территории (9 598 962 км2), уступая России и Канаде, а по численности населения — 1 415 515 674 жителей[14] — второе, уступая Индии..",
            "Россия — государство в Восточной Европе и Северной Азии. Россия — крупнейшее государство в мире.",
            "Англия -  страна, являющаяся крупнейшей административно-политической частью Соединённого Королевства Великобритании и Северной Ирландии."
    };
    JButton button = new JButton("Показать информацию о стране"); // кнопка
    JComboBox Country = new JComboBox(items);

    public Ex2() {
        super("Страны");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(450, 150);
        add(Country);
        add(button);
        setVisible(true);
        //jComboBox1.getSelectedItem()
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String item = (String)Country.getSelectedItem();
                switch (item) {
                    case "Австралия":
                        JOptionPane.showMessageDialog(null, itemsDescription[0], "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Китай":
                        JOptionPane.showMessageDialog(null, itemsDescription[1], "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Россия":
                        JOptionPane.showMessageDialog(null, itemsDescription[2], "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Англия":
                        JOptionPane.showMessageDialog(null, itemsDescription[3], "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
        });
    }
    public static void main(String[] args) {
        new Ex2();
    }
}