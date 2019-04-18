package quickHit;

public class Levels {
	
	public final static Level[] levels = new Level[6];
	
	static {
		
		levels[0]= new Level(1,5,60,5);
		levels[1]= new Level(2,6,55,10);
		levels[2]= new Level(3,7,50,20);
		levels[3]= new Level(4,8,45,30);
		levels[4]= new Level(5,9,40,40);
		levels[5]= new Level(6,10,35,50);
		
	}

}
