package quickHit;

public class Level {
	
	protected int Level;
	protected int strLength;
	protected int LimitedTime;
	protected int getScore;
	
	public Level(int level,int strLength,int LimitedTime,int getScore) {
		
		this.Level = level;
		this.strLength =strLength;
		this.LimitedTime = LimitedTime;
		this.getScore = getScore;
		
	}
	
}
