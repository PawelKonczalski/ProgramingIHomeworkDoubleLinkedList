package homework;

public class Element {

    private int value;
    private Element prev;
    private Element next;

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
