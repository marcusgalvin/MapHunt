package Oct8;

public class Hunt {
	
	
	
	public int [] calc() {
		
		int[] res = new int[2];
		
		int [] start = {2,4};
		int x = 2;
		int y = 4;
		
		
		int[][] instructions = {
				{0,2},
				{1,4},
				{0,3},
				{3,2}
		};
		
		for(int i = 0; i < instructions.length; i++) {
			switch(instructions[i][0]) {
			case 0:
				y -= instructions[i][1];
				break;
			case 1:
				x += instructions[i][1];
				break;
			case 2:
				y += instructions[i][1];
				break;
			case 3:
				x -= instructions[i][1];
				break;
		}
			res[0] = x;
			res[1] = y;
		}
		return res;
						
	}

}
