package data_structures;

public class RockPaperScissors {
	
	public enum HandSign {
		ROCK, PAPER, SCISSORS
	}

	public static void main(String[] args) {
		HandSign player1Move; //Declare variables of the enum type HandSign player1Move
		player1Move = HandSign.SCISSORS; //Assign values into enum variables
		System.out.println(player1Move);
		HandSign player2Move = HandSign.PAPER;
		System.out.println(player2Move);

	}

}
