// ********************************************************
// Array-based implementation of the ADT Sorted List.
// *********************************************************
 /**
 * class SortredListArrayBased
 *
 *    A class gets inherited from ListArrayBased
 *
 */


public class SortedListArrayBased extends ListArrayBased
{

  	public SortedListArrayBased()
  	{
		super();
  	}

  	public void add(Object item) throws ListException
  	// Inserts item into its proper position in a sorted list
  	// Throws an exception if the item connot be placed on the list
  	{
		try
		{
			this.add(locateIndexToAdd(item) , item);

		}
		catch(Exception e)
		{
			throw new ListException("Add to List failed:  " + e.toString());
		}

	}

  	public void remove(Object item) throws ListException
  	// Removes the item from a sorted list.
  	// Throws an exception if the item is not found.
  	{
		try
		{
			if(locateIndexToRemove(item) != -1)
			{
				this.remove(locateIndexToRemove(item));
			}
		}

		catch(Exception e)
		{
			throw new ListException("Remove " + item.toString() + " from List failed:  " + e.toString());
		}
	}

    public int locateIndexToAdd(Object item)
	{
		for(int i = 0; i < size(); i++)
		{
				if(this.get(i).toString().compareTo(item.toString()) >= 0)

				return i;
		}

		return size();
	}


  	public int locateIndexToRemove(Object item)
  	{

	for(int i = 0; i < this.size(); i++)
	{
		if(this.get(i).equals(item))
		{
			return i;
		}

	}

		return -1;
	}

}  // end SortedListArrayBased
