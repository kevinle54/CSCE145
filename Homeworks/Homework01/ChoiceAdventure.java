package Homeworks.Homework01;

/*
 * Written by Kevin Le
 */
import java.util.Scanner;
public class ChoiceAdventure {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		//segment Entrance

		System.out.println("Warning: This fictional game consist of disturbing and unpleasant actions and symbolisms. The text story requires the player to experience all endings to understand the story entirely as it is heavily based on symbolism, therefore certain components may be difficult to interpret.\nIf you wish to continue type \"I understand\" if not, type \"exit\".");
		String response = keyboard.nextLine();
		if(response.equalsIgnoreCase("I understand"))
		{		
			System.out.println("Voice: \"Wake up. Wake up. Can you hear me? I told you to wake up!\"\nRespond with: \"Wake up\" or \"don't\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("exit"))
		{
			System.out.println("Leaving...");
			System.exit(0);
		}
	

		
		
		//segment 1 (Phrase One)
	
		if(response.equalsIgnoreCase("Wake up"))
		{
			System.out.println("Voice: \"Took you long enough. Now fix yourself up you pathetic trash.\"\nRespond with: \"Alright\", \"shut up\", or \"ignore\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("don't"))
		{
			System.out.println("Voice: \"Worthless scum! Are you ignoring me?\"\nRespond with: \"Continue\" or \"speak\".");
			response = keyboard.nextLine();
		}
		
		
		//segment 2 (Phrase One.2)
		if(response.equalsIgnoreCase("Alright"))
		{
			System.out.println("Voice: \"Well, good to see you so obedient.\"\nYou sit on the edge of your bed, listening to every insult the voice told you. You wonder if all of those insults are actually true? Respond with: \"Agree\" or \"disagree\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("Shut up"))
		{
			System.out.println("Voice:\"What did you said? I am the one keeping you in check; the one making sure you're a stable human being.\"\n\"Stable human being\" echoes in your mind, your father used to said that to you all the time. You can't help tearing up.\nRespond with: \"Reminisce\" or \"not\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("ignore"))
		{
			System.out.println("You choose to stay silent... your head begins to hurt.\nRespond with: \"Reach\" or \"lay down\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("continue"))
		{
			System.out.println("You continue to sleep.\nVoice: \"Attempting to fall asleep again won't do you good, you'll be awake for countless of hours.\"\nYou knew the voice was right, yet you continue to try.\nVoice: Because that all you can do, try. Try to please others, and where did that get you? Here. What a pity.\"\nRespond with: \"Reach\" or \"restroom\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("speak"))
		{
			System.out.println("You: \"Not particularly.\"\nVoice: \"What's the point in acting asleep?\"\nYou decided to wake up, turning towards your desk.\nVoice: \"A portrait of you and your family, why did you even keep this photo.\"\nRespond with \"Reminisce\".");
			response = keyboard.nextLine();
		}
		

		//segment 3 (Phrase One.3)
		if(response.equalsIgnoreCase("Reminisce"))
		{
			System.out.println("The voice fades as you reminisce about your parents. Your stern, unsympathetic father and your supportive mother...\nVoice: \"You could never please your father; frighten by your own shadow and your father's, you ran away.\"\nYou begin to scratch your forearm, silently weeping.\nYou:\"Mother...\"\nRespond with: \"Recall\" or \"Hold in\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("not"))
		{
			System.out.println("You don't want to think about your father.\nVoice: \"Look at you, you're avoiding your father again!\"\nYou continue to scratch your arm, this time deeper. Your breath goes uneasy...\nVoice: \"Well would you look at that, the beaten puppy is bleeding again.\nThe pain is numb, you begin to faintly remember...\nVoice: \"Remember him... what he did to you... you'll feel much better afterwards.\nRespond with: \"Father\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("reach"))
		{
			System.out.println("You reach for your medication only to be stopped by the voice.\nVoice: \"What are you doing? Listen to what you are saying!\nRespond with: \"Blue\" or \"question\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("lay down"))
		{
			System.out.println("You lay down on the bed, your head grows in pain.\nVoice: \"You're straining yourself. Come on, speak to me.\"\nYou: \"What do you want?\"\nVoice: \"Just someone to speak to, though you already knew that.\"\nRespond with: \"Question\" or \fault\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("agree"))
		{
			System.out.println("You agree with the voice; you deserve those insults afterall.\nVoice: \"Why don't you take your medication now? I recommend the white one.\nRespond with \"take\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("disagree"))
		{
			System.out.println("Voice: \"A little rebellious are we. You can't turn to a stray dog now, afterall you did accepted those insults before. That includes your father's abuse.\"\nYour father being mention raises an overwhelming anxious feeling that you can't shake off.\nRespond with: \"Father\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("restroom"))
		{
			System.out.println("You decided to freshen up. Greet by the mirror, you see a black figure with a scratch out face crying what seems to be centipedes.\nVoice: \"Centipedes, what a complicated creature. There really remind me of you.\"\nYou wash your face, as you try to grab a towel, the voice begins to speak again.\nRespond with: \"Listen\".");
			response = keyboard.nextLine();
		}
		
		
		//segment 4 (Phrase.One.4)
		if(response.equalsIgnoreCase("hold in"))
		{
			System.out.println("You attempt to hold back your tears, however, they flowing like a raging river.\nVoice: \" There, there. No need to ball your eyes out, take your medication... everything will be better.\"\nRespond with: \"Red\", \"blue\", or \"white\".");
			response = keyboard.nextLine();
		}
		
		if(response.equalsIgnoreCase("recall"))
		{
			System.out.println("You attempt to recall your mother more... you were holding her hand, how soft and gentle they were, walking along her favorite park. You continue walking until you reach the exit. There was a gate, you turn to your left only to find yourself holding your father's hand.\nFather: \" If only you were not born...\"\nYou look forward, stream of tears roll down your face as you stare at your mother's gravestone passed all the mourners.\nRespond with: \"Forget\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("Father"))
		{
			System.out.println("You recall your father... his fist covered in blood and you, weeping, as you sitting in front of him.\nFather: \"You're worthless! Why can't you be fucking normal! All you ever talk to is your imaginary goddamn voice! There's other human beings who are actually real!\"\nYou: \"Why couldn't he understand me... I know I was a mistake.\nVoice: \"It's because you are a mistake, no one can understand the voice of a broken tool nor does anyone wants to help them repair themselves. You. Are. To. Fragile. Like your mother...\"Respond with: \"Quit\"");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("question"))
		{
			System.out.println("You question the voice's choices of words\nVoice: \"What do you mean? I thought it was obvious. Here's a hint: who am I?\"Respond with: \"Voice\".");
			response = keyboard.nextLine();
		}
		else if(response.equalsIgnoreCase("listen"))
		{
			System.out.println("Voice: \"You see, centipedes are known for their vemon. Because of this, they were included in the Gu tradition. Seal away in a jar filled with others poisonous insects, only to be reopen after all but one insect lives.\"\nYou remember the Chinese legend, and the purpose why you were specifically referred to a centipede.\nVoice: \"Digusting, fast crawlers bloated with poison who are even willing to prey on their own species. Similar to a particular person I know.\"\nRespond: \"Lash out\"");
			response = keyboard.nextLine();
		}
		
		//segment 3 (Phrase One.end)
		if(response.equalsIgnoreCase("forget"))
		{
			System.out.println("You reach for your hidden medication in the drawer, open the bottle, and down all the pills. You cough splitting out a few pills only for you to shovel them back into your throat. Your throat stings as engulf an entire bottle of water.\nVoice: \"Look at you, you're a mess. What a real shit you are. Just like your mother...\"\nEverything fades black as you fall to the floor, the cold yet soothing floor.\n5 hours later\nLocal News: \"A man was found unconscious in his apartment. Investigators had found a bottle of morphine next to his body...\"\nEnding: Forgotten");
		}
		else if(response.equalsIgnoreCase("red"))
		{
			System.out.println("You took a few red pills, after a couple of hours you feel more at ease and prepare for another day. You noticed that the voice is gone... for now at least.\nEnding: Another Day");
		}
		else if(response.equalsIgnoreCase("blue"))
		{
			System.out.println("You quickly took a couple of blue-colored medication. After a couple of minutes, you gradually fall back to sleep.\nVoice: \"Why do you always run away...\"\nEnding: Sleepless Nights");
		}
		else if(response.equalsIgnoreCase("white")) 
		{
			System.out.println("You took a single white pill, picked up a switch blade next to the bottle, and continue weeping in the corner of your room. The voice continue to insult you, they sound familiar to you.\n\"It's that kid again.\"\n\"Why is he still here?\"\n\"That piece of crap still doesn't realize he's a freak.\"\n\"God, why don't people lock him in a mental institution already.\nYou realized it all the insults hurdle at you by others, by everyone. You sink the blade into your cut-covered arm, the pain is excruciating, however, soothing. The insults fades as you repeatly tear through your own flesh, afterall you're use to physcial pain more.\nEnding: Sanity");
		}
		else if(response.equalsIgnoreCase("Quit"))
		{
			System.out.println("The voice's words resonate with you... he was right, you thought quietly. You stand up and walk towards your closet. You open the door and stare at the noose.\nVoice: Everything will be for the better, another mistake is gone from this world!\"\nYou continue with a resolve unbreakable...\n:Voice:\"How ironic...\"\n5 hours later\n???: Ring ring \"Hello...I understand\" Throws his phone at the picture on the wall, it was shattered. He collapse to the floor and begins sobbing.\nEnding: Like Mother Like Son");
		}
		else if(response.equalsIgnoreCase("voice"))
		{
			System.out.println("Voice: \"Yes, I am a voice, but whose? The answer is yours.\"\nYou realized that the voice was your own thoughts, the ones you locked up so you don't have to hear them anymore. They were your true feelings relating to how you feel about yourself; all the doubts, hopelessness, and anxiety. You hid them from others, isolating yourself...\nVoice: \"because you were afraid, scared of others treating you like the broken puppet you are\"\nYou agreed that you were scared, you begin to accept these thoughts.\nEnding: Acceptance");
		}
		else if(response.equalsIgnoreCase("fault"))
		{
			System.out.println("You: \"It's all your fault.\nVoice: \"Me?\"\nYou: Yes, all your fucking fault! Because of you, am some insane freak! Because of you my father is disgusted by me! Because of you...\'tears stream down your face\' my mother is dead...\"\nYou begin to sob, throw objects in your apartment, and curse at yourself.\nEnding: Denial");
		}
		else if(response.equalsIgnoreCase("lash out"))
		{
			System.out.println("You lashed out at the criticism made by the voice, throwing materials through the restroom.\nVoice: \"If only you were not born, your mother would still be alive.\"\nYou banged your head against the wall repeatly trying to silence the voice.\nVoice: \"You were a poison to your mother! After you killed her, you ran away!\"You remember your mother's condition, it was cause by your birth... you wish you could have trade places with her.\nEnding: The Truth");
		}
		else if(response.equalsIgnoreCase("take"))
		{
			System.out.println("Answer the question: 4 + 5 =?");
		}
			int n1 = 4;
			int n2 = 5;
			int result = n1 + n2;
			int answer = keyboard.nextInt();
			//Self note: convert strings to an integer then a comparison can be made.
			if(answer == result)
			{
				System.out.println("You take 9 pills. Memories of all past comes back to you steady. How happy you were as a child, living with your loving father and mother. Hanging out with your group of friends and enjoy spending the time you had at school...\nthe wailing of the siren intensifies\nWorker:\"He's just unconscious, though we should continue to regulate his breathing.\"\nSecond worker:\"He's going to need a gastric lavage. He overdosed.\"\nWorker: \"Why do we have to waste our time with him, there others who cares more about their lives.\nThird worker: \"Just shut up, we're going to transport him soon\"\nEnding: False Dream");
			}
			//Self note: user's answer less than 9 or greater than 9
			if(answer > 9 || answer < 9)
			{
				System.out.println("You though about taking that amount pills, however decided to listen to the voice.\nYou take 9 pills. Memories of all past comes back to you steady. How happy you were as a child, living with your loving father and mother. Hanging out with your group of friends and enjoy spending the time you had at school...\nthe wailing of the siren intensifies\nWorker:\"He's just unconscious, though we should continue to regulate his breathing.\"\nSecond worker:\"He's going to need a gastric lavage. He overdosed.\"\nWorker: \"Why do we have to waste our time with him, there others who cares more about their lives.\"\nThird worker: \"Just shut up, we're going to transport him soon\"\nEnding: False Dream");
			}
	}

}
