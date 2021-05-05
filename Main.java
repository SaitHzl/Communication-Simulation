
package question;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {

		Customer[] customers;
		Operator[] operators;

		int C, O, N;

		File inFile = new File(args[0]);  // args[0] is the input file
		File outFile = new File(args[1]);  // args[1] is the output file
		try {
			PrintStream outstream = new PrintStream(outFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		Scanner reader;
		try {
			reader = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find input file");
			return;
		}

		C = reader.nextInt();
		O = reader.nextInt();
		N = reader.nextInt();

		customers = new Customer[C];
		operators = new Operator[O];

		//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
		PrintStream outstream1;
		try {
			outstream1 = new PrintStream(outFile);
		}catch(FileNotFoundException e2) {
			e2.printStackTrace();
			return;
		}
		//just an empty line
		
		String emptyLine = reader.nextLine();
		
		//creating operators and customers
		
		int operatorIndex = 0;
		int customerIndex = 0;
		for(int lines = 0; lines < C+O ; lines++) {
			String line = reader.nextLine();
			String lineArray[];
			lineArray = line.split(" ");
			//creating operators
			if(Integer.valueOf(lineArray[0]) == 2) {
				operators[operatorIndex] = new Operator(operatorIndex, Double.valueOf(lineArray[1]), Double.valueOf(lineArray[2]), Double.valueOf(lineArray[3]), Integer.valueOf(lineArray[4]));
				operatorIndex = operatorIndex + 1;
			}
			//creating customers
			if(Integer.valueOf(lineArray[0]) == 1) {
				customers[customerIndex] = new Customer(customerIndex, lineArray[1], Integer.valueOf(lineArray[2]), operators[Integer.valueOf(lineArray[3])], Double.valueOf(lineArray[4]));
				customerIndex = customerIndex + 1;
			}
			
		}
		
		//actions that customers take
		
		for(int actionLines = 0; actionLines < N-(C+O);actionLines++) {
			String actionLine = reader.nextLine();
			String actionLineArray[];
			actionLineArray = actionLine.split(" ");
		
			if(Integer.valueOf(actionLineArray[0]) == 3) {
				customers[Integer.valueOf(actionLineArray[1])].talk(Integer.valueOf(actionLineArray[3]),customers[Integer.valueOf(actionLineArray[2])]);
				
			}
			if(Integer.valueOf(actionLineArray[0]) == 4) {
				customers[Integer.valueOf(actionLineArray[1])].message(Integer.valueOf(actionLineArray[3]), customers[Integer.valueOf(actionLineArray[2])]);
				
			}
			if(Integer.valueOf(actionLineArray[0]) == 5) {
				customers[Integer.valueOf(actionLineArray[1])].connection(Double.valueOf(actionLineArray[2]));
				
			}
			if(Integer.valueOf(actionLineArray[0]) == 6) {
				customers[Integer.valueOf(actionLineArray[1])].getBill().pay(Double.valueOf(actionLineArray[2]));
				
			}
			if(Integer.valueOf(actionLineArray[0]) == 7) {
				customers[Integer.valueOf(actionLineArray[1])].setOperator(operators[Integer.valueOf(actionLineArray[2])]);
				
			}
			if(Integer.valueOf(actionLineArray[0]) == 8) {
				customers[Integer.valueOf(actionLineArray[1])].getBill().changeTheLimit(Double.valueOf(actionLineArray[2]));
			}
			
			
		}
		
		//writing ouput
		//part 1
		for(int x = 0; x < O;x++) {
			outstream1.print("Operator" + " " + x + " " + ":" + " " + operators[x].operatorTalkingTime + " " + operators[x].operatornOfMessagesSent + " ");
			outstream1.printf("%.2f", operators[x].operatorInternetUsage);
			outstream1.println();
		}
		//part 2
		for(int y = 0; y < C; y++) {
			outstream1.print("Customer" + " " + y + " " + ":" + " ");
			outstream1.printf("%.2f", customers[y].getBill().totalMoneySpent);
			outstream1.print(" ");
			outstream1.printf("%.2f",customers[y].getBill().getCurrentDebt());
			outstream1.println();
			
		}
		//part 3
		int maxTalkMin = customers[0].talkingTime;
		int maxMessageQuantity = customers[0].nOfMessages;
		double maxInternetUsage = customers[0].connectionAmount;
		Customer maxTalk = new Customer(0, customers[0].name, 0, operators[0],0);
		Customer maxMessage = new Customer(0, customers[0].name, 0, operators[0],0);
		Customer maxInternet = new Customer(0,customers[0].name,0,operators[0],0);
		for(int talks = 1; talks < C; talks++) {
			if(customers[talks].talkingTime > maxTalkMin) {
				maxTalkMin = customers[talks].talkingTime;
				maxTalk.name= customers[talks].name;
			}
			if(customers[talks].nOfMessages > maxMessageQuantity) {
				maxMessageQuantity = customers[talks].nOfMessages;
				maxMessage.name = customers[talks].name;
			}
			if(customers[talks].connectionAmount > maxInternetUsage) {
				maxInternetUsage = customers[talks].connectionAmount;
				maxInternet.name = customers[talks].name;
			}
	
	
				
				
			
		}
		outstream1.print(maxTalk.name + " " + ":" + " " + maxTalkMin);
		outstream1.println();
		outstream1.print(maxMessage.name + " " + ":" + " " + maxMessageQuantity);
		outstream1.println();
		outstream1.print(maxInternet.name + " " + ":" + " ");
		outstream1.printf("%.2f", maxInternetUsage);
		
		//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	}
}

