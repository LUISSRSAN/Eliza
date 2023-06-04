
/*
 * Name:luis santiago 
 * description:Project Eliza
 * date created:may 05
 * date modified:may 11 
 * email:luis.santiago2@lc.cuny.edu
 * video link : https://youtu.be/cNlaYghTGa0
 */



public class PromptBank {

	String [] questions;
	String [] statements;
	String first;
	String last;
	
	public PromptBank(){
		questions = new String[5];
		//initialize your array to the correct length to match your number of questions you populate it with
		//statements = //initialize your array to the correct length to match your number of questions you populate it with
		first = "BLANK1";
		last = "BLANK2";
	}

	public void populateStatementsArray(){
		questions[0] = "Tell me more about "+ first + " and " +last;
		questions[1] = first + " seems important to you, so does "+ last+". Please tell me more.";
		questions[2] = first + " and "+ last + " seem to be on your mind. Let's talk about it.";
		questions[3] = "Why is it that about " + first + " is constantly reminding you of " + last;
		questions[4] = "Did you ever think that " + first + " and " + last + "could help.";

		/*complete this method with your other statements using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
		
		
			

	}
	
	
	public void setblanks(String newblank1,String newblank2) {
		this.first = newblank1;
		this.last = newblank2;
		
	}
	public void setQuestionBlanks (String newblank1,String newBlank2) {
		this.first = newblank1;
		this.last = newBlank2;
	}
	// testing setter 
	
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about "+ first +" and " + last+"?";
		questions[1] = "Does " +first+ " bother you? How about "+last + "?";
		questions[2] = "Are " +first +" and " + last +" things you think about often?";
		questions[3] = "It might be a good idea to focus on " + first +" now and " +last +" later";
		questions[4] = "When did " + first + " start effecting you with " + last;
		
		
		/*complete this method with your other questions using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
		
	}
	  
	public void getRandomStatementTrunk(){
	int max = 4;
		int min=0;
		int range = max -min +1;
		 int rand = (int) (Math.random() *range) + min;
		for (int i =0;i<11;++i) {
			 rand = (int) (Math.random() *range) + min;
			
		}
System.out.println(questions[rand]);
	}
		/*//fill in the method so it randomly selects the statement template
		//from the statements array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}
	*/
	
	public  void getRandomQuestionTrunk(){
	
		int max = 4;
		int min=0;
		int range = max -min +1;
		 int rand = (int) (Math.random() *range) + min;
		for (int i =0;i<10;++i) {
			 rand = (int) (Math.random() *range) + min;
			
		}
	System.out.println(questions[rand]);
		
		/*//fill in the method so it randomly selects the question template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	
	*/
	}
	
}