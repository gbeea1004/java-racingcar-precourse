package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.PlayCount;
import racingcar.view.InputView;

public class RacingCarController {

    public void run() {
        Cars cars = InputView.inputRacingCarNames();
        PlayCount playCount = InputView.inputPlayCount();
    }
}
