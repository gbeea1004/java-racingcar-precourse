package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.common.Separator;
import racingcar.domain.Cars;

public class InputView {

    /**
     * 자동차 이름 리스트 입력
     *
     * @return 자동차 리스트
     */
    public static Cars inputRacingCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        return new Cars(Console.readLine().split(Separator.COMMA));
    }
}
