// ********************************************************
// Array-based implementation of the ADT Sorted List.
// *********************************************************
 /**
 * class SortredListArrayBased
 *
 *    A class gets inherited from ListArrayBased
 *
 */

 import java.util.*;
 import java.lang.*;


public class SortedListArrayBased extends ListArrayBased
{

  	public String SortedListArrayBased()
  	// creates an empty list
  	{
      ArrayList<String> list = new ArrayList<String>;
      return list;
		// TO BE IMPLEMENTED BY YOU
  	}// end default constructor

  	public void add(Object item) throws ListException
  	// Inserts item into its proper position in a sorted list
  	// Throws an exception if the item connot be placed on the list
  	{
		try
		{
      list.add(item);

      //where&when to sort??

			// TO BE IMPLEMENTED BY YOU
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
			// TO BE IMPLEMENTED BY YOU
		}
		catch(Exception e)
		{
			throw new ListException("Remove " + item.toString() + " from List failed:  " + e.toString());
		}
	}

    public int locateIndexToAdd(Object item)
	{
		// TO BE IMPLEMENTED BY YOU
	}

  	public int locateIndexToRemove(Object item)
  	// Returns the position where the item belongs or exists in a sorted list;
  	// Otherwise, it returns -1.
  	{
		// TO BE IMPLEMENTED BY YOU
	}

}  // end SortedListArrayBased
