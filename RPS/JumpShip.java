public class JumpShip extends Bot {
    String oppChoice = "";
    int result = -1;
    String c = this.random();

    @Override
    void update(String choice, int result) {
        this.oppChoice = choice;
        this.result = result;
        if (result == 0) {
            c = this.random();
        } else if (result == 1) {
            switch (choice) {
                case "scissors":
                    c = "rock";
                    break;
                case "paper":
                    c = "scissors";
                    break;
                case "rock":
                    c = "paper";
                    break;
            }
        }
    }

    @Override
    String choice() {
        return c;
    }
}
