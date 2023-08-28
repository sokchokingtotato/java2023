package s0828;

import java.util.HashMap; 

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<>();
		map.put(20302, "구예성");
		map.put(20315, "엄재환");
		map.put(20316, "이승재");
		map.put(20318, "임필묵");

		System.out.println(map.toString());
		System.out.println(map.size());
		
		System.out.println(map.get(20302));
		map.put(20315,"김로봇");
		System.out.println(map.toString());
		
		for (Integer a : map.keySet()) {
			System.out.println(a);
			
		}
		
		for(String s:map.values()) {
			System.out.println(s);
		}
		for (Integer a : map.keySet()) {
			System.out.println("학번:"+a);
			System.out.println(" 이름"+map.get(a));
			
			
		}
		map.clear();
		System.out.println(map.toString());
		
		
		
	}

}
