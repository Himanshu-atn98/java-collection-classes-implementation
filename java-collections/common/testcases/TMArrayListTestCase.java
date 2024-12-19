//This is to test/check TMArrayList.java
//This test case is for generic TMArrayList.java class.

import com.thinking.machines.utils.*;
class TMArrayListTestCase_psp
{
public static void main(String gg[])
{
TMArrayList <Integer>list1=new TMArrayList<Integer>();
for(int x=0;x<15;x++)
{
list1.add(100+x);
} 
System.out.println("****After adding integer type data list1*********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++)
{
System.out.println(list1.get(i));
}
list1.add(3,44);
System.out.println("********After inserting 44 at index:3 list1********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++)
{
System.out.println(list1.get(i));
}
list1.update(2,26);
System.out.println("*****After updating index 2 data with 26 list1*******");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++)
{
System.out.println(list1.get(i));
}
System.out.println("******Clearing list1***********");
list1.clear();
System.out.println("*********After clear Function list1 *************");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
// ADDING NEW DATA IN LIST1
list1.add(1010);
list1.add(2020);
list1.add(3030);
list1.add(40404);
list1.add(5050);
System.out.println("*******After adding new data list1********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("*******remoivng data from index 3 using removeAt Function**********");
System.out.println("Index 3 removed data:"+list1.removeAt(3));
System.out.println("*******After removing index 3 data list1********");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("\n***************************************************\n");

TMArrayList <Integer>list2=new TMArrayList<Integer>();
System.out.println("*********Before copyTo Function list2**************");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) 
{
System.out.println(list2.get(i));
}
list1.copyTo(list2);
System.out.println("********After copyTo Function list2***************");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++)
{
System.out.println(list2.get(i));
}
list2.add(1,11);
System.out.println("********After adding 11 at index 1 List2*********");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++)
{
System.out.println(list2.get(i));
}

//XYXY
System.out.println("****** Removing all elements from list2***********");
list2.removeAll();
System.out.println("*********After removing all elements using removeAll Function list2 *************");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
// ADDING NEW DATA IN LIST2
list2.add(1001);
list2.add(1002);
list2.add(1003);
System.out.println("********After adding new data List2*********");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++)
{
System.out.println(list2.get(i));
}
System.out.println("*********Before copyfrom Function list1************");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
list1.copyFrom(list2);
System.out.println("*********After copyFrom Function list1************");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("********Before appendTo Funciton list2**************");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
list1.appendTo(list2);
System.out.println("*********After appendTo Function list2*************");
System.out.println("Size of list2:"+list2.size());
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
System.out.println("********Before appendFrom Funciton list1**************");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
list1.appendFrom(list2);
System.out.println("*********After appendFrom Function list1*************");
System.out.println("Size of list1:"+list1.size());
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

System.out.println("\n**************Playing with strings******************");
TMArrayList<String> list3;
list3=new TMArrayList<String>();
list3.add("Indore");
list3.add("Ujjain");
list3.add("Dewas");
list3.add("Agar");
list3.add("Malwa");
list3.add("Mumbai");
list3.add("Pune");
list3.add("Warangal");
list3.add("Panvel");
list3.add("Thane");
list3.add("Khopoli");
list3.add("Lonavala");
list3.add("Shirdli");
list3.add("Ahmednagar");
System.out.println("Fetching the data from list3");
System.out.println("Size of list:"+list3.size());
for(int j=0;j<list3.size();j++)
{
System.out.println(list3.get(j));
}

list3.update(3,"Agra");
System.out.println("After updating index 3 data with Agra list3 is:");
for(int j=0;j<list3.size();j++) System.out.println(list3.get(j));

} //main() Ends
}//TMArrayList_psp class Ends