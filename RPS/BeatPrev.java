public class BeatPrev extends Bot{
    String oppChoice;

    @Override
    void update(String choice, int result) {
        this.oppChoice = choice;
    }

    @Override
    String choice() {
        if (oppChoice != null) {
            if (oppChoice == "rock"){
                return "paper";

            } else if (oppChoice == "paper"){
                return "scissors";

            } else {
                return "rock";
            }
            
        } else {
            return "scissors";
        }
    }
}

