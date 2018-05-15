public class Main {

    public static void main(String[] args) {
        Heap<ErrorInformation> heap = new Heap<>();
        ErrorInformation e1 = new ErrorInformation("a", "a", 1);
        ErrorInformation e2 = new ErrorInformation("b", "a", 2);
        ErrorInformation e3 = new ErrorInformation("c", "a", 3);
        ErrorInformation e4 = new ErrorInformation("d", "a", 4);
        ErrorInformation e5 = new ErrorInformation("e", "a", 2);
        heap.push(e1);
        heap.push(e2);
        heap.push(e3);
        heap.push(e4);
        heap.push(e5);
        System.out.println(heap);

        heap.pop();
        heap.sort();
        System.out.println(heap);
    }
}