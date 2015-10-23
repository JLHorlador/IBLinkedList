
public class LinkTester 
{
	public static void main(String[] args)
	{
		IBLinkedList<Integer> myList = new IBLinkedList<Integer>();
		for(int k = 0; k < 100; k++)
			myList.add(k);
		System.out.println("Displaying initial list: ");
		myList.displayList();
		myList.addToTail(-1);
		
		System.out.println("isEmpty: " + myList.isEmpty());
		System.out.println("Contains 29: " + myList.contains(29));
		System.out.println("Top element: " + myList.peek());
		System.out.println("Contains 999: " + myList.contains(999));
		System.out.println("Element at index 49: " + myList.elementAt(49));
		System.out.println("Tail element: " + myList.peekTail());
		System.out.println("Element at index 100: " + myList.elementAt(100));
		System.out.println("Displaying list afterwards: ");
		myList.displayList();
		myList.empty();
		System.out.println("isEmpty after emptying: " + myList.isEmpty());
		System.out.println("Top element: " + myList.peek());
		System.out.println("Element at index 76: " + myList.elementAt(76));
	}
}
