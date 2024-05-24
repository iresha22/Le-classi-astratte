public class Rettangolo extends Forma{
    @Override
    public double calcolaArea(double base, double height) {
        this.base = base;
        this.height = height;
        return base*height;
    }

    @Override
    public String toString() {
        return "" +
                calcolaArea(4,4);
    }
}
