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
 import java.util.Collections;
 import java.lang.*;


public class SortedListArrayBased extends ListArrayBased
{

  	public void SortedListArrayBased()
  	// creates an empty list
  	{

      String[] init = null;
      List list = new ArrayList(Arrays.asList(init));

 	}// end default constructor

  	public void add(Object item) throws ListException
  	// Inserts item into its proper position in a sorted list
  	// Throws an exception if the item connot be placed on the list
  	{

		Arrays.sort(this);

		try
		{
      		this.add(item); //sort where, when?
            Arrays.sort(this);
		}
		catch(Exception e)
		{
			throw new ListException("Add to List failed:  " + e.toString());
		}

	} //end of add method

  	public void remove(Object item) throws ListException
  	// Removes the item from a sorted list.
  	// Throws an exception if the item is not found.
  	{
		try
		{
			this.remove(item);

		}
		catch(Exception e)
		{
			throw new ListException("Remove " + item.toString() + " from List failed:  " + e.toString());
		}
	}//end of remove method

    public int locateIndexToAdd(Object item)
	{
        String i_string = item.toString();
		Collections.sort(SortedListArrayBased());
		for (int i = 0; i <= this.size()-1; i++){
			if (this.get(i).equals(i_string)) {
				return i;
			} //end if
		} // end for

		return 0; //default return type

	} //end of locateIndexToAdd method

  	public int locateIndexToRemove(Object item)
  	// Returns the position where the item belongs or exists in a sorted list;
  	// Otherwise, it returns -1.
  	{
		String i_string = item.toString();
        Collections.sort(SortedListArrayBased());
        for (int j = 0; i <= this.size()-1; j++){
            if(this.get(j).equals(i_string)) {
                return j;
            } // end if
        } // end for

	} //end locate Index to remove method.

}  // end SortedListArrayBased
