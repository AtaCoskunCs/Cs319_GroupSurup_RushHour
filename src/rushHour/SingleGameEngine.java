package rushHour;
import java.io.IOException; 
import java.util.*;

import javax.swing.JFrame;
public class SingleGameEngine extends GameEngine {
	
	Board board;
	int level;
	SingleGameScreen gameScreen;
	JFrame f;
	
	public SingleGameEngine(Board board,int level, Stack Q) throws IOException{
		this.board = board;
		this.level = level;
		gameScreen = new SingleGameScreen(this,Q);
	}
	
	//@Override 
	public boolean update(int iPressed,int jPressed, int iReleased, int jReleased) {
		return board.moveCar(iPressed,jPressed,iReleased,jReleased, true);
	}
	public int calculateScore(int time, int numOfMoves){
		return  100*(100 / (time * numOfMoves) )* 100;
	}
	
	

}