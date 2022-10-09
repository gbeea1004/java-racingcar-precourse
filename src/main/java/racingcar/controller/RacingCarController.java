package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.view.InputView;

public class RacingCarController {

    public void run() {
        Cars cars = InputView.inputRacingCarNames();
    }
}
