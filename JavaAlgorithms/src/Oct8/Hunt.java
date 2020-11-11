package Oct8;

import java.util.Arrays;

public class Hunt {
	
	
	
	public int [] calc() {
		
		int[] res = new int[2];
		int x = 10;
		
		int [] start = {2,4};
		int x = 2;
		int y = 4;
		
		
		int[][] instructions = {
				{0,2},
				{1,4},
				{0,3},
				{3,2}
		};
		
		int[][] traps = {
				{0,5},
				{1,4}
		};
		
		//N = 0;
		//S = 1;
		//E = 2;
		//W = 3;
		for(int[] instruction : instructions) {
			
			switch(instruction[0]) {
			case 0:
				y -= instruction[1];
				break;
			case 1:
				x += instruction[1];
				break;
			case 2:
				y += instruction[1];
				break;
			case 3:
				x -= instruction[1];
				break;
			}
			res[0] = x;
			res[1] = y;
		}
//		System.out.println(res);
		System.out.println(Arrays.toString(res));
		return res;
						
	}

}
