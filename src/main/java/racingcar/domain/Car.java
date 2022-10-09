package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final int MIN_RANDOM_NO = 0;
    private static final int MAX_RANDOM_NO = 9;
    private static final int MOVEABLE_NO = 4;
    private final String name;
    private int distance;

    public Car(String name) {
        checkNameLength(name);
        this.name = name;
    }

    public void play() {
        if (canMove()) {
            distance++;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    private void checkNameLength(String name) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 " + MAX_CAR_NAME_LENGTH + "자 이하만 가능합니다. length:" + name.length());
        }
    }

    private boolean canMove() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NO, MAX_RANDOM_NO) >= MOVEABLE_NO;
    }
}
