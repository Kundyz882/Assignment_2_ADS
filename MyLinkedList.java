import org.w3c.dom.Node;

import java.util.Iterator;

public class MyLinkedList implements MyList {
    private class MyNode{
        Object item;
        MyNode next;
        MyNode previous;


    }
    private Node head;
    private Node tail;
    private int size;


    @Override
    public void add(Object item) {

    }

    @Override
    public void set(int index, Object item) {

    }

    @Override
    public void add(int index, Object item) {

    }

    @Override
    public void addFirst(Object item) {

    }

    @Override
    public void addLast(Object item) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndex0f(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
