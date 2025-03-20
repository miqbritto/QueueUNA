public class UnaSeteLagoasQueue<T> {
    // Hold the reference to the first node of this List.
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int totalElements;

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (firstNode == null){
            firstNode = newNode;
            lastNode = newNode;
        }else {
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        totalElements ++;

    }

    public Node<T> dequeue() {
        Node<T> aux = firstNode;
        firstNode = firstNode.getNext();
        totalElements--;
        return aux;
    }

    public int size(){
        return this.totalElements;
    }

    public void toEmpty(){
        totalElements = 0;
    }

    public boolean verifyIfIsEmpty(){

        if (totalElements == 0){
            return true;
        }else {
            return false;
        }
    }




    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[ ]";
        }

        Node<T> currentNode = firstNode;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(currentNode.getValue());
            builder.append(", ");

            currentNode = currentNode.getNext();

        }

        builder.append("]");

        return  builder.toString();
    }

    // Design the other list methods.
//    Insert at the end, in order, remove at the end,
//    remove elements by value, search an element.
}