public class Main {
    public static Bot bot1 = new Randy();
    public static Bot bot2 = new BeatPrev();
    public static int draw = 0;
    public static int bot1Points = 0;
    public static int bot2Points = 0;
    public static int result = -1;

    // Each round is played, and 1 point is added for each round that the particular bot wins.
    // The opponent's choice and result draw (0), bot 1 win (1), bot 2 win (2) is updated. 
    public static void rounds(Bot bot1, Bot bot2) {
        String bot1Choice = bot1.choice();
        String bot2Choice = bot2.choice();
        if (bot1Choice == "scissors") {
            switch (bot2Choice) {
                case "rock":
                    bot2Points++;
                    result = 2;
                    break;
                case "paper":
                    bot1Points++;
                    result = 1;
                    break;
                case "scissors":
                    draw++;
                    result = 0;
                    break;
            }
        } else if (bot1Choice == "paper") {
            switch (bot2Choice) {
                case "scissors":
                    bot2Points++;
                    result = 2;
                    break;
                case "rock":
                    bot1Points++;
                    result = 1;
                    break;
                case "paper":
                    draw++;
                    result = 0;
                    break;
            }
        } else if (bot1Choice == "rock") {
            switch (bot2Choice) {
                case "paper":
                    bot2Points++;
                    result = 2;
                    break;
                case "scissors":
                    bot1Points++;
                    result = 1;
                    break;
                case "rock":
                    draw++;
                    result = 0;
                    break;
            }
        }
        bot1.update(bot2Choice, result);
        bot2.update(bot1Choice, result);
    }

    public static void main(String[] args){
        
        int rounds = 1000000; //Change rounds played here

		for (int i = 0; i < rounds; i++) {
            rounds(bot1, bot2);
            // System.out.println("round " + i + " bot1: " + bot1.choice() + " | bot2: " + bot2.choice());
        }
        System.out.println("Bot 1 won " + bot1Points + " rounds.");
        System.out.println("Bot 2 won " + bot2Points + " rounds.");
        System.out.println("Draw: " + draw + " rounds.");
        System.out.println("Rounds played: " + (bot1Points+bot2Points+draw));
        System.out.println(bot2Points/(rounds/100) + "%");
	}
}
