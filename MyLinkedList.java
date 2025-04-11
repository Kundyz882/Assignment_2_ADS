public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T item) {
        addLast(item);
    }

    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void set(int index, T item) {
        checkIndex(index);
        MyNode current = getNode(index);
        current.data = item;
    }

    public void add(int index, T item) {
        if (index == 0) {
            addFirst(item);
            return;
        } else if (index == size) {
            addLast(item);
            return;
        }

        checkIndex(index);
        MyNode nextNode = getNode(index);
        MyNode prevNode = nextNode.prev;

        MyNode newNode = new MyNode(item);
        newNode.next = nextNode;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        nextNode.prev = newNode;

        size++;
    }

    public T get(int index) {
        checkIndex(index);
        return getNode(index).data;
    }

    public T getFirst() {
        if (size == 0) ;
        return head.data;
    }

    public T getLast() {
        if (size == 0) ;
        return tail.data;
    }

    public void remove(int index) {
        checkIndex(index);
        MyNode nodeToRemove = getNode(index);
        removeNode(nodeToRemove);
    }

    public void removeFirst() {
        if (size == 0) return;
        removeNode(head);
    }

    public void removeLast() {
        if (size == 0) return;
        removeNode(tail);
    }

    private void removeNode(MyNode node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }

        size--;
    }

    public void sort() {
        if (size < 2) return;

        for (MyNode i = head; i != null; i = i.next) {
            for (MyNode j = i.next; j != null; j = j.next) {
                if (i.data.compareTo(j.data) > 0) {
                    T temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public int index0f(Object object) {
        int index = 0;
        for (MyNode current = head; current != null; current = current.next) {
            if (current.data.equals(object)) return index;
            index++;
        }
        return -1;
    }

    public int lastIndex0f(Object object) {
        int index = size - 1;
        for (MyNode current = tail; current != null; current = current.prev) {
            if (current.data.equals(object)) return index;
            index--;
        }
        return -1;
    }

    public boolean exists(Object object) {
        return index0f(object) != -1;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (MyNode current = head; current != null; current = current.next) {
            array[i++] = current.data;
        }
        return array;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private MyNode getNode(int index) {
        MyNode current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }
}
