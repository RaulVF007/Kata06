package Kata06.model;

public class Block {
    public static int MAX = 7;
    private int x;
    private int y;

    public Block(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public void left(){
        if(x==1) return;
        x--;
    }

    public void right(){
        if(x==MAX) return;
        x++;
    }

    public void up(){
        if(y==MAX) return;
        y++;
    }
     
    public void down(){
        if(y==1) return;
        y--;
    }
}
