package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.PlayCount;
import racingcar.domain.Winner;
import racingcar.service.RacingCarService;
import racingcar.service.RepeatService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

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

        Winner winner = new Winner(cars);
        OutputView.printWinner(winner.getNames());
    }
}
