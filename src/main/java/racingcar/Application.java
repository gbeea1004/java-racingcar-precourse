package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.service.RacingCarService;
import racingcar.service.RepeatService;

public class Application {
    public static void main(String[] args) {
        RacingCarController racingCarController = new RacingCarController(new RepeatService(), new RacingCarService());
        racingCarController.run();
    }
}
