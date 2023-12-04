package baseball.view;

import baseball.constants.Constants;
import baseball.model.Result;
import baseball.service.OutputService;

public class OutputView {
    private OutputView() {}

    public static void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printUserInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printResultMessage(Result result) {
        System.out.println(OutputService.generateResultMessage(result));;
    }

    public static void printRegameMessage() {
        System.out.println(String.format("%d개의 숫자를 모두 맞히셨습니다! 게임 종료", Constants.NUM_LENGTH));
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
