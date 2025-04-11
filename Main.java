public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);
        list.add(2, 15);

        System.out.println("List after adding elements:");
        printList(list);

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 3: " + list.get(3));

        list.removeFirst();
        list.removeLast();
        list.remove(2);

        System.out.println("\nList after removals:");
        printList(list);

        list.set(1, 77);
        System.out.println("\nList after set(1, 77):");
        printList(list);

        list.sort();
        System.out.println("\nList after sort:");
        printList(list);

        System.out.println("\nContains 77? " + list.exists(77));
        System.out.println("First index of 77: " + list.index0f(77));
        System.out.println("Last index of 77: " + list.lastIndex0f(77));

        Object[] array = list.toArray();
        System.out.println("\nArray contents:");
        for (Object o : array) {
            System.out.print(o + " ");
        }

        list.clear();
        System.out.println("\n\nAfter clear, size: " + list.size());
    }

    private static void printList(MyList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
