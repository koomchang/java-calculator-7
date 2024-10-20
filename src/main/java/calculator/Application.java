package calculator;

import calculator.calculator.StringAdditionCalculator;
import calculator.controller.CalculatorController;
import calculator.validator.InputValidator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        final CalculatorController calculatorController = new CalculatorController(
                new OutputView(),
                new InputView(
                        new InputValidator()
                ),
                new StringAdditionCalculator()
        );

        calculatorController.run();
    }
}
