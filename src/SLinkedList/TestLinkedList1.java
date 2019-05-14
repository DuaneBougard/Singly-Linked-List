
package SLinkedList;

public class TestLinkedList1 {
	
	public TestLinkedList1(){
            Node a = new Node("A");
            Node b = new Node("B");
            Node c = new Node("C");
            Node d = new Node("D");
            Node e = new Node("E");
            a.setNext(b);
            b.setNext(c);
            c.setNext(d);
            d.setNext(e);
            SLinkedList list = new SLinkedList(a, e);
            System.out.println(list);
            System.out.println("Check if \"C\" is contained in the list:");
            System.out.println(list.containsItem("C"));
            System.out.println("Insert \"B\" at tail:");
            list.insertAtTail("B");
            System.out.println(list);
            System.out.println("Find first position of \"B\":");
            System.out.println(list.firstPositionOfItem("B"));
            System.out.println("Check if list is empty:");
            System.out.println(list.isEmpty());
            System.out.println("Check number of occurences of \"B\":");
            System.out.println(list.noOfOccurrences("B"));
            System.out.println("Insert \"B\" at tail:");
            list.insertAtTail("B");
            System.out.println(list);
            System.out.println("Insert \"B\" at tail:");
            list.insertAtTail("B");
            System.out.println(list);
            System.out.println("Insert \"B\" at tail:");
            list.insertAtTail("B");
            System.out.println(list);
            System.out.println("Insert \"B\" at tail:");
            list.insertAtTail("B");
            System.out.println(list);
            System.out.println("Delete last occurence of \"B\":");
            list.deleteLastOccurrence("B");
            System.out.println(list);
            System.out.println("Delete first occurence of \"B\"");
            list.deleteFirstOccurrence("B");
            System.out.println(list);
            System.out.println("Delete all occurences of \"B\":");
            list.deleteAllOccurrences("B");
            System.out.println(list);
            System.out.println("Insert \"F\" at index 1:");
            list.insertAtIndex(1, "F");
            System.out.println(list);
            System.out.println("Replace index 3 with \"X\":");
            list.replaceAtIndex(3, "X");
            System.out.println(list);
            System.out.println("Insert \"0\" at front:");
            list.insertInFront("0");
            System.out.println(list);
            
            list.allPositionsOfItem("A");
            }

            public static void main(String[] args){
                    new TestLinkedList1();
            }
}
