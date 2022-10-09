package racingcar.domain;

public class Car {

    private static final int MAX_CAR_NAME_LENGTH = 5;
    private final String name;

    public Car(String name) {
        checkNameLength(name);
        this.name = name;
    }

    private void checkNameLength(String name) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 " + MAX_CAR_NAME_LENGTH + "자 이하만 가능합니다. length:" + name.length());
        }
    }

    public String getName() {
        return name;
    }
}
