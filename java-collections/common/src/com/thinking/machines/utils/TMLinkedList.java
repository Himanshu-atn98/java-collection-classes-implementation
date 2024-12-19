//Assignment-1 Final Version
//It a generic class.
//It implements TMList interface
//To test/check TMLinkedListTestCase.java,TMIteratorTestCase.java,
// and  ForEachTestCase.java
package com.thinking.machines.utils;
public class TMLinkedList <T> implements TMList <T>
{
class TMNode <T>
{
T data;
TMNode next;
TMNode()
{
this.data=null;
this.next=null;
}
}
//TMLinkedListIterator class
class TMLinkedListIterator <T> implements TMIterator <T>
{
private TMNode <T>ptr;
private T data;
TMLinkedListIterator(TMNode <T>ptr)
{
this.ptr=ptr;
}
public boolean hasNext()
{
/*
if(ptr!=null) return true;
else return false;
*/
return ptr!=null;
}
public T next()
{
if(ptr==null) 
{
throw new InvalidIteratorException("Iterator has no more elements");
}
data=(T)ptr.data;
ptr=ptr.next;
return data;
}
}
//iterator()
public TMIterator <T> iterator()
{
return new TMLinkedListIterator <T>(this.start);
}
private TMNode <T> start,end;
private int size;
public TMLinkedList()
{
this.start=null;
this.end=null;
this.size=0;
}
//size()
public int size()
{
return this.size;
}
//add()
public void add(T data)
{
TMNode <T>node=new TMNode<T>();
node.data=data;
if(this.start==null)
{
this.start=node;
this.end=node;
}
else
{
this.end.next=node;
this.end=node;
}
this.size++;
}
//add() Add at index
public void add(int index,T data)
{
if(index<0) throw new IndexOutOfBoundsException("Invalid index:"+index);
TMNode <T>node=new TMNode<T>();
node.data=data;
if(index>=this.size)
{
this.end.next=node;
this.end=node;
this.size++;
return;
/*
//Or
add(data);
return;
*/
}
if(index==0)
{
node.next=this.start;
this.start=node;
}
else
{
TMNode <T> p1,p2;
p1=this.start;
p2=null;
int x=0;
while(x<index)
{
p2=p1;
p1=p1.next;
x++;
}
p2.next=node;
node.next=p1;
}
this.size++;
}
//insert() Insert at Index
public void insert(int index,T data)
{
add(index,data);
}

//get()
public T get(int index)
{
if(index<0 || index>=this.size)
{
throw new IndexOutOfBoundsException("Invalid index:"+index);
}
TMNode <T>node=start;
int x=0;
while(x<index)
{
node=node.next;
x++;
}
return node.data;
}
//removeAt()
public T removeAt(int index)
{
if(index<0||index>=this.size())
{
throw new IndexOutOfBoundsException("Invalid index:"+index);
}
T data;
if(start==end)
{
data=this.start.data;
this.start=null;
this.end=null;
this.size=0;
return data;
}
if(index==0)
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
TMNode <T> p1,p2;
p1=start;
p2=null;
int x=0;
while(x<index)
{
p2=p1;
p1=p1.next;
x++;
}
data=p1.data;
p2.next=p1.next;
if(this.end==p1) end=p2;
this.size--;
return data;
}

//removeAll()
public void removeAll()
{
this.clear();
}
//clear()
public void clear()
{
this.start=null;
this.end=null;
this.size=0;
}
//update()
public void update(int index, T data)
{
if(index<0 || index>=this.size())
{
throw new IndexOutOfBoundsException("Invalid index:"+index);
}
if(index==0)
{
this.start.data=data;
return;
}
if(index==this.size-1)
{
this.end.data=data;
return;
}
TMNode <T>node=this.start;
int x=0;
while(x<index)
{
node=node.next;
x++;
}
node.data=data;
}
//copyTo()
public  void copyTo(TMList <T>other)
{
other.clear();
for(int i=0;i<this.size();i++) other.add(this.get(i));
}
//copyFrom()
public void copyFrom(TMList <T>other)
{
this.clear();
for(int i=0;i<other.size();i++) this.add(other.get(i));
}
//appendTo()
public void appendTo(TMList <T>other)
{
for(int i=0;i<this.size();i++) other.add(this.get(i));
}
//appendFrom()
public void appendFrom(TMList <T>other)
{
for(int i=0;i<other.size();i++) this.add(other.get(i));
}

//forEach()
public void forEach(TMListItemAcceptor <T>a)
{
TMNode <T>t;
for(t=this.start;t!=null;t=t.next)
{
a.accept(t.data);
}
}

}//TMLinkedList Ends
