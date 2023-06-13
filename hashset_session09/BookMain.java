package com.hashset_session09;
import java.util.HashSet;
import java.util.Set;
public class BookMain {

	public static void main(String[] args) {
		Book bk1=new Book("math   ", "rd sharma", 101);
		Book bk2=new Book("science", "shahrukh ", 102);
		Book bk3=new Book("java   ", "saira    ", 103);
		Book bk4=new Book("html   ", "saira    ", 104);
		Book bk5=new Book("css    ", "raaz     ", 105);
		Book bk6=new Book("java   ", "saira    ", 103);
		Set<Book>kb=new HashSet<Book>();
		kb.add(bk1);
		kb.add(bk2);
		kb.add(bk3);
		kb.add(bk4);
		kb.add(bk5);
		kb.add(bk6);
		boolean found=false;
		for(Book bs:kb)
		{
			if(bs.getbName().contains("java"))
{
	System.out.println(bs.getbName()+":"+bs.getbId()+":"+bs.getbAuthor());
	found=true;
	System.out.println("containt");
	break;
}
		}
		if(found==false)
		{
			System.out.println("not");
		}
	}

}
