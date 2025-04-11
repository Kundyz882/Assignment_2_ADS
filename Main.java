public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(30);

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList first element: " + arrayList.getFirst());
        System.out.println("ArrayList last element: " + arrayList.getLast());

        arrayList.sort();
        System.out.println("ArrayList after sorting: ");
        for (Object elem : arrayList.toArray()) {
            System.out.print(elem + " ");
        }

        int numberToCheck = 20;
        if (arrayList.exists(numberToCheck)) {
            System.out.println("\n\nNumber " + numberToCheck + " exists in ArrayList.");
        } else {
            System.out.println("\n\nNumber " + numberToCheck + " does not exist in ArrayList.");
        }

        arrayList.add(2, 15);
        System.out.println("ArrayList after adding 15 at index 2: ");
        for (Object elem : arrayList.toArray()) {
            System.out.print(elem + " ");
        }

        arrayList.remove(1);
        System.out.println("\n\nArrayList after removing element at index 1: ");
        for (Object elem : arrayList.toArray()) {
            System.out.print(elem + " ");
        }

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(0);

        System.out.println("\n\nLinkedList size: " + linkedList.size());
        System.out.println("LinkedList first element: " + linkedList.getFirst());
        System.out.println("LinkedList last element: " + linkedList.getLast());

        linkedList.removeFirst();
        System.out.println("LinkedList after removing first element: ");
        for (Object elem : linkedList.toArray()) {
            System.out.print(elem + " ");
        }

        numberToCheck = 2;
        if (linkedList.exists(numberToCheck)) {
            System.out.println("\n\nNumber " + numberToCheck + " exists in LinkedList.");
        } else {
            System.out.println("\n\nNumber " + numberToCheck + " does not exist in LinkedList.");
        }

        linkedList.add(1, 4);
        System.out.println("LinkedList after adding 4 at index 1: ");
        for (Object elem : linkedList.toArray()) {
            System.out.print(elem + " ");
        }

        linkedList.remove(2);
        System.out.println("\n\nLinkedList after removing element at index 2: ");
        for (Object elem : linkedList.toArray()) {
            System.out.print(elem + " ");
        }

        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("\n\nStack top element: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack.peek());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("\n\nQueue first element: " + queue.peek());
        System.out.println("Queue dequeue: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue.peek());

        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.add(10);
        heap.add(5);
        heap.add(20);
        heap.add(1);

        System.out.println("\n\nHeap initial state:");
        System.out.println("Heap extractMin: " + heap.extractMin());
        System.out.println("Minimum element after extraction: " + heap.getMin());

        System.out.println("Heap extractMin: " + heap.extractMin());
        System.out.println("Minimum element after extraction: " + heap.getMin());
    }
}
