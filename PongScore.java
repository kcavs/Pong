public class PongScore {
    int score;
    public PongScore(){
        score=0;
    }
    public int getScore(){
      return score;  
    }
    public void scorePoints(int points){
        score=(score+points);
    }
}
