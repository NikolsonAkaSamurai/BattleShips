package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton  {

    private String text;
    private int x, y, width, height;

    Button(int x, int y, int width, int height){
        this(x,y,width,height, "Button");
    }

    Button(int x, int y, int width, int height, String text){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;

        setBounds(x, y, width, height);
        setText(text);
    }

}
