package s0828;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class LottoHashSet {

	public void getRandomBalle() {
		// TODO Auto-generated method stub
		HashSet<Integer> lotto=new HashSet<>();
		while(lotto.size()<6) {
			Random r=new Random();
			Integer num=r.nextInt(45)+1;
			
			lotto.add(num);
			
		}
		Collections.sort(lotto);
		System.out.println(lotto.toString());
	}

}
