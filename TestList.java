public class TestList extends MyList
{
    public static void main(String[] args) 
    {
        MyList test = new MyList();
        test.addFirst("t");
        test.addLast("5");
        test.addFirst("j");
        test.addLast("4");
        test.addFirst("9");
        test.addLast("x");
        test.printList();
        test.deleteFirstNode();
        test.printList();
        test.removeNode("4");
        test.printList();
        System.out.println(test.getLen()+"\n");
        test.clear();
        test.addFirst("7");
        test.printList();
    }
}