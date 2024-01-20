import java.util.Random;
abstract public class Bot {
    Random random = new Random();
    String[] rps = {"rock", "paper", "scissors"};

    void update(String choice, int result) {}
    String random() {
        return rps[random.nextInt(rps.length)];
    }

    // Must override choice() to return either rps[0,1,2] or "rock", "paper", "scissors".
    abstract String choice();
}
