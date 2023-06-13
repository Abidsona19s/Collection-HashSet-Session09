package com.hashset_session09;
import java.util.Set;
import java.util.HashSet;
public class StudentConsMain {

	public static void main(String[] args) {
		StudentCons st1=new StudentCons("abid", 19);
		StudentCons st2=new StudentCons("abid", 10);
		StudentCons st3=new StudentCons("abid", 17);

		Set<StudentCons>stc=new HashSet<StudentCons>();
		stc.add(st1);
		stc.add(st2);
		stc.add(st3);
		for(StudentCons sc:stc)
		{
			sc.display();
		}
		
	}

}
