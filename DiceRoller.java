public class DiceRoller {

    public static void main(String[] args) {
        
		int diceNumber = Integer.parseInt(args[0]);
        int diceValue = Integer.parseInt(args[1]);
		
		DiceRoller diceRoller = new DiceRoller();

        diceRoller.roll(diceNumber, diceValue);
    }

    public void roll(int diceNumber, int diceValue) {
        
		if(diceNumber == 1){
			
			int result = ((int)(Math.random() * diceValue) + 1);
			
			//Output for single die roleld
			System.out.print("You rolled " + diceNumber);
			System.out.println("d" + diceValue);
			System.out.print("The result is: " + result);
		
		} else{
			
			int total = 0;
			String outputs = "";
			
			for(int i = 1; i <= diceNumber; i++){
				
				int result = ((int)(Math.random() * diceValue) + 1);
				
				total = total + result;
				outputs += result +  " ";
			}
				
			//Output for multiple dice rolled
			System.out.print("You rolled " + diceNumber);
			System.out.println("d" + diceValue);
			System.out.println("The result is: " + outputs);
			System.out.println("The total is: " + total);
		}	
	}
}