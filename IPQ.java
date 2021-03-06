public interface IPQ<T> {
    public void push(T element);
    public int size();
    public boolean isEmpty();
    public T pop();
    public T peek();
    public void printPQ();
}
