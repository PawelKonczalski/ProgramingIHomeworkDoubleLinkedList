package homework;

public class Lista {

    private Element head;
    private Element tail;

    public Lista() {
        head = tail = null;
    }

    public void addHead(int wartosc) {
        Element newElement = new Element(wartosc);
        head = tail;
        newElement.setNext(null);

        if (tail == null) {
            newElement.setPrev(null);
            tail = newElement;
            return;
        }

        while (head.getNext() != null) {
            head = head.getNext();
        }

        head.setNext(newElement);
        newElement.setPrev(head);
        head = newElement;

    }

    public void addTail(int wartosc) {
        Element newElement = new Element(wartosc);
        newElement.setNext(tail);
        newElement.setPrev(null);

        if (tail != null) {
            tail.setPrev(newElement);
        }

        if (head == null) {
            newElement.setNext(null);
            head = newElement;
        }

        tail = newElement;

    }

    public int peekHead() {
        if (isEmpty()) {
            throw new ListaPustaException("Lista jest pusty!");
        }
        return head.getValue();
    }

    public int peekTail() {
        if (isEmpty()) {
            throw new ListaPustaException("Lista jest pusty!");
        }
        return tail.getValue();
    }

    public int pollHead() {
        if (head.getPrev() == null) {
            throw new ListaPustaException("Lista jest pusty!");
        }
        int wartosc = head.getValue();
        head = head.getPrev();
        head.setNext(null);
        return wartosc;
    }

    public int pollTail() {
        if (tail.getNext() == null) {
            throw new ListaPustaException("Lista jest pusty!");
        }
        int wartosc = tail.getValue();
        tail = tail.getNext();
        tail.setPrev(null);
        if (tail == null) {
            head = null;
        }
        return wartosc;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }


    public void show() {
        Element pointer = tail;
        while (pointer != null) {
            System.out.print(pointer.getValue() + " ");
            pointer = pointer.getNext();
        }
        System.out.println();
    }

    public void showReverse() {
        Element pointer = head;
        while (pointer != null) {
            System.out.print(pointer.getValue() + " ");
            pointer = pointer.getPrev();
        }
        System.out.println();
    }
}
