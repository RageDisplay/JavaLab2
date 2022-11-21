public class MyList
{
    class Node
    {  
        public int key;
        public String index;
        public Node nextN;
    }
    private Node head;
    private Node tail;

    public int getLen()
    {
        int count = 0;
        if(head != null)
        {
            count++;
            while(head.nextN != null)
            {
                count++;
                head = head.nextN;
            }
        }

        else
        {
            return 0;    
        }
        return count;
    }

    public void printList()
    {
        Node len = head;
        while(len!=null)
        {
            System.out.print(len.index + " ");
            len = len.nextN;
        }
        System.out.println("\n");
    }

    public void addFirst(String element)
    {
        Node af = new Node();
        af.index = element;

        if(head == null)
        {
            head = af;
            tail = af;
        }

        else
        {
            af.nextN = head;
            head = af;
        }
    }

    public void addLast(String element)
    {
        Node al = new Node();
        al.index = element;

        if(tail == null)
        {
            head = al;
            tail = al;      
        }
        else
        {
            tail.nextN = al;
            tail = al;
        }
    }

    public void clear()
    {
        head=null;
        tail=null;
        System.out.println("Node cleard\n");
    }

    public void deleteFirstNode()
    {
        if(head == null)
        {
            System.out.println("Empty");
        }

        else
        {
            head = head.nextN;
        }
    }

    public void removeNode(String index)
    {
        if(head == null)
        {
            System.out.println("Empty");
            return;
        }

        if(head == tail)
        {
            head = null;
            tail = null;
            return;
        }

        if(head.index == index)
        {
            head = head.nextN;
            return;
        }

        Node rm = head;
        while(rm.nextN != null)
        {
            if(rm.nextN.index == index)
            {
                if(tail == rm.nextN)
                {
                    tail = rm;
                }
                rm.nextN = rm.nextN.nextN;
                return;
            }
            rm = rm.nextN;
        }  
    }
}
