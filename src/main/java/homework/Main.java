package homework;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println("IsEmpty: " + lista.isEmpty() + "\n");

        lista.addHead(5);
        lista.addHead(6);
        lista.addHead(7);
        lista.addHead(8);
        lista.addHead(9);
        lista.show();

        System.out.println();

        lista.addTail(0);
        lista.addTail(1);
        lista.addTail(2);
        lista.addTail(3);
        lista.addTail(4);
        lista.show();

        try {
            System.out.println("\nPeekHead: " + lista.peekHead());

            System.out.println("\nPeekTail: " + lista.peekTail());

            System.out.println("\nUsunięcie elementu z początku listy");
            lista.pollHead();
            lista.show();

            System.out.println("\nUsunięcie elementu z końca listy");
            lista.pollTail();
            lista.show();

        } catch (ListaPustaException e) {
            System.out.println("\n" + e.getMessage());
        }

        System.out.println("\nIsEmpty: " + lista.isEmpty());

        System.out.println("\nWyświetlenie listy");
        lista.show();

        System.out.println("\nWyświetlenie listy odwrotnie");
        lista.showReverse();


    }

}
