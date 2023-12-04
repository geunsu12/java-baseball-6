package baseball.model;

import java.util.List;
import java.util.stream.Stream;

import static baseball.constants.Constants.NUM_LENGTH;

public class Result {
    private int ball;
    private int strike;

    private Result (UserInputNumbers userInput, ComputerNumbers computerNumbers) {
        this.ball = countBall(userInput, computerNumbers);
        this.strike = countStrike(userInput, computerNumbers);
    }

    public static Result createResultFrom (UserInputNumbers userInput, ComputerNumbers computerNumbers) {
        return new Result(userInput, computerNumbers);
    }

    private int countStrike(UserInputNumbers userInput, ComputerNumbers computerNumbers) {
        return (int) Stream.iterate(0,i->i<NUM_LENGTH,i->i+1)
                .filter(i->userInput.getNumbers().get(i).equals(computerNumbers.getComputerNumbers().get(i)))
                .count();
    }

    private int countBall(UserInputNumbers userInputs, ComputerNumbers computerNumbers) {
        int ball = 0;
        List<Integer> userInput = userInputs.getNumbers();
        List<Integer> computerNumber = computerNumbers.getComputerNumbers();

        return (int) Stream.iterate(0,i->i<NUM_LENGTH,i->i+1)
                .filter(i->!computerNumber.get(i).equals(userInput.get(i)) && computerNumber.contains(userInput.get(i)))
                .count();
    }

    public int getStrike() { return strike; }

    public int getBall() { return ball; }
}
