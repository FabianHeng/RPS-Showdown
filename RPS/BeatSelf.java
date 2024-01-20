public class BeatSelf extends Bot{
    String oldChoice;

    @Override
    void update(String choice, int result) {
    
    }

    @Override
    String choice() {
        if (oldChoice != null) {
            if (oldChoice == "rock"){
                this.oldChoice = "paper";
                return "paper";

            } else if (oldChoice == "paper"){
                this.oldChoice = "scissors";
                return "scissors";

            } else {
                this.oldChoice = "rock";
                return "rock";
            }
            
        } else {
            return "rock";
        }
    }
}

