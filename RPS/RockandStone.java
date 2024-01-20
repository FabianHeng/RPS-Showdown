public class Rock extends Bot{
    String oldChoice;

    @Override
    void update(String choice, int result) {
        this.oldChoice = "rock";
    }

    @Override
    String choice() {
        if (oldChoice != null) {
            if (oldChoice == "rock"){
                this.oldChoice = "rock";
                return "rock";

            } else if (oldChoice == "paper"){
                this.oldChoice = "rock";
                return "rock";

            } else {
                this.oldChoice = "rock";
                return "rock";
            }
            
        } else {
            return "rock";
        }
    }
}

