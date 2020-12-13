public class Circle {
    private MyPoint p1;
    private int r;

    public Circle(int x1, int y1, int radius) {
        this.p1 = new MyPoint(x1,y1);
        this.r = radius;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public float getSquare() {
        return (float) (Math.PI * r * r);
    }
}
