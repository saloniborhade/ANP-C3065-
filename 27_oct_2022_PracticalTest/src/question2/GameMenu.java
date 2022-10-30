package question2;
import java.util.Scanner;
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
	
		GameMenu demoObj=new GameMenu();
		for(;;) {
			Scanner scannerObj=new Scanner(System.in);
			System.out.println("Enter Your Choice:");
			int menuChoice=scannerObj.nextInt();
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
			System.out.println("Start The Game ");
			System.out.println("Display Game Instruction ");
			System.out.println("Exit The Game ");
		}
			
		

	}

}
