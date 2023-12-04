package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static baseball.constants.Constants.NUM_LENGTH;

public class ComputerNumbers {

    private final List<Integer> computerNumbers;

    private ComputerNumbers (int length) {
        this.computerNumbers = setComputerNumbers(length);
    }

    public static ComputerNumbers createComputerNumbersFrom() {
        return new ComputerNumbers(NUM_LENGTH);
    }

    private List<Integer> setComputerNumbers(int length) {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < length) {
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if (!computer.contains(randomNumber)) {computer.add(randomNumber); }
        }
        return computer;
    }

    public List<Integer> getComputerNumbers() {
        return Collections.unmodifiableList(computerNumbers);
    }
}
