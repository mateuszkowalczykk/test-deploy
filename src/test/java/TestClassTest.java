import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClassTest {
    @Test
    void should_return_test() {
        Assertions.assertThat(TestClass.test()).isEqualTo("test");
    }
}
