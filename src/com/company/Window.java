package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{

    private Player player1;
    private Player player2;

    private JButton button;

    Window(){
        this.setSize(800,530);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        player1 = new Player(1);
        player2 = new Player(2);

        this.add(player1);
        this.add(player2);

        Button button = new Button(300,400,200,40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player1.getStatusOfHide() == StatusOfHide.UNHIDDEN){
                    player1.setStatusOfHide(StatusOfHide.HIDDEN);
                    player1.hidePlayer();
                }else if(player1.getStatusOfHide() == StatusOfHide.HIDDEN){
                    player1.setStatusOfHide(StatusOfHide.UNHIDDEN);
                    player1.unhidePlayer();
                }
            }
        });
        this.add(button);

        //включение видимости фрейма Window
        this.setVisible(true);
    }
}
