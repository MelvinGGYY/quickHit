package quickHit;
import java.util.Date;

public class Player {
	
	protected int Level;
	protected int Score;
	protected long startTime;
	protected int elapsedTime;
	
	public Player(Date startTime){
			
		this.Level = 1;
		this.Score = 0;
		this.startTime = startTime.getTime();
	}
	
	public int LevelUp() {
		this.Level+=1;
		return this.Level;
	}
	
	public int ScoreUp(int Score) {
		this.Score+=Score;
		return this.Score;
	}
	public int getElapsedTime(Date passTime) {
		this.elapsedTime = (int)(passTime.getTime() - startTime);
		return elapsedTime;
	}

}
