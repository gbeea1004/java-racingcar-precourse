package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.common.Number;

import static racingcar.common.Number.MAX_RANDOM_NO;
import static racingcar.common.Number.MIN_RANDOM_NO;

public class Car {

    private static final int MOVEABLE_NO = 4;
    private final Name name;
    private final Distance distance;

    public Car(String name) {
        this.name = new Name(name);
        distance = new Distance(Number.ZERO);
    }

    public void play() {
        if (canMove()) {
            distance.increase();
        }
    }

    public String getName() {
        return name.getName();
    }

    public int getDistance() {
        return distance.getDistance();
    }

    private boolean canMove() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NO, MAX_RANDOM_NO) >= MOVEABLE_NO;
    }
}
