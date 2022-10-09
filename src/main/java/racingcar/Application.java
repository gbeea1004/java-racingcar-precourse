package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.service.RepeatService;

public class Application {
    public static void main(String[] args) {
        RacingCarController racingCarController = new RacingCarController(new RepeatService());
        racingCarController.run();
    }
}
