public class Triangolo extends Forma{

    @Override
    public double calcolaArea(double base,double height) {
        this.base = base;
        this.height = height;
        return (base*height)/2;
    }

    @Override
    public String toString() {
        return "" +
                calcolaArea(3,4);
    }
}
