public class Main {
    public static Bot bot1 = new StrikeThree();
    public static Bot bot2 = new Randy();
    public static int draw = 0;
    public static int bot1Points = 0;
    public static int bot2Points = 0;
    public static int result = -1;
    public static int round = 1;

    // Each round is played, and 1 point is added for each round that the particular bot wins.
    // The opponent's choice and result [draw (0), lose (1), win (2)] is updated. 
    public static void rounds(Bot bot1, Bot bot2) {
        String bot1Choice = bot1.choice();
        String bot2Choice = bot2.choice();
        System.out.println("round " + round + " bot1: " + bot1Choice + " | bot2: " + bot2Choice);
        if (bot1Choice == bot2Choice) {
            draw++;
            result = 0;
        } else if (bot1Choice == "scissors" && bot2Choice == "rock") {
            bot2Points++;
            result = 2;
        } else if (bot1Choice == "scissors" && bot2Choice == "paper") {
            bot1Points++;
            result = 1;
        } else if (bot1Choice == "paper" && bot2Choice == "scissors") {
            bot2Points++;
            result = 2;
        } else if (bot1Choice == "paper" && bot2Choice == "rock") {
            bot1Points++;
            result = 1;
        } else if (bot1Choice == "rock" && bot2Choice == "paper") {
            bot2Points++;
            result = 2;
        } else if (bot1Choice == "rock" && bot2Choice == "scissors") {
            bot1Points++;
            result = 1;
        }

        if (result == 1) {
            bot1.update(bot2Choice, 2);
            bot2.update(bot1Choice, 1);
        } else if (result == 2) {
            bot1.update(bot2Choice, 1);
            bot2.update(bot1Choice, 2);
        } else {
            bot1.update(bot2Choice, 0);
            bot2.update(bot1Choice, 0);
        }   

        round++;
    }

    public static void main(String[] args){
        
        int rounds = 100000; // Change rounds played here

		for (int i = 0; i < rounds; i++) {
            rounds(bot1, bot2);
        }
        System.out.println("Bot 1 won " + bot1Points + " rounds.");
        System.out.println("Bot 2 won " + bot2Points + " rounds.");
        System.out.println("Draw: " + draw + " rounds.");
        System.out.println("Rounds played: " + (bot1Points + bot2Points + draw));
        System.out.println("Win Percentage: Bot 1 (" + bot1Points/(rounds/100) + "%)");
        System.out.println("Win Percentage: Bot 2 (" + bot2Points/(rounds/100) + "%)");
	}
}
