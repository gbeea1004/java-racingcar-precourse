package racingcar.domain;

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

    public List<Car> getCars() {
        return cars;
    }
}
