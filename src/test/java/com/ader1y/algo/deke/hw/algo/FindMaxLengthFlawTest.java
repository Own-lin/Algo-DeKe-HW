package com.ader1y.lcquestion.hw;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxLengthFlawTest {

    @Test
    void flaw() {
        FindMaxLengthFlaw func = new FindMaxLengthFlaw();
        assertEquals(0, func.flaw(2, "aeueo"));
        assertEquals(3, func.flaw(0, "asdbuiodevauufgh"));
        assertEquals(5, func.flaw(1, "aabeebuu"));
    }


}
