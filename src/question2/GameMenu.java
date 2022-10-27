package question2;

public class GameMenu {
	public void startGame() {
		System.out.println("Your Game Will Start");
	}
	
	public void displayGameInstruction() {
		System.out.println("Instructions:");
	}
	
	public void exitGame() {
		System.out.println("Game Over");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start The Game ");
		System.out.println("Display Game Instruction ");
		System.out.println("Exit The Game ");
		GameMenu demoObj=new GameMenu();

		int menuChoice=3;
		switch(menuChoice){
		case 1:
			demoObj.startGame();
			break;
		case 2:
			demoObj.displayGameInstruction();
			break;
		case 3:
			demoObj.exitGame();
			break;
		default:
			System.out.println("Wrong Choice");
			
		}
		

	}

}
