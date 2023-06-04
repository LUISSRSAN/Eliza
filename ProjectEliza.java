
/*
 * Name:luis santiago 
 * description:Project Eliza
 * date created:may 05
 * date modified:may 11 
 * email:luis.santiago2@lc.cuny.edu
 * video link : https://youtu.be/cNlaYghTGa0
 */
import java.util.Scanner;

public class ProjectEliza {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		String input = "";
	
		System.out.println("Hello, my name is Eliza .What is your name?");
	
		String name = scan.nextLine();
		System.out.println("Hello,"+ name);
		System.out.println("Tell me what is on your mind today in 1 sentence");
		String sentence = "";
		sentence = scan.nextLine();
	
	while (!sentence.equals( "EXIT")) {
		
	
		
		
		int firstSpace = sentence.indexOf(" ");
		String firstWord = sentence.substring(0,firstSpace);
		String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1,sentence.length());
		

	char lastchar =sentence.charAt(sentence.length()-1);
	
	PromptBank questionBank = new PromptBank();
	

	if (lastchar =='?'){
	
	    questionBank.setQuestionBlanks(firstWord,lastWord);
		questionBank.populateQuestionsArray();
		questionBank.getRandomQuestionTrunk();
		
	}
	
	else if (lastchar =='!') {
	
		System.out.print("WOW! Dramatic ");
		questionBank.setblanks(firstWord,lastWord);
		questionBank.populateStatementsArray();
		questionBank.getRandomStatementTrunk();
				
		
	}
	else if (lastchar =='.') {
		questionBank.setblanks(firstWord,lastWord);
		questionBank.populateStatementsArray();
		questionBank.getRandomStatementTrunk();
	}
	else {
questionBank.setblanks(firstWord,lastWord);
questionBank.populateStatementsArray();
questionBank.getRandomStatementTrunk();
	}
	sentence = scan.nextLine();
	if (sentence.equals("EXIT")) {
		System.out.println("Do you want to run the session again?");
		 input = scan.nextLine();
		if (input.equals("Yes") || input.equals("YES")|| input.equals("yes")) {
			System.out.println("Hello, my name is Eliza .What is your name?");
			name = scan.nextLine();
			System.out.println("Hello,"+ name);
			System.out.println("Tell me what is on your mind today in 1 sentence");
			sentence = scan.nextLine();
		continue;
		}
		else {
			
			break;
		}
	}
	
	}
		
	System.out.println("Goodbye, until next time ");


	}
	}

