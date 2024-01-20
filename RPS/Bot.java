abstract public class Bot {
    String[] rps = {"rock", "paper", "scissors"};

    void update(String choice, int result) {}

    // Must override choice() to return either rps[0,1,2] or "rock", "paper", "scissors".
    abstract String choice();
}
