import java.util.Scanner;
/**
 * This class represents a basic AI that will chat with a human user.
 * it isn't very human like yet.
 * @author Dillon Shu
 * @version 0.1
**/

public class chatbot
{
	public static void main(String[] args)
	{
		System.out.println("Hi i'm chatbot, whats your name?");
		 
		Scanner keyboard = new Scanner(System.in);
		String userName = keyboard.nextLine();
		Scanner newKey = new Scanner(System.in);

		 
		System.out.println("Nice to meet you " + userName + ", how old are you?");
		int age = keyboard.nextInt(); //Leaves the pointer before the newline character
		keyboard.nextLine(); //gets the pointer to the beginning of the next line. Always do this after nextInt or nextDouble
		
		if (age > 40 && age <100)// && is and operator
		{
			System.out.println("Wowowowowowow, that's so old.");
			System.out.println("Only " + (100 - age) + " years until you're 100!");
		}
		else
		{
			System.out.println("How long until you turn " + (++age) + "?");
			int time = newKey.nextInt();
			System.out.println("Cool!");
		}
		String answer = "";
		while (!answer.equals("bye") && !answer.equals("Bye"))
		{
			System.out.println("Tell me one of your hobbies, or type either \"bye\" or \"Bye\" to exit");
			answer = keyboard.nextLine();
		}
	}
}