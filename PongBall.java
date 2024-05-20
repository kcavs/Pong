public class PongBall {
    private int xVelocity;
    private int yVelocity;
    private int x;
    private int y;
    public PongBall(int initX, int initY, int initXVel, int initYVel){
        y=initY;
        x=initX;
        xVelocity=initXVel;
        yVelocity=initYVel;
    }
    public void bounceX(){
        xVelocity=(xVelocity*-1);
    }
    public void bounceY(){
        yVelocity=(yVelocity*-1);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void move(){
        x=(x+xVelocity);
        y=(y+yVelocity);
    }
}
