public class GenLL<T>
{
   private class ListNode
   {
       T data;
       ListNode link;
       public ListNode(T aData, ListNode aLink)
       {
    	   data = aData;
    	   link = aLink;
       }
   }  
   private ListNode head;
   private ListNode previous;
   private ListNode current;

   public GenLL()
   {
       head = current = previous = null;
   } 
   public void add(T aData)
   {
       ListNode newNode = new ListNode(aData, null);
       newNode.data = aData;
       newNode.link = null;
      
       if(head == null)
       {
           head = newNode;
           previous = null;
           current = head;
       }
       else
       {
           previous = current;
           current.link = newNode;  
           current = newNode;
           previous.link = current;
       }
   } 
   public void removeCurrent()
   {
       if(current == null)
           return;
      
       if(previous == null)
       {
              head = current.link;
              current = head;
       }
       else
       {
           previous.link = current.link;
           current = current.link;
       }      
   } 
   public boolean contains(T aMovie)
   {
		for(ListNode temp = head; temp != null; temp = temp.link)
			if(temp.data.equals(aMovie))
				return true;
		return false;
   }
   public T getCurrent()
   {
       if(current == null)
           return null;
       else
           return current.data;
   } 
   public void moveCurrentForward()
   {
       if(current == null || current.link == null)
           return;
       else
       {
           previous = current;
           current = current.link;
       }
   } 
   public void moveCurrentBackward()
   {
       if(previous == null || current == null)
       {
           return;
       }
       else
       {
           current = previous;
          
           ListNode temp = head;
           while(temp != null && temp.link != previous)
           {
               temp = temp.link;
           }
          
           previous = temp;          
       }
   } 
   public void gotoHead()
   {
       previous = null;
       current = head;
   }
   public void print()
   {
       ListNode temp = head;
       while(temp != null)
       {
           System.out.println(temp.data);
           temp = temp.link;
       }      
   } 
   public int getSize()
   {
       int count = 0;
       ListNode temp = head;
       while(temp != null)
       {
           count++;
           temp = temp.link;
       }      
       return count;
   } 
}
