public class PongPaddle {
    private int x;
    private int y;
    private int width;
    private int height;
    public PongPaddle(int top, int left, int w, int h){
        x=left;
        y=top;
        width=w;
        height=h;
    }
    public int getBottomY(int b){
        b=(y-height-1);
        return b;
    }
    public int getTopY(){
        return y;
    }
    public int getLeftX(){
        return x;
    }
    public int getRightX(int r){
        r=(x+width-1);
        return x;
    }
}
