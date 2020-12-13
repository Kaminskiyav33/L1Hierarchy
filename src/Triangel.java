public class Triangel extends Circle {
    private MyPoint p2,p3;

    public Triangel(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, 0);
        this.p2 = new MyPoint(x2,y2);
        this.p3 = new MyPoint(x3,y3);
    }

    @Override
    public float getSquare() {
        return (float) (0.5 * Math.abs(
                        (p2.getX() - super.getP1().getX())* (p3.getY() - super.getP1().getY()) -
                                (p3.getX() - super.getP1().getX()) * (p2.getY() - super.getP1().getY())
                        ));
    }
}
