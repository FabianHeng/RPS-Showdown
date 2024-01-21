import java.util.Scanner;
public class Main {
    public static String bot1Name = "";
    public static String bot2Name = "";
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
        System.out.println("Round " + round + "> " + bot1Name + ": " + bot1Choice + " | " + bot2Name + ": " + bot2Choice);
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

    public static Bot botFactory(int num, int check) {
        switch (num) {
            case 1:
                if (check == 1) {
                    bot1Name = "Randy";
                } else if (check == 2) {
                    bot2Name = "Randy";
                }
                return new Randy();
            case 2:
                if (check == 1) {
                    bot1Name = "Steady";
                } else if (check == 2) {
                    bot2Name = "Steady";
                }
                return new Steady();
            case 3:
                if (check == 1) {
                    bot1Name = "Copycat";
                } else if (check == 2) {
                    bot2Name = "Copycat";
                }
                return new Copycat();
            case 4:
                if (check == 1) {
                    bot1Name = "RolyPoly";
                } else if (check == 2) {
                    bot2Name = "RolyPoly";
                }
                return new RolyPoly();
            case 5:
                if (check == 1) {
                    bot1Name = "BeatPrev";
                } else if (check == 2) {
                    bot2Name = "BeatPrev";
                }
                return new BeatPrev();
            case 6:
                if (check == 1) {
                    bot1Name = "Permute";
                } else if (check == 2) {
                    bot2Name = "Permute";
                }
                return new Permute();
            case 7:
                if (check == 1) {
                    bot1Name = "Human";
                } else if (check == 2) {
                    bot2Name = "Human";
                }
                return new Human();
            case 8:
                if (check == 1) {
                    bot1Name = "JumpShip";
                } else if (check == 2) {
                    bot2Name = "JumpShip";
                }
                return new JumpShip();
            case 9:
                if (check == 1) {
                    bot1Name = "OuttaBlue";
                } else if (check == 2) {
                    bot2Name = "OuttaBlue";
                }
                return new OuttaBlue();
            case 10:
                if (check == 1) {
                    bot1Name = "BeatSelf";
                } else if (check == 2) {
                    bot2Name = "BeatSelf";
                }
                return new BeatSelf();
            case 11:
                if (check == 1) {
                    bot1Name = "RockandStone";
                } else if (check == 2) {
                    bot2Name = "RockandStone";
                }
                return new RockandStone();
            case 12:
                if (check == 1) {
                    bot1Name = "StrikeThree";
                } else if (check == 2) {
                    bot2Name = "StrikeThree";
                }
                return new StrikeThree();
            default:
                if (check == 1) {
                    bot1Name = "Human";
                } else if (check == 2) {
                    bot2Name = "Human";
                }
                return new Human();
        }
    }

    public static void main(String[] args){
        
        int rounds = 100000; // Change rounds played here
        System.out.println("1. Randy\n2. Steady\n3. Copycat\n4. RolyPoly\n5. BeatPrev\n6. Permute\n7. Human\n8. JumpShip\n9. OuttaBlue\n10. BeatSelf\n11. RockandStone\n12. StrikeThree");
        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter the first and second bot numbers: ");
        Bot bot1 = botFactory(uInput.nextInt(), 1);
        Bot bot2 = botFactory(uInput.nextInt(), 2);

		for (int i = 0; i < rounds; i++) {
            rounds(bot1, bot2);
        }

        System.out.println(bot1Name + " won " + bot1Points + " rounds.");
        System.out.println(bot2Name + " won " + bot2Points + " rounds.");
        System.out.println("Draw: " + draw + " rounds.");
        System.out.println("Rounds played: " + (bot1Points + bot2Points + draw));
        System.out.println("Win Percentage: " + bot1Name + " (" + bot1Points/(rounds/100) + "%) | " + bot2Name + " (" + bot2Points/(rounds/100) + "%)");
	}
}
