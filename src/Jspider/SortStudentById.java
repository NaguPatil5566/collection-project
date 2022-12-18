package Jspider;

import java.util.Comparator;

public class SortStudentById implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.getId()-y.getId();
	}

}
