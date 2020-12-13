public class Rect extends Square {
    private int height;

    public Rect(int x1, int y1, int width, int height) {
        super(x1, y1, width);
        this.height = height;
    }

    @Override
    public float getSquare() {
        return height * super.getR();
    }
}
