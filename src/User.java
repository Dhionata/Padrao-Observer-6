
public class User implements Observer {
    private Match match;
    private int homeScore;
    private int awayScore;
    private int time;
    private String event;

    public User(Match match){
       this.match = match;
       match.registerObserver(this);
    }

    @Override
    public void update(int homeScore, int awayScore, int time, String event) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.time = time;
        this.event = event;
        display();
    }

    public void display(){
        if(event == "goal"){
            System.out.println("Goal! " + "Minute: " + time + "'");
        }
        else if(event == "firstHalf"){
            System.out.println("First Half Result");
        }
        else if(event == "matchResult"){
            if(homeScore > awayScore) System.out.println(match.homeName + " win!");
            else if (homeScore < awayScore) System.out.println(match.awayName + " win!");
            else System.out.println("The Match Ended in a Draw.");
            System.out.println("Match Result");
        }
        System.out.println(match.homeName + " " + homeScore + " - " + awayScore + " " + match.awayName);
        System.out.println("");
    }
}
