public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.get(0));

        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("A");
        list.add("B");
        System.out.println(list.get(1));

        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
    }
}