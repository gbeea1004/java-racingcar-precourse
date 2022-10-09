package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.PlayCount;
import racingcar.service.RepeatService;
import racingcar.view.InputView;

public class RacingCarController {

    private final RepeatService repeatService;

    public RacingCarController(RepeatService repeatService) {
        this.repeatService = repeatService;
    }

    public void run() {
        Cars cars = repeatService.initTarget(InputView::inputRacingCarNames);
        PlayCount playCount = repeatService.initTarget(InputView::inputPlayCount);
    }
}
