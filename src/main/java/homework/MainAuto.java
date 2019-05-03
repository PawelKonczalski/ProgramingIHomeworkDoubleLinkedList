package homework;

import java.util.Scanner;

public class MainAuto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        while (true) {
            System.out.print("Select: 1. addHead 2. addTail, 3. peekHead, 4. peekTail, 5. pollHead, 6. pollTail, 7. isEmpty, 8. show 9. showReverse, 0. Exit : ");
            int num = scanner.nextInt();

            switch (num) {
                case 0:
                    System.out.print("End of program operation");
                    return;
                case 1:
                    System.out.print("Enter the value at the end of the list: ");
                    int initialValue = scanner.nextInt();
                    lista.addHead(initialValue);
                    break;
                case 2:
                    System.out.print("Enter the value at the beginning of the list: ");
                    int endValue = scanner.nextInt();
                    lista.addTail(endValue);
                    break;
                case 3:
                    try {
                        System.out.println("The last value from the list: " + lista.peekHead());
                    } catch (ListaPustaException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("The first value from the list: " + lista.peekTail());
                    } catch (ListaPustaException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Deleting the last value from the list: " + lista.pollHead());
                    } catch (ListaPustaException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Deleting the first value from the list: " + lista.pollTail());
                    } catch (ListaPustaException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Is the list empty: " + lista.isEmpty());
                    break;
                case 8:
                    lista.show();
                    break;
                case 9:
                    lista.showReverse();
                    break;
                default:
                    System.out.print("Incorrect operation!");
            }
        }
    }
}

