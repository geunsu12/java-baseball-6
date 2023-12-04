package baseball.Validator;

import baseball.constants.Constants;
import java.util.List;

public class InputValidator {
    public static void checkUserInputNumber(String userInput,int start, int end) throws IllegalArgumentException {
        if (!userInput.matches(String.format("^[%d-%d]*$", start, end))) {
            throw new IllegalArgumentException(String.format("%d-%d까지의 숫자만 입력해주세요.", start, end));
        }
    }

    public static void checkUserInputLength(String userInput, int length) throws IllegalArgumentException {
        if (userInput.length() != length) {
            throw new IllegalArgumentException(String.format("%d자리 숫자로 입력해주세요.",length));
        }
    }

    public static void checkUserOption(String userInput) throws IllegalArgumentException {
        if (!userInput.equals("1") && !userInput.equals("2")) {
            throw new IllegalArgumentException("1 또는 2 입력해주세요.");
        }
    }
    public static void checkOverlapNumber(List<Integer> userInput) throws IllegalArgumentException {

        if (userInput.stream().distinct().count() != Constants.NUM_LENGTH) {
            throw new IllegalArgumentException("중복되지 않은 값을 입력해주세요.");
        }
    }
}
