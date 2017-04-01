public class Main {

    public static void main(String[] args) {
        Match match = new Match("Fenerbahçe","Galatasaray");
        User user = new User(match);
        match.setScore(1,0,23);
        match.setScore(1,1,25);
        match.setFirstHalfMatchResult(1,1);
        match.setScore(2,1,90);
        match.setMatchResult(2,1);
    }
}
