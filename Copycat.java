public class Copycat extends Bot {
    String choice = "";

    @Override
    void update(String choice, int result) {
        this.choice = choice;
    }

    @Override
    String choice() {
        if (this.choice.isEmpty()) {
            return "scissors";
        } else {
            return this.choice;
        }
    }
}
