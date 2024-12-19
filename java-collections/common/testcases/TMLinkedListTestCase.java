//Assignment-1 Final Verision
//This is to test/check generic class TMLinkedList.java

import com.thinking.machines.utils.*;
class TMLinkedListTestCase_psp
{
public static void main(String gg[])
{
TMLinkedList <Integer>list1;
list1=new TMLinkedList<Integer>();
list1.add(100);
list1.add(200);
list1.add(300);
list1.add(400);
list1.add(500);
System.out.println("********After add() Function list1**********");
System.out.println("Size of list1 :"+list1.size());
for(int i=0;i<list1.size();i++)
{
System.out.println(list1.get(i));
}
System.out.println("*********Using update() Function************");
list1.insert(1,100001);
System.out.println("*********After inserting 100001 at index 1************");
System.out.println("Size of list1 :"+list1.size());
for(int i=0;i<list1.size();i++)
{
System.out.println(list1.get(i));
}
list1.insert(0,200002);
System.out.println("*********After inserting 200002 at index 0************");
System.out.println("Size of list1 :"+list1.size());
for(int i=0;i<list1.size();i++)
{
System.out.println(list1.get(i));
}
System.out.println("*************Clearing list1************");
list1.clear();
System.out.println("**********After clearing all elements list1********");
System.out.println("Size of list1 :"+list1.size());
for(int i=0;i<list1.size();i++)
{
System.out.println(list1.get(i));
}
list1.add(101);
list1.add(102);
list1.add(103);
System.out.println("***********After adding new data list1*********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("********removeAt()Function*********");
list1.removeAt(1);
System.out.println("********After removing the element of index 1 list1 is*************");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("************************************************");
TMLinkedList <Integer>list2=new TMLinkedList<Integer>();
list2.add(1010);
list2.add(1020);
list2.add(1030);
System.out.println("**********After add() Function list2**************");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
System.out.println("*********Before copyTo() Function list2**********");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
list1.copyTo(list2);
System.out.println("********After copyTo() Function list2**********");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));

list2.add(111);
list2.add(222);
list2.add(333);
System.out.println("********After adding new data list2********");
System.out.println("list2 size:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));

System.out.println("********Before copyFrom() Function list1********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
list1.copyFrom(list2);
System.out.println("********After copyFrom() Function list1********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

System.out.println("***********Before calling appendTo() for list1 and then list2*********");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
System.out.println("***********After calling appendTo() for list1 and then list2**********");
list1.appendTo(list2);
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));

System.out.println("**********Before calling appendFrom() for list1 and then list1********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
list1.appendFrom(list2);
System.out.println("*********After calling appendFrom() for list1 and then list1**********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
}//main() Ends
}//TMLinkedListTestCase_psp Ends 
