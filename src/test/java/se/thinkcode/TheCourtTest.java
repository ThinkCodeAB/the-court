package se.thinkcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TheCourtTest {

    @Test
    public void negative_tabs_are_not_allowed() {
        Integer expected = 0;
        TheCourt court = new TheCourt();

        court.swipe("Someone", -1);
        Integer actual = court.getBalance("Someone");

        assertThat(actual, is(expected));
    }
}
