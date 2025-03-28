
package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Calculator extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
         
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        Scene scene = new Scene(root, 600, 450);
        scene.getStylesheets().add(getClass().getResource("CalculatorStyle.css").toExternalForm());
        
        primaryStage.setTitle("CalculatorByNaol");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
