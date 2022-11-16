package ru.mirea.task5.Prac5.photo;

import javax.swing.*;
import java.awt.*;

public class Photo extends JFrame {
    private JLabel pictureLabel;
    private Container controls;
    public Photo(String s) {
        super("Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        this.setSize(1000, 620);
        //this.main(this);
        this.startWindow(s);
    }

    private void startWindow(String s) {
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new GridLayout());
        pictureLabel = new JLabel(new ImageIcon("C:\\Users\\1962a\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task5\\Prac5\\photo\\git.jpg","test"));
        controls.add(pictureLabel);
    }

}
