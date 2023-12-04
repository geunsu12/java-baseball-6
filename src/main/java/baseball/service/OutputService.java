package baseball.service;

import baseball.model.Result;

public class OutputService {

    private OutputService() {}

    public static String generateResultMessage(Result result) {
        StringBuilder sb = new StringBuilder();
        if (result.getBall() > 0) { sb.append(String.format("%d볼 ",result.getBall())); }
        if (result.getStrike() > 0) { sb.append(String.format("%d스트라이크",result.getStrike())); }
        if (result.getBall() == 0 && result.getStrike() == 0) { sb.append("낫싱"); }
        return sb.toString();
    }

}
