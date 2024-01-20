public class Copycat extends Bot {
    String prev;

    @Override
    void update(String choice) {
        this.prev = prev;
    }

    @Override
    String choice() {
        if (prev != null) {
            return prev;
        } else {
            return "scissors";
        }
    }
}
