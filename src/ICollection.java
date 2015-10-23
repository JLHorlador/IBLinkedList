public interface ICollection<E> 
{
	//add an element of type E to this Collection
	public void add(E obj);
	
	//return the "next" element from this Collection
	public E peek();
	
	//remove the specified element from this Collection
	//return TRUE if the element was found and removed
	//return FALSE if the element was not found
	public boolean remove(E obj);
	
	//Remove all elements from this Collection
	public void empty();
	
	//return the number of elements in this Collection
	public int size();	
		
	//return TRUE if there are no elements in this collection
	public boolean isEmpty();
	
	//return TRUE if this Collection contains the element obj
	public boolean contains(E obj);

}