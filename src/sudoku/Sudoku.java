/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author greg.swank
 */
public class Sudoku extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    primaryStage.setTitle("Sudoku");
    GridPane GameBoard = new GridPane();
    GameBoard.setAlignment(Pos.CENTER);
    GameBoard.setHgap(5);
    GameBoard.setVgap(5);
    GameBoard.setPadding(new Insets(5, 5, 5, 5));
        int Row;
        int Column;
        char Grid;
        ArrayList<GameBox> GameGrid = new ArrayList<>();
        for (int i = 0; i < 81; i++){
            Row = i/9;
            Column = i%9;
            Grid = getGrid(Row, Column);
            String Name = makeName(Column, Row, Grid);
            GameBox ThisBox = new GameBox(Column, Row, Grid, Name);
            GameGrid.add(ThisBox);
            GameBoard.add(ThisBox.getTextField(), Column, Row);
        }
        
        System.out.println("There are " + GameGrid.size() + " squares.");

        Scene Game = new Scene(GameBoard, 600, 600);
        primaryStage.setScene(Game);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    protected char getGrid(int Row, int Column){
        if (Row < 3 && Column < 3){
            return 'a';
        } else if (Row < 3 && Column < 6){
            return 'b';
        } else if (Row < 3 && Column >= 6){
            return 'c';
        } else if (Row < 6 && Column < 3){
            return 'd';
        } else if (Row < 6 && Column < 6){
            return 'e';
        } else if (Row < 6 && Column >=6){
            return 'f';
        } else if (Column < 3){
            return 'g';
        } else if (Column < 6){
            return 'h';
        } else {
            return 'i';
        }
    }
    
    protected String makeName(int Column, int Row, char Grid){
    String Name = ""+ Grid + Row + Column;
    return Name;
}
    
    public void BuildPanel(){
        
    }
    
}
