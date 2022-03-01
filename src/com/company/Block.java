package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Block extends JPanel implements MouseListener {

    private StatusBlock statusBlock = StatusBlock.WATER;

    Block(){
        setBackground(statusBlock.getColor());
        setBounds(0,0,38,38);
        this.addMouseListener(this);
    }

    Block(int x, int y){
        setBackground(statusBlock.getColor());
        setBounds(x, y,38,38);
        setLayout(null);
        this.addMouseListener(this);
    }

    public void setColor(Color color){
        this.setBackground(color);
    }

    public Color getColor(){
        return this.statusBlock.getColor();
    }

    public void hideBlock(){
        if(this.statusBlock == StatusBlock.WATER){
            this.statusBlock.setHideStatus(StatusBlock.HideStatus.HIDDEN);
        }

        this.setColor(this.statusBlock.getColor());
    }

    public void unhideBlock(){
        if(this.statusBlock.getHideStatus() == StatusBlock.HideStatus.HIDDEN){
            this.statusBlock.setHideStatus(StatusBlock.HideStatus.UNHIDDEN);
        }
        this.setColor(this.statusBlock.getColor());
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if(this.statusBlock == StatusBlock.WATER){
            statusBlock = StatusBlock.SELECTED_WATER;
        }

        this.setColor(statusBlock.getColor());
    }

    @Override
    public void mouseExited(MouseEvent e) {

        if(this.statusBlock == StatusBlock.SELECTED_WATER){
            statusBlock = StatusBlock.WATER;
        }

        this.setColor(statusBlock.getColor());
    }
}
