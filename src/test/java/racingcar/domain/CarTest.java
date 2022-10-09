package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {

    @DisplayName("자동차 이름은 5자 이하만 가능하다")
    @ParameterizedTest
    @ValueSource(strings = {"a", "aa", "jue", "jina", "abcde", "트위스티드"})
    void 자동차_이름은_5자_이하만_가능하다(String name) {
        // given
        // when
        Car car = new Car(name);

        // then
        assertThat(car.getName()).isEqualTo(name);
    }

    @DisplayName("자동차 이름은 5자 초과시 예외가 발생한다")
    @ParameterizedTest
    @ValueSource(strings = {"abcdef", "aaaaaaa", "트리스타나아"})
    void 자동차_이름은_5자_초과시_예외가_발생한다(String name) {
        // given
        // when
        // then
        assertThatThrownBy(() -> new Car(name)).isInstanceOf(IllegalArgumentException.class)
                                               .hasMessageStartingWith("[ERROR] 자동차 이름은 5자 이하만 가능합니다. length:");
    }
}