public class MyStack<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if (list.size() == 0) ;
        T item = list.getLast();
        list.removeLast();
        return item;
    }

    public T peek() {

        return list.getLast();
    }

    public boolean isEmpty() {

        return list.size() == 0;
    }
}
