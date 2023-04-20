package LinkedLists;
public class MainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToEnd("The list");
        list.addToEnd("is");
        list.addToEnd("working");
        list.addToEnd("right");
        list.addToEnd("now");
        list.print();
        list.addToBeginning("bzzzzzzzz");
        list.print();
        list.extractFromBeginning();
        list.extractFromEnd();
        list.extractAndDeleteFromBeginning();
        list.print();
        list.extractAndDeleteFromEnd();
        list.print();
        list.checkIfEmpty();
        list.checkIfThereIsValue("right");
        list.checkIfThereIsValue("ranger");
        list.deleteTheGivenDataFromTheList("The list");
        list.print();
        list.modifyEachElement("r");
        list.print();


    }

}
