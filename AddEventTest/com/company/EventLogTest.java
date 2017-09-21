package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest {
    Event event = new Event();
    Event secondEvent = new Event();
    Event thirdEvent;

    @Before
    public void setUp() throws Exception {
        event.setAction("Party Really Hard");
        event.setName("Party");

    }

    @After
    public void tearDown() throws Exception {
    }
    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void addEvent() throws Exception {
        EventLog log = new EventLog();
        assertTrue(log.addEvent(event));



    }
    @Test
    public void addEventNullPointer() throws Exception{
        EventLog log = new EventLog();
        expected.expect(IllegalArgumentException.class);
        assertTrue(log.addEvent(secondEvent));
        assertTrue(log.addEvent(thirdEvent));
    }

}