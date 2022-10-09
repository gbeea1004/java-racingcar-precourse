package racingcar.view;

import racingcar.common.Separator;
import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

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

    public static void printWinner(List<Car> winners) {
        List<String> winnerNames = new ArrayList<>();
        for (Car winner : winners) {
            winnerNames.add(winner.getName());
        }

        System.out.println("최종 우승자 : " + String.join(Separator.COMMA, winnerNames));
    }
}
