class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap = new MyArrayList<>();
    public void add(T value) {
        heap.add(value);
        heapifyUp();
    }

    private void heapifyUp() {
        int index = heap.size() - 1;

        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(index).compareTo(heap.get(parent)) < 0) {
                T temp = heap.get(index);
                heap.add(index, heap.get(parent));
                heap.add(parent, temp);
            }
            index = parent;
        }
    }

    public T remove() {
        return heap.remove(0);
    }
}
