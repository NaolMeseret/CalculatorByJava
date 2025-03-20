package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

    @FXML
    private Label result;
    private long number1;
    private String operator = "";
    private boolean start = true;

    @FXML
    public void processNumbers(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();

    }

    @FXML
    public void processOperators(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if (!Boolean.valueOf(equals("="))) {
            if (!operator.isEmpty()) {
                return;
            }
            operator = value;
            number1 = Long.parseLong(result.getText());
            result.setText("");
        }
        else{
            if(operator.isEmpty()){
                return;
            }
                long number2 = Long.parseLong(result.getText());
                float output = model.calculate(number1, number2, operator);
                result.setText(String.valueOf(output));
                operator = "";
                start= true;
            
        }
    }

}
