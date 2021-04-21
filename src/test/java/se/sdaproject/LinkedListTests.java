package se.sdaproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testAdd() {
        int expectedResult = 4;
        int a = 2;
        int b = 2;
        assertEquals(expectedResult, a+b);
    }


    @Test
    void search() {
        LinkedList list = new LinkedList();
        list.add(2);
        String expected = "LinkedList(2)";
        //assertEquals(2, list.search (Node, int));
    }

    @Test
    void get() {
        LinkedList list = new LinkedList();
        list.add(2);
        String expected = "LinkedList(2)";
        assertEquals(2, list.get(0));
    }


    @Test
     void getSize() {
        LinkedList list = new LinkedList();
        list.add(2);
        String expected = "LinkedList(2)";
        //assertTrue(getSize(0));
    }
}


