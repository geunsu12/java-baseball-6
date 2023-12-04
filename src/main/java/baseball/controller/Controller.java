package baseball.controller;

import baseball.model.ComputerNumbers;
import baseball.model.Option;
import baseball.model.Result;
import baseball.model.UserInputNumbers;
import baseball.view.InputView;
import baseball.view.OutputView;

import static baseball.model.ComputerNumbers.createComputerNumbersFrom;
import static baseball.model.UserInputNumbers.createInputNumberFrom;

public class Controller {
    ComputerNumbers computerNumbers;
    UserInputNumbers userInputNumber;
    Result result;
    Option option;

    private Controller () {}

    public static Controller createControllerFrom() {
        return new Controller();
    }

    public void gameEngine() {
        do  {
            computerNumbers = createComputerNumbersFrom();
            OutputView.printUserInputMessage();

            String userInput = InputView.readLine();
            userInputNumber = createInputNumberFrom(userInput);
            result = Result.createResultFrom(userInputNumber,computerNumbers);

            OutputView.printResultMessage(result);
        }   while (result.getStrike() != 3);
    }

    public void runGameEngine() {
        OutputView.printStartMessage();
        do {
            gameEngine();

            OutputView.printRegameMessage();
            String userInput = InputView.readLine();
            option = Option.createOptionFrom(userInput);
        } while (option.getOption());
    }
}
