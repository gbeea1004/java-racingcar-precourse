package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class OutputView {

    private static final String MOVEMENT = "-";

    public static void printExecutionResultText() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void printRaceOneTurnResult(Cars cars) {
        for (Car car : cars.getCars()) {
            printCarResult(car);
        }
        System.out.println();
    }

    private static void printCarResult(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getDistance(); i++) {
            System.out.print(MOVEMENT);
        }
        System.out.println();
    }
}
