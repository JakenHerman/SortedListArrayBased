// ********************************************************
// Array-based implementation of the ADT list.
// *********************************************************
public class ListArrayBased implements ListInterface {

  private static final int MAX_LIST = 50;
  private Object items[];  // an array of list items
  private int numItems;  // number of items in list

  public ListArrayBased() {
    items = new Object[MAX_LIST];
    numItems = 0;
  }  // end default constructor

  public boolean isEmpty() {
    return (numItems == 0);
  } // end isEmpty

  public int size() {
    return numItems;
  }  // end size

  public void removeAll() {
    // Creates a new array; marks old array for
    // garbage collection.
    items = new Object[MAX_LIST];
    numItems = 0;
  } // end removeAll

  public void add(int index, Object item)
                  throws  ListIndexOutOfBoundsException {
    if (numItems >= MAX_LIST) {
      throw new ListException("ListException on add");
}  // end if
    if (index >= 0 && index <= numItems) {
      // make room for new element by shifting all items at
      // positions >= index toward the end of the
      // list (no shift if index == numItems)
      for (int pos = numItems-1; pos >= index; pos--) {
          items[pos+1] = items[pos];
      } // end for
      // insert new item
      items[index] = item;
      numItems++;
    }
    else {  // index out of range
      throw new ListIndexOutOfBoundsException(
       "ListIndexOutOfBoundsException on add");
    }  // end if
  } //end add

  public Object get(int index)
                    throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < numItems) {
      return items[index];
    }
    else  {  // index out of range
      throw new ListIndexOutOfBoundsException(
        "ListIndexOutOfBoundsException on get");
    }  // end if
  } // end get

  public void remove(int index)
                     throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < numItems) {
      // delete item by shifting all items at
      // positions > index toward the beginning of the list
      // (no shift if index == size)
      for (int pos = index+1; pos < size(); pos++) {
        items[pos-1] = items[pos];
      }  // end for
      numItems--;
    }
    else {  // index out of range
      throw new ListIndexOutOfBoundsException(
                "ListIndexOutOfBoundsException on remove");
    }  // end if
  } // end remove

  public String toString()
  {
	  String str = new String();
	  for (int i = 0; i < size(); i++)
	  	str += (get(i) + " ");
	  return str;
  }

  public void reverse()
  {
	  int last = size() / 2;
	  for (int i = 0; i < last; i++){
		  Object temp = items[i];
		  items[i] = items[size()-1-i];
		  items[size()-1-i] = temp;
	  }
  }

  public Object findMToLast(int m)
  {
	  return items[size()-m];
  }

}  // end ListArrayBased
