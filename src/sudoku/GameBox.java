/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javafx.scene.control.TextField;

/**
 *
 * @author greg.swank
 */
public class GameBox {
    int Col;
    int Row;
    char Grid;
    boolean isSet;
    boolean isVisable;
    int RealValue;
    int SuggestedValue;
    TextField display;
    
    public GameBox(){
        this.isSet = false;
        this.isVisable = false;
        this.display = new TextField();
    }
    
    public GameBox(int Col, int Row, char Grid, String Name){
        this.display = new TextField();
        this.Col = Col;
        this.Row = Row;
        this.Grid = Grid;
        this.isSet = false;
        this.isVisable = false;
        this.display = new TextField(Name);
    }
    
    public void setCol(int Col){
        this.Col = Col;
    }
    
    public int getCol(){
        return this.Col;
    }
    
    public void setRow(int Row){
        this.Row = Row;
    }
    
    public int getRow(){
        return this.Row;
    }
    
    public TextField getTextField(){
        return this.display;
    }
    
    public void setTextField(TextField display){
        this.display = display;
    }
    
    
}
