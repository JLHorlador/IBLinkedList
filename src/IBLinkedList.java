public class IBLinkedList<E> implements ICollection<E>
{
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public IBLinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public IBLinkedList(IBLinkedList<E> other)
	{
		
	}
	
	public void displayList()
	{
		int count = 0;
		Node<E> current = head;
		while (current != null)
		{
			//Checks to see if the current is at the tail, in which case it does not display an arrow
			if (current.getData().equals(tail.getData()))
				System.out.print(current.getData());
			else
				System.out.print(current.getData() + " -> ");
			current = current.getNext();	//Current moves to the next node
			count++;	//Count is used to move the display to the next line
			if (count % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	//add an element of type E to this Collection
	public void add(E obj)
	{
		Node<E> newNode;
		
		if (head == null)
		{
			newNode = new Node<E>(obj, null);	//Creates a new node called newNode that points to the tail
			tail = newNode;	//Assign tail to this first node
		}
		else
			newNode = new Node<E>(obj, head);	//If the list is not empty, assign the new node to head
		head = newNode;		//Set head as the new node
		size++;		//Increase size
	}
	
	//Add an element of type E to the end (tail) of this Collection
	public void addToTail(E obj)
	{
		Node<E> newNode = new Node<E>(obj, null);	//Makes a new node that points to null
		tail.setNext(newNode);		//Sets the current tail's node to point to the new node
		tail = newNode;		//Tail is now assigned as the new node
		size++;		//Increase size
	}
	
	//return the "next" element from this Collection
	public E peek()
	{
		if (size == 0)	//Checks if the Collection is empty, if it is return null
			return null;
		return head.getData();	//Otherwise, return the data of the head
	}
	
	public E peekTail()
	{
		if (size == 0)	//Checks if the list is empty
			return null;	//Returns null if it is empty
		return tail.getData();	//Otherwise, return the data of the tail
	}
		
	//remove the specified element from this Collection
	//return TRUE if the element was found and removed
	//return FALSE if the element was not found
	public boolean remove(E obj)
	{
		//Check if the data we want to remove is in the head
		if(head.getData().equals(obj))	//Checks if the head's data is equal to what we want to remove
		{
			head = head.getNext();		//Assigns the head to the next object
			size--;		//Decrements size
			return true;
		}
		else	//Otherwise, check if the object we want to remove is somewhere in the Collection
		{
			Node<E> current = head.getNext();
			Node<E> previous = head;
			while(current != null)
			{
				if(current.getData().equals(obj))
				{
					previous = current.getNext();
					size--;
					return true;
				}
				
				previous = current;
				current = current.getNext();
			}
			return false;
		}
	}
		
	//Remove all elements from this Collection
	public void empty()
	{
		size = 0;
		head = null;
		tail = null;
	}
		
	//return the number of elements in this Collection
	public int size()
	{
		return size;
	}
			
	//return TRUE if there are no elements in this collection
	public boolean isEmpty()
	{
		return size == 0;		//Returns true or false depending on if it is empty
	}
		
	//return TRUE if this Collection contains the element obj
	public boolean contains(E obj)
	{
		Node<E> current = head;
		while(current != null)
		{
			if (current.getData().equals(obj))
				return true;
			current = current.getNext();
		}
		return false;
	}
	
	public E elementAt(int index)
	{
		Node<E> current = head;
		for (int i = 0; i < index && current != null; i++)
			current = current.getNext();
		
		if (current == null)
			return null;
		return current.getData();
	}
}
