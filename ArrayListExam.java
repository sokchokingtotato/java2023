package s0814;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		ArrayList<String> list=new ArrayList<>();
		list.add("이승재");
		list.add("도토리묵");
		list.add("소순");
		list.add("깜깜");
		list.add("재릴라");
		list.add("겸따겸");
		System.out.println(list.toString());
		list.remove("유재석");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("---------------");
		
		for (String s: list) {
			System.out.println(s);
		}
		System.out.println("---------------");
		list.removeAll(list);
		System.out.println("지운 후 사이즈"+list.size());
		
		System.out.println("---------------");
		list.add("서울");
		list.add("서울");
		if(list.contains("서울")==true) {
			System.out.println("서울을 포함하고 있음");
		}
		
		
		
	}

}
