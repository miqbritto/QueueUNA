

public class Main {
    public static void main(String[] args) {
        UnaSeteLagoasQueue<Integer> myList = new UnaSeteLagoasQueue<>();

        myList.enqueue(1);
        System.out.println(myList);
        myList.enqueue(2);
        System.out.println(myList);
        myList.enqueue(3);
        System.out.println(myList);

        myList.toEmpty();
        System.out.println(myList);







        System.out.println();
    }
}