package LinkedLists;
public class LinkedList {
    private Node head;

    private class Node {
        String data;
        Node next;

       }

    // добавление значения в начало списка
    public void addToBeginning (String data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // Извлечение значения из начала списка без его удаления из списка

    public String extractFromBeginning (){
        if (head == null) return null;
        if(head != null){
            String firstData = head.data;
            System.out.println("The first value is " + firstData);
            return firstData;
        }
        else
            throw new NullPointerException("The list is empty");
    }

    // Извлечение значения из начала списка с удалением из списка
    public String extractAndDeleteFromBeginning () {
        if (head != null) {
            String firstData = head.data;
            head= head.next;
            return firstData;
        }
        else
            throw new NullPointerException("The list is empty");
    }

   // добавление значения в конец списка
    public void addToEnd (String data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head=node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    //Извлечение значения из конца списка без его удаления
    public String extractFromEnd (){
        if (head != null){
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;}
            System.out.println("The final value is " + temp.data);
            return temp.data;
        }
        else
            throw new IllegalArgumentException("The list is empty");
    }

    //Извлечение значения из конца списка с удалением
    public String extractAndDeleteFromEnd (){
        if (head != null && head.next == null) {
            String firstDate = head.data;
            head = null;
            return firstDate;
        }
        else if(head != null && head.next != null){
            Node temp = head;
            Node tail= head;
            while (temp.next != null){
                tail = temp;
                temp = temp.next;
            }
            String newDate = temp.data;
            temp = tail;
            temp.next= null;
            return newDate;
        }
        else
            throw new NullPointerException("The list is empty");
    }
      // Определение, содержит ли список заданное значение, или нет
    public boolean checkIfThereIsValue (String line) {
        Node temp = head;
        while (temp != null && temp.data != null) {
            if (temp.data.equals(line)) {
                System.out.println("The list contains " + line);
               return true;
                }
            temp = temp.next;

            }
        System.out.println("The list doesn't contain " + line);
        return false;

        }




    // Определение, является ли список пустым, или нет
    public boolean checkIfEmpty (){
        if (head != null)
            System.out.println("The list contains data");
        else System.out.println("The list is empty");

        return true;
    }

    //удаление заданного значения из списка
    public void deleteTheGivenDataFromTheList(String line) {

        Node temp = head;
        Node previousTemp = null;
        if(head.data.equals(line)){
            head = head.next;
        }
        while (temp != null && !temp.data.equals(line)) {
            previousTemp = temp;
            temp = temp.next;

            if (temp.data != null && temp.data.equals(line)) {
                if (temp == head) {
                    head = head.next;
                } else {
                    previousTemp.next = temp.next;
                }


            }
        }
    }

    //выполнение действия, заданного в параметре метода, для каждого значения из списка
    public void modifyEachElement(String newData) {
        Node temp = head;

        while (temp != null) {
            temp.data = temp.data+newData;
            temp = temp.next;
        }
    }

    // Печать всех значений списка
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}