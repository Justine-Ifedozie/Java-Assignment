import java.util.Scanner;
public class NokiaMenuCorrection { //Opening class braces
	public static void main (String[] args) { //Opening method braces
	          Scanner keyboardInput = new Scanner(System.in); 
//List of menu functions
	          String mEnu = """
		List of menu functions 

		Press: 
		1. Phone book
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert
		8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services
		""";
//1 Phone book list
	       String phoneBook = """
		Phone book

		Press: 
		1. Search
		2. Service Nos.
		3. Add name
		4. Erase
		5. Edit
		6. Assign tone
		7. Send b'card
		8. Option
		9. Speed dials
		10. Voice tags
		""";
//Number 8 under phonebook
	       String oPtions = """
		Options

		Press: 
		1. Type of view
		2. Memory status
			""";
//2 Messages list
	       String mEssages = """
		Messages

		Press: 
		1. Write messages
		2. Inbox
		3. Outbox
		4. Picture messages
		5. Templates
		6. Smileys
		7. Message settings
		8. Info service
		9. Voice mailbox number
		10. Service command editor
			""";
//Number 7 under messages
	String messagesSEttings = """
		Messsage settings

		Press: 
		1. Set 1
		2. Common 
			""";
//Set 1 under messages settings
	       String setOne = """
		Set 1

		Press: 
		1. Message centre number
		2. Messages sent as
		3. Message validity
			""";
//Common under messages settings
	       String coMmon = """
		Common

		Press: 
		1. Delivery reports
		2. Reply via same centre
		3. Character support
			""";
//4 Call register list
	       String callRegister = """
		Call Register

		Press: 
		1. Missed calls
		2. Received calls
		3. Dialled numbers
		4. Erase recent call lists
		5. Show call duration
		6. Show call cost
		7. Call cost settings
		8. Prepaid credit
			""";
// Show call duration under (Call register)
	       String showCallDuration = """
		Show call duration

		Press: 
		1. Last call duration
		2. All calls' duration
		3. Received calls' duration
		4. Dialled calls' duration
		5. Clear timers
			""";

// Show call cost under (Call register)
	       String showCallCost = """
		Show call costs

		Press: 
		1. Last call cost
		2. All calls' cost
		3. Clear counters
			""";
//Call cost settings under (Call register)
	       String callCostSettings = """
		Call cost settings

		Press: 
		1. Call cost limit
		2. Show costs in
			""";
//5 Tones list
	       String tOnes = """
		Tones

		Press: 
		1. Ringing tones
		2. Ringing volume
		3. Incoming call alert
		4. Composer
		5. Message alert tone
		6. Keypad tones
		7. Warning and game tones
		8. Vibrating alert
		9. Screen saver
			""";

//6 Settings
	       String sEttings = """
		Settings

		Press: 
		1. Call settings
		2. Phone settings
		3. Security settings
		4. Restore factory settings
			""";
//Call settings under (Settings)
	       String callSettings = """
		Call settings

		Press: 
		1. Automatic redial
		2. Speed dialling
		3. Call waiting options
		4. Own number sending
		5. Phone line in use
		6. Automatic answer
			""";
//Phone settings under (Settings)
	       String phoneSettings = """
		Phone settings

		Press: 
		1. Language
		2. Cell info display
		3. Welcome note
		4. Network selection
		5. Lights
		6. Confirm SIM service actions
			""";
//Security settings under (Settings)
	       String securitySettings = """
		Security settings

		Press: 
		1. PIN code request
		2. Call barring service
		3. Fixed dialling
		4. Closed user group
		5. Phone security
		6. Change access codes 
			""";
//11 Clock lists
	          int clock = 0;
	       String cLock = """
		Clock

		Press: 
		1. Alarm clock
		2. Clock settings
		3. Date setting
		4. Stopwatch
		5. Countdown timer
		6. Auto update of date and time
			""";

//Starting point after variables declaration

	          System.out.println(mEnu);
	          System.out.print("Press a number to make a selection: ");
	          int menu = keyboardInput.nextInt();

	          switch (menu) { //Menu switch opening braces
		case 1: { //Case one opening braces
			System.out.print(phoneBook);
			System.out.print("Press a number to make a selection: ");
			int phonebook = keyboardInput.nextInt();

				switch (phonebook) { //Switch phone opening braces
				         case 1: System.out.println("Search"); break;
				         case 2: System.out.println("Service Nos."); break;
				         case 3: System.out.println("Add name"); break;
				         case 4: System.out.println("Erase"); break;
				         case 5: System.out.println("Edit"); break;
				         case 6: System.out.println("Assign tone"); break;
				         case 7: System.out.println("Send b'card"); break;
				         case 8: { //Case eight opening braces
					System.out.println(oPtions);
					System.out.print("Press a number to make a selection: ");
					int options = keyboardInput.nextInt();

						switch (options) { //Switch options opening braces
						        case 1: { System.out.println("Type of view"); } break;
						        case 2: { System.out.println("Memory status"); } break;
						        default: break;
						         } //Switch options closing braces

					} //Case eight closing braces
				         case 9: { System.out.println("Speed dials"); } break;
				         case 10: { System.out.println("Voice tags"); } break;
				        default: break;
					} //Switch phone closing braces

			} //Case one closing braces

		case 2: { //Case two opening braces
			System.out.print(mEssages);
			System.out.print("Press a number to make a selection: ");
			int messages = keyboardInput.nextInt();

			         switch (messages) { //Switch  opening braces
			        	case 1: System.out.println("Write messages"); break;
			       	case 2: System.out.println("Inbox"); break;
			     	case 3: System.out.println("Outbox"); break;
			  	case 4: System.out.println("Picture messages"); break;
			  	case 5: System.out.println("Templates"); break;
			  	case 6: System.out.println("Smileys"); break;
			   	case 7: {//Case messagessettings opening braces
					System.out.print(messagesSEttings);
					System.out.print("Press a number to make a selection: ");
					int messagessettings = keyboardInput.nextInt();

				 		 switch (messagessettings) {//Switch messagessettings opening braces
							case 1: {//SetOne opening Case
								System.out.print(setOne);
								System.out.print("Press a number to make a selection: ");
								 int setone = keyboardInput.nextInt();

									switch (setone) { //Switch setone opening braces
										case 1: System.out.println("Message centre number"); break;
										case 2: System.out.println("Messages sent as"); break;
										case 3: System.out.println("Message validity"); break;
										default: break;
											} //SetOne switch closing Case
								} //SetOne closing Case
							case 2: {//Common opening Case
								System.out.print(coMmon);
								System.out.print("Press a number to make a selection: ");
								 int common = keyboardInput.nextInt();

									switch (common) { //Switch common opening braces
										case 1: System.out.println("Delivery reports"); break;
										case 2: System.out.println("Reply via same centre"); break;
										case 3: System.out.println("Character support"); break;
										default: break;
										} //Switch common closing braces 

								} //Common closing case close 
								} //Messagessettings closing Switch

					}//Case messagessettings closing braces

			      	case 8: System.out.println("Info service"); break;
			       	case 9: System.out.println("Voice mailbox number"); break;
			       	case 10: System.out.println("Service command editor"); break;
			        	default: break;
				} //Switch  closing braces
			} //Case two closing braces

		case 3: { //case three opening brace
		System.out.print("Chat"); break;
		} //Case three closing brace

		case 4: { //case four opening brace
			System.out.print(callRegister);
			System.out.print("Press a number to make a selection: ");
			int callregister = keyboardInput.nextInt();

			         switch (callregister) { //Switch  opening braces
			        	case 1: System.out.println("Missed calls"); break;
			       	case 2: System.out.println("Received calls"); break;
			     	case 3: System.out.println("Dialled numbers"); break;
			  	case 4: System.out.println("Erase recent calls list"); break;
			  	case 5: {//Show call duration opening Case
					System.out.print(showCallDuration);
					System.out.print("Press a number to make a selection: ");
					 int showcallduration = keyboardInput.nextInt();

						switch (showcallduration) { //Switch Show call duration opening braces
							case 1: System.out.println("Last call cost"); break;
							case 2: System.out.println("All calls' cost"); break;
							case 3: System.out.println("Received calls' duration"); break;
							case 4: System.out.println("Dialled calls' duration"); break;
							case 5: System.out.println("Clear timers"); break;
							default: break;
							} //Switch Show call duration closing braces 
					}//Show call duration closing braces

			      	case 6: { //case six opening brace
					System.out.print(showCallCost);
					System.out.print("Press a number to make a selection: ");
					int showcallcost = keyboardInput.nextInt(); 

						switch (showcallcost) { //Switch Show call cost opening braces
							case 1: System.out.println("Last call cost"); break;
							case 2: System.out.println("All calls' cost"); break;
							case 3: System.out.println("Clear counters"); break;
							default: break;
							} //Switch Show call cost closing braces 
					}//Show call cost closing braces

			       	case 7:  { //case seven opening brace
					System.out.print(callCostSettings);
					System.out.print("Press a number to make a selection: ");
					int callcostsettings = keyboardInput.nextInt(); 

						switch (callcostsettings) { //Switch call cost settings opening braces
							case 1: System.out.println("Call cost limit"); break;
							case 2: System.out.println("Show costs in"); break;
							default: break;
							} //Switch call cost settings closing braces 
					}//Call cost settings closing braces

			       	case 8: System.out.println("Prepaid credit"); break;
				default: break;
				} //Switch  closing braces
		} //Case four closing brace
		default: break;

		case 5: { //case five opening brace
			System.out.print(tOnes);
			System.out.print("Press a number to make a selection: ");
			int tones = keyboardInput.nextInt();

			         switch (tones) { //Switch  opening braces
			        	case 1: System.out.println("Ringing tone"); break;
			       	case 2: System.out.println("Ringing volume"); break;
			     	case 3: System.out.println("Incoming call alert"); break;
			  	case 4: System.out.println("Composer"); break;
			       	case 5: System.out.println("Message alert tone"); break;
			     	case 6: System.out.println("Keypad tones"); break;
			  	case 7: System.out.println("Warning and game tones"); break;
			       	case 8: System.out.println("Vibrating alert"); break;
			       	case 9: System.out.println("Screen saver"); break;
				default: break;
				} //Switch  closing braces
		} //Case five closing brace

		case 6: { //case six opening brace
			System.out.print(sEttings);
			System.out.print("Press a number to make a selection: ");
			int settings = keyboardInput.nextInt();

			         switch (settings) { //Switch  opening braces
			        	case 1: {//Call settings opening Case
					System.out.print(callSettings);
					System.out.print("Press a number to make a selection: ");
					 int callsettings = keyboardInput.nextInt();

						switch (callsettings) { //Switch Call settings opening braces
							case 1: System.out.println("Automatic redial"); break;
							case 2: System.out.println("Speed dialling"); break;
							case 3: System.out.println("Call waiting options"); break;
							case 4: System.out.println("Own number sending"); break;
							case 5: System.out.println("Phone line in use"); break;
							case 6: System.out.println("Automatic answer"); break;
							default: break;
							} //Switch call settings closing braces 
					}//Call settings closing Case

			       	case 2: {//Phone settings opening Case
					System.out.print(phoneSettings);
					System.out.print("Press a number to make a selection: ");
					 int phonesettings = keyboardInput.nextInt();

						switch (phonesettings) { //Switch phone settings opening braces
							case 1: System.out.println("Language"); break;
							case 2: System.out.println("Cell info display"); break;
							case 3: System.out.println("Welcome note"); break;
							case 4: System.out.println("Network selection"); break;
							case 5: System.out.println("Lights"); break;
							case 6: System.out.println("Confirm SIM service actions"); break;
							default: break;
							} //Switch phone settings closing braces 
					} //Phone settings closing Case

			     	case 3: {//Security settings opening Case
					System.out.print(securitySettings);
					System.out.print("Press a number to make a selection: ");
					 int securitysettings = keyboardInput.nextInt();

						switch (securitysettings) { //Switch security settings opening braces
							case 1: System.out.println("PIN code request"); break;
							case 2: System.out.println("Call barring service"); break;
							case 3: System.out.println("Fixed dialling"); break;
							case 4: System.out.println("Closed user group"); break;
							case 5: System.out.println("Phone security"); break;
							case 6: System.out.println("Change access codes"); break;
							default: break;
							} //Switch security settings closing braces 
					} //Security settings closing Case

			  	case 4: System.out.println("Restore factory settings"); break;
				default: break;
				} //Switch  closing braces
		} //Case six closing brace

		case 7: 




			} //Menu switch closing braces

		} //Closing method braces

} //Closing class braces




