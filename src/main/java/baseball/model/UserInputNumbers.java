package baseball.model;

import baseball.Validator.InputValidator;
import baseball.constants.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserInputNumbers {
    private final int INPUT_START = 1;
    private final int INPUT_END = 9;

    private List<Integer> userInputNumbers;

    private UserInputNumbers(String userInput) {
        InputValidator.checkUserInputLength(userInput, Constants.NUM_LENGTH);
        InputValidator.checkUserInputNumber(userInput,INPUT_START, INPUT_END);

        this.userInputNumbers = new ArrayList<>();
        for (int i=0;i<userInput.length();i++) {
            this.userInputNumbers.add(Integer.parseInt(userInput.substring(i,i+1)));
        }

        InputValidator.checkOverlapNumber(this.userInputNumbers);
    }

    public static UserInputNumbers createInputNumberFrom(String userInput) {
        return new UserInputNumbers(userInput);
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(userInputNumbers);
    }
}
