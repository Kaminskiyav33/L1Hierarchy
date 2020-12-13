public class Square extends Circle{

    public Square(int x1, int y1, int width) {
        super(x1, y1, width);
    }

    @Override
    public float getSquare() {
        int length = super.getR();
        return  length * length;
    }
}
