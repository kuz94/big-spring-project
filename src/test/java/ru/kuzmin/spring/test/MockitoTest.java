package ru.kuzmin.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockitoTest {
    @Mock
    private List<String> lines;

    private String helloString = "Hello Mockito!";

    @Before
    public void befoteTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void MockitoTest() {
        Iterator<String> mockList = mock(Iterator.class);
        String[] splitHello = helloString.split(" ");
        when(mockList.next())
                .thenReturn(splitHello[0])
                .thenReturn(splitHello[1]);

        assertEquals(helloString, mockList.next() + " " + mockList.next());
    }

    @Test
    public void AnnotationTest() {
        when(lines.get(10)).thenReturn(helloString);
        when(lines.containsAll(any(Collection.class))).thenReturn(false);

        assertEquals(helloString, lines.get(10));
    }

}
