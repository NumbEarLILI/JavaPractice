package idepractice;

import org.junit.Test;

import static org.junit.Assert.*;

public class IDEDemoTest {
    @Test
    public void should_return_true_when_input_right() throws Exception {
        assertTrue(new IDEDemo("beta").checkName("beta"));
    }
}