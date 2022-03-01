package com.company;

import javax.swing.*;
import java.awt.*;

public class Player extends JPanel {

    private int numOfPlayer;//номер игрока
    private int xPosition;//позиция на X на Window

    private Block[][] blocks;//массив из 100 блоков

    private StatusOfHide statusOfHide = StatusOfHide.UNHIDDEN;//начальный статус скрывания блоков

    //конструктор класса player
    Player(int numOfPlayer){
        this.numOfPlayer = numOfPlayer;
        this.xPosition = ((numOfPlayer == 1)?0:391);//если игрок первый X=0, если второй X=391
        setBackground((numOfPlayer == 1)?Color.green:Color.red);//если игрок 1 фон зеленый, если 2 то красный
        setBounds(this.xPosition,0,390,390);//инициализация позиций
        setLayout(null);

        //инициализация массива блоков
        this.blocks = new Block[10][10];
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j] = new Block(i*39, j*39);
                this.add(blocks[i][j]);
            }
        }

    }



    //метод скрытия блоков
    public void hidePlayer(){
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j].hideBlock();
            }
        }
    }

    //метод отмены скрытия блоков
    public void unhidePlayer(){
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j].unhideBlock();
            }
        }
    }

    //геттер статуса скрытности
    public StatusOfHide getStatusOfHide(){
        return this.statusOfHide;
    }

    public void setStatusOfHide(StatusOfHide statusOfHide){
        this.statusOfHide = statusOfHide;
    }
}
