//Assignment-1 Final Verision
//This testcase for generic class TMLinkedList.java and TMArrayList.java

import com.thinking.machines.utils.*;
class TMIteratorTestCase_psp
{
public static void main(String gg[])
{
TMLinkedList <Integer>list1=new TMLinkedList<Integer>();
list1.add(101);
list1.add(201);
list1.add(301);
list1.add(401);
list1.add(501);
TMArrayList <Integer>list2=new TMArrayList<Integer>();
list2.add(10);
list2.add(20);
list2.add(30);
list2.add(40);
list2.add(50);
System.out.println("*****Iterating on linked list*****");
TMIterator iterator1=list1.iterator();
Integer x;
while(iterator1.hasNext())
{
x=(Integer)iterator1.next();
System.out.println(x.intValue());
//Or-> System.out.println(iterator1.next());
}
System.out.println("*****Iterating on array list*****");
TMIterator iterator2=list2.iterator();
while(iterator2.hasNext())
{
System.out.println(iterator2.next());
/*
x=(Integer)iterator2.next();
System.out.println(x.intValue());
*/
}
}// main() Ends
}//TMIteratorTestCase_psp class Ends
