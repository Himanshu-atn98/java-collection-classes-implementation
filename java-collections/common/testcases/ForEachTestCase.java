//Assignment-1 Final Verision
//This testcase for generic class TMLinkedList.java and TMArrayList.java

import com.thinking.machines.utils.*;
class ForEachTestCase_psp
{
public static void main(String gg[])
{
TMList list1=new TMLinkedList();
list1.add(101);
list1.add(201);
list1.add(301);
list1.add(401);
list1.add(501);
System.out.println("Iterating on linked list using forEach()method");

list1.forEach((m)->{
System.out.println(m);
});

System.out.println("**********************************************");
TMList list2=new TMArrayList();
list2.add(10);
list2.add(20);
list2.add(30);
list2.add(40);
list2.add(50);
System.out.println("Iterating on array list using forEach() method");

list2.forEach((n)->{
System.out.println(n);
});

}//main() Ends
}//ForEachTestCase.java Ends