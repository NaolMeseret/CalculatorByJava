package calculator;

public class Modal {

    public float calculate(long number1, long number2, String operator) {

        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case " *":
                return number1 * number2;
            case "/":
                if (number2 != 0) {
                    return (float) number1 / number2;

                } else {
                    System.out.println("Error: Devision by Zero!");
                    return 0;
                }

            default:
                System.out.println("Invalid Operator");
                return 0;
        }

    }

}
