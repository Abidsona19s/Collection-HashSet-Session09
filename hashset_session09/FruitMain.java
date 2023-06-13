package com.hashset_session09;
import java.util.Set;
import java.util.HashSet;
public class FruitMain {

	public static void main(String[] args) {
		FruitSet ft1=new FruitSet("apple");
		FruitSet ft2=new FruitSet("banana");
		FruitSet ft3=new FruitSet("mango");
		FruitSet ft4=new FruitSet("orange");
		FruitSet ft5=new FruitSet("pineapple");
		FruitSet ft6=new FruitSet("watermelon");
		FruitSet ft7=new FruitSet("graps");
		FruitSet ft8=new FruitSet("papaya");
		FruitSet ft9=new FruitSet("lemon");
		FruitSet ft10=new FruitSet("chery");
		Set<FruitSet>fs=new HashSet<FruitSet>();
		fs.add(ft1);
		fs.add(ft2);
		fs.add(ft3);
		fs.add(ft4);
		fs.add(ft5);
		fs.add(ft6);
		fs.add(ft7);
		fs.add(ft8);
		fs.add(ft9);
		fs.add(ft10);
		System.out.println(fs.size()+" fruit names are");
		for(FruitSet sf:fs)
		{
		System.out.println(sf.Fname);
		}
		fs.remove(ft2);
		System.out.println("size is" +fs.size());
		System.out.println("after remove names are ");
		for(FruitSet sf:fs)
		{
		System.out.println(sf.Fname);
		}
		System.out.println("_______________________________________________________");
		boolean found=false;
			for(FruitSet sf:fs)
			{
				if(sf.getFname().equalsIgnoreCase("apple"))
				{
					System.out.println(sf.getFname());
					found=true;
					System.out.println("containt");
				}
			}
				if(found=false) {
				System.out.println("not contains");
			}
		
		}
	}


