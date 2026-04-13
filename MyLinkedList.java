class MyLinkedList<T> implements MyList<T> {

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

    public void add(T element) {
        MyNode newNode = new MyNode(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, T element) {
        MyNode newNode = new MyNode(element);
        MyNode current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newNode.next = current;
        newNode.prev = current.prev;

        if (current.prev != null) {
            current.prev.next = newNode;
        } else {
            head = newNode;
        }

        current.prev = newNode;
        size++;
    }

    public T get(int index) {
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public T remove(int index) {
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        size--;
        return current.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
