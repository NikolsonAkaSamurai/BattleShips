package com.company;

import java.awt.*;

public enum StatusBlock {

    WATER(Color.decode("#0000CD")), SHIP(Color.decode("#808080")), WATER_SHOT(Color.decode("#000080")),
    DESTROYED_SHIP(Color.decode("#696969")), HIDDEN_BLOCK(Color.decode("#556B2F")),
    SELECTED_WATER(Color.decode("#0000FF"));

    private Color color;
    private HideStatus hideStatus;
    private SelectStatus selectStatus;

    StatusBlock(Color color){
        this.color = color;
        this.hideStatus = HideStatus.UNHIDDEN;
        this.selectStatus = SelectStatus.UNSELECTED;
    }

    public Color getColor(){
        Color temp = (this.getHideStatus() == HideStatus.UNHIDDEN)?this.color:StatusBlock.HIDDEN_BLOCK.color;
        return temp;
    }

    public HideStatus getHideStatus(){
        return this.hideStatus;
    }

    public void setHideStatus(HideStatus hideStatus){
        this.hideStatus = hideStatus;
    }

    public SelectStatus getSelectStatus(){
        return this.selectStatus;
    }

    public enum HideStatus{
        HIDDEN, UNHIDDEN;

        HideStatus(){
        }
    }

    public enum SelectStatus{
        SELECTED, UNSELECTED;

        SelectStatus(){}
    }
}
