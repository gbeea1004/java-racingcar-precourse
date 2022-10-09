package racingcar.domain;

import racingcar.common.Number;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(String[] carNames) {
        createCars(carNames);
    }

    private void createCars(String[] carNames) {
        cars = new ArrayList<>();

        for (String name : carNames) {
            cars.add(new Car(name));
        }
    }

    public void race() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getWinners() {
        return getJointWinner(getWinner());
    }

    private Car getWinner() {
        Car winner = cars.get(Number.ZERO);

        for (int index = 1; index < cars.size(); index++) {
            winner = getWinner(winner, cars.get(index));
        }

        return winner;
    }

    private Car getWinner(Car winner, Car target) {
        if (target.isMoveMoreThen(winner)) {
            winner = target;
        }

        return winner;
    }

    private List<Car> getJointWinner(Car winner) {
        List<Car> winners = new ArrayList<>();

        for (int index = 0; index < cars.size(); index++) {
            addJointWinner(winner, cars.get(index), winners);
        }

        return winners;
    }

    private void addJointWinner(Car winner, Car target, List<Car> winners) {
        if (winner.isSameDistance(target)) {
            winners.add(target);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
