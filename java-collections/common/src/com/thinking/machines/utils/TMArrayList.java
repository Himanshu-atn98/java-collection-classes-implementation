//Assignment-1 Final Verision
//It a generic class. 
//It implements TMList 
//To test/check TMArrayListTestCase.java,
package com.thinking.machines.utils;
public class TMArrayList <T> implements TMList <T>
{
private Object collection[];
private int size;
//TMArrayListIterator class
class TMArrayListIterator <T> implements TMIterator <T>
{
private int index;
private T data;
TMArrayListIterator()
{
this.index=0;
}
public boolean hasNext()
{
return this.index!=size;
}
public T next()
{
if(index==size) throw new InvalidIteratorException("Iterator has no more elements");
data=(T)get(index);
this.index++;
return data;
}
}
//iterator()
public TMIterator <T> iterator()
{
return new TMArrayListIterator <T>();
}
public TMArrayList()
{
this.collection=new Object[10];
this.size=0;
}
//add()
public void add(T data)
{
if(this.size==collection.length)
{
Object tmp[]=new Object[this.size+10];
for(int i=0;i<this.size;i++)
{
tmp[i]=this.collection[i];
}
this.collection=tmp;
}
this.collection[this.size]=data;
this.size++;
}
//add() --->Add at Index
public void add(int index,T data)
{
if(index<0 || index>this.size())
{
throw new ArrayIndexOutOfBoundsException("Invalid index:"+index);
}
if(this.size==collection.length)
{
Object tmp[]=new Object[this.size+10];
for(int i=0;i<this.size;i++)
{
tmp[i]=this.collection[i];
}
this.collection=tmp;
}
for(int i=this.size;i>index;i--)
{
this.collection[i]=this.collection[i-1];
}
this.collection[index]=data;
this.size++;
}
//insert() Insert at index
public void insert(int index,T data)
{
add(index,data);
}
 
//clear()
public void clear()
{
this.size=0;
}
//removeAll()
public void removeAll()
{
this.size=0;
}
//removeAt()
public T removeAt(int index)
{
if(index<0||index>=this.size())
{
throw new IndexOutOfBoundsException("Invalid index:"+index);
}
T data=(T) this.collection[index];
int ep=this.size-2;//ep-->endPoint
int i=index;
while(i<=ep)
{
this.collection[i]=this.collection[i+1];
i++;
}
this.size--;
return data;
}
// size()
public int size()
{
return this.size;
}
//get()
public T get(int index)
{
if(index<0 || index>=this.size)
{
throw new ArrayIndexOutOfBoundsException("Invalid index:"+index);
}
return (T) this.collection[index];
}

//update()
public void update(int index,T data)
{
if(index<0||index>=this.size)
{
throw new ArrayIndexOutOfBoundsException("Invalid index:"+index);
}
this.collection[index]=data;
}
//copyTo()
public  void copyTo(TMList <T>other)
{
other.clear();
for(int i=0;i<this.size;i++)
{
other.add(this.get(i));
}
}
//copyFrom()
public void copyFrom(TMList <T>other)
{
this.clear();
for(int i=0;i<other.size();i++) 
{
this.add(other.get(i));
}
}
// appendTo()
public void appendTo(TMList <T>other)
{
for(int i=0;i<this.size;i++) other.add(this.get(i));
}
//appendFrom()
public void appendFrom(TMList <T>other)
{
for(int i=0;i<other.size();i++) this.add(other.get(i)); 
}

//forEach()
public void forEach(TMListItemAcceptor <T>a)
{
for(int i=0;i<this.size;i++) a.accept((T)this.collection[i]);
}
} //TMArrayList class ends.

 