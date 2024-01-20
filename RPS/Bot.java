import java.util.Random;
abstract public class Bot {
    Random random = new Random();
    String[] rps = {"rock", "paper", "scissors"};

    void update(String choice, int result) {}

    String random() {
        return rps[random.nextInt(rps.length)];
    }
    
    String probableChoice(int r, int p, int s) {
        Random rand = new Random();
        int randomInt = rand.nextInt(100) + 1;
        if (randomInt < r+1) {
            return "rock";
        } else if (randomInt < r+p) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Must override choice() to return either rps[0,1,2] or "rock", "paper", "scissors".
    abstract String choice();
}
