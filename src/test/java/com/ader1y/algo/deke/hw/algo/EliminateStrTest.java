package com.ader1y.lcquestion.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EliminateStrTest {

    @Test
    void eliminate() {
        EliminateStr func = new EliminateStr();
        assertEquals("abcdefghijklmn", func.eliminate("abcdefghijklmn"));
        assertEquals("abefghijklmn", func.eliminate("abbbefghijklmn"));
        assertEquals("aefgijklmn", func.eliminate("bbaddefghhijklmn"));
        assertEquals("abcfghijklmnb", func.eliminate("abcdeedfghijklmnbnn"));
    }
}
