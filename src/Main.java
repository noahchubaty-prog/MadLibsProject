import java.util.Scanner;

/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date:Friday Sept 18
 * Project Name: MadLibs
 * 
 * Project Description
 * You will read in multiple entries from the user and store the results in variables
 * You will then insert those variables into the following story to create a MadLib style result
 * 
 * A recent survey informs us that one out of every PLURALNOUN1 owns a/an ADJECTIVE1 phone. 
 * Fortunately, VERB_ING_1 over a mobile NOUN1 in recent years has improved ADVERB1. 
 * Today, BODY_PART1-held PLURALNOUN2 are all the rage. 
 * In restaurants, you find many PLURALNOUN3 talking ADVERB2 into their ADJECTIVE2 phones as they eat their NOUN2. 
 * NUMBER1 percent of American PLURALNOUN4 place their NOUN3 calls from their cars as they are VERB_ING_2 to and from their home, office, or NOUN4. 
 * Walking and talking are now the “in” NOUN5 to do. 
 * Over NUMBER2 percent of Americans walk our ADJECTIVE3 streets with a handheld PLURALNOUN5 pressed against their BODYPART2.
 * 
 * Ask for the capitalized words in the input. Print out the full story in the output.
 * See https://www.thewordfinder.com/wordlibs/story/41/ for an example.
 ********************************/

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// YOUR CODE GOES HERE!!!!
		System.out.println("Give me a plural noun:");
		String pluralNoun1 = in.nextLine();
		System.out.println("Give me a Noun");
		String noun1 = in.nextLine(); 
		System.out.println("Give me a verb");
		String verb1 = in.nextLine();
		System.out.println("Give me an adverb");
		String adverb1 = in.nextLine();
		System.out.println("Give me a Body Part");
		String bodypart1 =in.nextLine();
		System.out.println("Give me a plural noun");
		String pluralNoun2 = in.nextLine();
		System.out.println("Give me a plural Noun"); 
		String pluralNoun3 = in.nextLine();
		System.out.println("Give me an adverb");
		String adverb2 = in.nextLine();
		System.out.println("give me an Adjective");
		String Adjective1 = in.nextLine();
		System.out.println("Give me a noun");
		String noun2 = in.nextLine(); 
		System.out.println("Give me a number");
		String Number1 = in.nextLine();
		System.out.println("Give me a pulral noun");
		String pluralNoun4 = in.nextLine();
		System.out.println("Give me a noun");
		String noun3 = in.nextLine();
		System.out.println("Give me a verb");
		String verb2 = in.nextLine();
		System.out.println("Give me a Noun");
		String noun4 =in.nextLine();
		System.out.println("Give me a noun");
		String noun5 =in.nextLine();
		System.out.println("Give me a Number");
		String Number2 =in.nextLine();
		System.out.println("Give me an adjective");
		String Adjective2 =in.nextLine();
		System.out.println("Give me a plural noun");
		String pluralNoun5 =in.nextLine();
		System.out.println("Give me a body part");
		String bodypart2 =in.nextLine();
		
		
		System.out.println("A recent survey informs us that one out of every 3 "+pluralNoun1+" has a cell "+noun1+".");
		System.out.println("Fortunately, "+verb1+" over a mobile "+noun1+" has improved " +adverb1+".");
		System.out.println("Today, "+bodypart1+"-held "+pluralNoun2+" are all the rage");
		System.out.println("In restaurants, you find many "+pluralNoun3+" talking "+adverb2+" into their "+Adjective1+" phones as they eat their "+noun2+".");
		System.out.println(""+Number1+" percent of American "+pluralNoun4+" place their "+noun3+" calls from their cars as they are "+verb2+" to and from their home office or "+noun4+".");
		System.out.println("Walking and talking are now the in "+noun5+" to do.");
		System.out.println("Over "+Number2+" percent of Americans walk our "+Adjective2+" streets with a handheld "+pluralNoun5+" pressed agaist their "+bodypart2+".");
		in.close();//Don't forget to clean up after yourselves!
	}

}
