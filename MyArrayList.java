
public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private Object[] elements;
    private int length;
    private static final int capacity = 10;

    public MyArrayList() {
        elements = new Object[capacity];
        length = 0;
    }

    public void add(T element) {
        if (length == elements.length) {
            increaseCapacity();
        }
        elements[length++] = element;
    }


    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i]; //upcasting
        }
        elements = newElements;
    }



    public void set(int index, T item) {
        checkIndex(index);
        elements[index] = item;
    }

    public void add(int index, T item) {
        if (index < 0 || index > length) throw new IndexOutOfBoundsException();
        increaseCapacity();
        for (int i = length; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        length++;
    }


    public void addFirst(T item) {
        add(0, item);
    }

    public void addLast(T item) {
        add(item);
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    public T getFirst() {
        return get(0);
    }

    public T getLast() {
        return get(length - 1);
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i + 1];
        }

    }

    public void removeFirst() {
        remove(0);
    }

    public void removeLast() {
        remove(length - 1);
    }

    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                T a = get(j);
                T b = get(j + 1);
                if (a.compareTo(b) > 0) {
                    T temp = a;
                    elements[j] = b;
                    elements[j + 1] = temp;
                }
            }
        }
    }

    public int index0f(Object object) {
        for (int i = 0; i < length; i++) {
            if (elements[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndex0f(Object object) {
        for (int i = length - 1; i >= 0; i--) {
            if (elements[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public boolean exists(Object object) {
        return index0f(object) != -1;
    }

    public Object[] toArray() {
        Object[] result = new Object[length];
        for (int i = 0; i < length; i++) {
            result[i] = elements[i];
        }
        return result;
    }

    public void clear() {
        elements = new Object[capacity];
        length = 0;
    }

    public int size() {
        return length;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException("Index: " + index + " not found");
    }
}
