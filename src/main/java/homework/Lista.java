package homework;

public class Lista {

    private Element head;
    private Element tail;

    public Lista() {
        head = tail = null;
    }

    public void addHead(int wartosc) {
        Element newElement = new Element(wartosc);

        if(head == null){
            head = tail = newElement;
        }
        else {
            head.setNext(newElement);
            newElement.setPrev(head);
            head = newElement;
        }
    }

    public void addTail(int wartosc) {
        Element newElement = new Element(wartosc);

        if (tail == null) {
            tail = head =  newElement;
        } else {
            newElement.setNext(tail);
            tail.setPrev(newElement);
            tail = newElement;
        }
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
            head = tail = null;
            throw new ListaPustaException("Lista jest pusty!");
        }
        int wartosc = head.getValue();
        head = head.getPrev();
        head.setNext(null);
        return wartosc;
    }

    public int pollTail() {
        if (tail.getNext() == null) {
            head = tail = null;
            throw new ListaPustaException("Lista jest pusty!");
        }
        int wartosc = tail.getValue();
        tail = tail.getNext();
        tail.setPrev(null);
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
