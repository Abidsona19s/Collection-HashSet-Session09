package com.hashset_session09;
import java.util.Set;
import java.util.HashSet;
public class StudentMain {

	public static void main(String[] args) {
		Student st1=new Student();
		st1.setStName("saira");
		st1.setStRollNo(19);
		Student st2=new Student();
		st2.setStName("saira");
		st2.setStRollNo(20);

		Student st3=new Student();
		st3.setStName("saira");
		st3.setStRollNo(19);
		
		Set<Student> stt=new HashSet<Student>();
		stt.add(st1);
		stt.add(st2);
		stt.add(st3);
		for(Student sts:stt)
		{
			System.out.println(sts.getStName()+":"+sts.getStRollNo());
		}
		

	}

}
