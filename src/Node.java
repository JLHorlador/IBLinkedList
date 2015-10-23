
public class Node<E> {
	
	private E myData;
	private Node<E> myNext;
	
	public Node()
	{
		myData = null;
		myNext = null;
	}
	
	public Node(E data, Node<E> next)		//Overloaded constructor
	{
		myData = data;
		myNext = next;
	}

	public E getData()
	{
		return myData;
	}
	
	public Node<E> getNext()
	{
		return myNext;
	}
	
	public void setData(E data)
	{
		myData = data;
	}
	
	public void setNext(Node<E> next)
	{
		myNext = next;
	}
}
