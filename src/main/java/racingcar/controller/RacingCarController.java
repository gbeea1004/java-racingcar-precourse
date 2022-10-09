package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.PlayCount;
import racingcar.service.RacingCarService;
import racingcar.service.RepeatService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingCarController {

    private final RepeatService repeatService;
    private final RacingCarService racingCarService;

    public RacingCarController(RepeatService repeatService, RacingCarService racingCarService) {
        this.repeatService = repeatService;
        this.racingCarService = racingCarService;
    }

    public void run() {
        Cars cars = repeatService.initTarget(InputView::inputRacingCarNames);
        PlayCount playCount = repeatService.initTarget(InputView::inputPlayCount);

        playGame(cars, playCount);
    }

    private void playGame(Cars cars, PlayCount playCount) {
        OutputView.printExecutionResultText();

        for (int count = 0; count < playCount.getCount(); count++) {
            racingCarService.raceOneTurn(cars);
            OutputView.printRaceOneTurnResult(cars);
        }

        // TODO: 일급 객체 사용하도록 수정
        List<Car> winners = cars.getWinners();
        OutputView.printWinner(winners);
    }
}
