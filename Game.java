package quickHit;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class Game {
	
	Player player;
	Date startTime;
	StringBuffer buffer;
	Random random;
	Scanner in;
	Game game;
	
	public void printStr() {
		
		startTime = new Date();
		player = new Player(startTime);
		buffer = new StringBuffer();
		random = new Random();
		in = new Scanner(System.in);
		game = new Game();
		
		
		while(true) {
		
		int curLimitedT = Levels.levels[player.Level-1].LimitedTime;		
		int strL = Levels.levels[player.Level-1].Level;
		int score = Levels.levels[player.Level-1].getScore;
		
		for(int i=0;i<strL;i++) {
			
			int rand = random.nextInt(strL);
			
			switch(rand){
			
			case 0:
				buffer.append("A");
				break;
			case 1:
				buffer.append("B");
				break;
			case 2:
				buffer.append("C");
				break;
			case 3:
				buffer.append("D");
				break;
			case 4:
				buffer.append("E");
				break;
			case 5:
				buffer.append("F");
				break;
			default:
				buffer.append("0");
				break;	
			}
		}
		String bStr = buffer+"";
		System.out.println(bStr);
		
		System.out.println("Please input the word you see:");
		String input = in.next();
		
		Date PassTime = new Date();
		int Et = player.getElapsedTime(PassTime)/1000;
		System.out.println(Et+" / "+curLimitedT);
		
		if(Et<=curLimitedT && game.compareStr(input, bStr)) {
			if(player.Level==6) {
				System.out.println("Congratulation on customs clearance!");
				System.out.println("Finally Level:"+player.Level+",Finally Score"+player.Score);
				System.exit(0);
				
			}else {
			player.LevelUp();
			player.ScoreUp(score);
			System.out.println("Bravo! Level up!");
			System.out.println("You Info:"+"Level"+player.Level+",Score"+player.Score);
			System.out.println("Prepare next pass!");
			}
			
		}else {
			

			System.out.println("Death!");
			System.out.println("Finally Level:"+player.Level+",Finally Score:"+player.Score);
			System.exit(0);
		}
		
			
		}
		
	}
	
	public boolean compareStr(String in,String out) {
		
		return out.equals(in) ? true : false;
		
	}
	

}
