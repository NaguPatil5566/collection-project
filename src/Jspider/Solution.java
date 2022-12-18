package Jspider;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections; 
public class Solution 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(20,"jhon",47);
		Student s2=new Student(40,"avi",52);
		Student s3=new Student(50,"jeeva",98);
		Student s4=new Student(30,"abhi",12);
		Student s5=new Student(10,"mahi",35);
		
		
		Map<Integer, Student> map=new LinkedHashMap<Integer, Student>();
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		map.put(s5.getId(), s5);
		
		//convert Map into a set of keys
		Set<Integer> keys=map.keySet();//20 40 50 30 10
		
		System.out.println("Enter persent inside Map");
		for(int key:keys) {
			System.out.println(map.get(key));//printing s1 s2  s3 s4 s5
			
		}
		System.out.println("--------");
			
			//add the values from the Map into ArrayLsit
		List<Student> l=new ArrayList<Student>();
		for(int key:keys) {
		Student obj=map.get(key);
		l.add(obj);
		
		}
		System.out.println("objects peresent in List");
		for(Student s:l) {
			System.out.println(s);
		}
	
	Scanner scan=new Scanner(System.in);
	while(true)
	{
		System.out.println("1:Sort By Id\n2:Sort By Name\n3.Sort By Marks");
		System.out.println("Enetr choice");
		int choice=scan.nextInt();
	
		switch(choice) {
		case 1:
			Collections.sort(l,new SortStudentById());
			for(Student s:l)
			{
				System.out.println(s);
			}
		
			break;
			
		case 2:
			Collections.sort(l,new SortStudentByName());
			for(Student s:l)
			{
				System.out.println(s);
			}
			break;
			
		case 3:
			Collections.sort(l,new SortStudentbyMarks());
			for(Student s:l)
			{
				System.out.println(s);
			}
			break;
			
			default:
				System.out.println("Thank you");
		}
	}
	}
}
