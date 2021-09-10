package ca.bcit.comp2522;

public class Driver {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        simpleLinkedList.add("Merle");
        System.out.println(simpleLinkedList.size());
        simpleLinkedList.add("Moira");
        simpleLinkedList.add("Marla");
        simpleLinkedList.add("Margo");
        simpleLinkedList.add("Marge");

        if (simpleLinkedList.size() == 5) {
            System.out.println("Add seems to work");
        } else {
            System.out.println("Add doesn't seem to be working");
        }

        if (simpleLinkedList.find("Margo") == 2) {
            System.out.println("Find returns the correct index");
        } else {
            System.out.println("Find doesn't seem to be working");
        }

        if (simpleLinkedList.remove("Marge") == 4 && simpleLinkedList.size() == 4) {
            System.out.println("Remove seems to remove the element and return its index");
        } else {
            System.out.println("Remove doesn't seem to be working");
        }
    }
}
