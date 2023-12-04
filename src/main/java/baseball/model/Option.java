package baseball.model;

import baseball.Validator.InputValidator;

public class Option {
    private boolean option;

    private Option (String userInput) {
        InputValidator.checkUserOption(userInput);

        if (userInput.equals("1")) { this.option = true; }
        if (userInput.equals("2")) { this.option = false; }

    }

    public static Option createOptionFrom(String userInput) {
        return new Option(userInput);
    }

    public Boolean getOption() { return option; }

}
