package pl.itacademy.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void isNull_ifStringIsNull_returnsTrue() {
        assertTrue(StringUtils.isNull(null));
    }

    @Test
    public void isNull_ifStringIsNotNull_returnsFalse() {
        assertFalse(StringUtils.isNull("asdf"));
    }

    @Test
    public void isEmpty_ifStringIsNull_returnsTrue() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    public void isEmpty_ifStringIsNotEmpty_returnsFalse() {
        assertFalse(StringUtils.isEmpty("asdf"));
    }

    @Test
    public void isEmpty_ifStringIsEmpty_returnsTrue() {
        assertTrue(StringUtils.isEmpty(""));

        assertThat(StringUtils.isEmpty(""), is(true));
    }

    @Test
    public void subString_returnsSubstring() {
        assertEquals("st", StringUtils.subString("test", 2));

        assertThat(StringUtils.subString("Java", 1), equalTo("ava"));
    }

    @Test()
    public void contains_nullParameter_throwsIllegalArgumentException() {
        Exception thrownException = assertThrows(IllegalArgumentException.class, () ->
                StringUtils.contains("Java", null));

        assertThat(thrownException.getMessage(), equalTo("One of parameters is null"));
    }

}