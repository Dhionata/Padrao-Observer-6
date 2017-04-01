import java.util.*;

public class Match implements Subject {
    private ArrayList<Observer> observers;
    private int homeScore;
    private int awayScore;
    private int time;
    public String homeName;
    public String awayName;
    private String event;

    public Match(String homeName, String awayName){
        this.homeName = homeName;
        this.awayName = awayName;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(homeScore, awayScore, time, event);
        }
    }

    public void statusChanged(){
        notifyObservers();
    }

    public void setScore(int homeScore, int awayScore, int time){
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.time = time;
        this.event = "goal";
        statusChanged();
    }

    public void setFirstHalfMatchResult(int homeScore, int awayScore){
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.event = "firstHalf";
        statusChanged();
    }

    public void setMatchResult(int homeScore, int awayScore){
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.event = "matchResult";
        statusChanged();
    }
}
