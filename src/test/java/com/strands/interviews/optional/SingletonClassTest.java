package com.strands.interviews.optional;

import com.strands.interviews.eventsystem.events.SimpleEvent;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingletonClassTest {
    @Test
    public void testSameInstance() {
        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();
        assertTrue(singleton1.equals(singleton2));
    }
}
