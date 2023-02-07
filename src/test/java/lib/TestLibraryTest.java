package lib;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestLibraryTest {
    @Test
    void helloWorldTest() {
        //given
        boolean flag = true;

        //when
        String s = TestLibrary.helloWorld(flag);

        //then
        assertThat(s).isEqualTo("hello world!");
    }
}