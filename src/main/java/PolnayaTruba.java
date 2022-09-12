public class PolnayaTruba implements Instrument {

    private double diameter = 11;

    public void setDiameter(double diameter) { this.diameter = diameter; }

    public double getDiameter() { return diameter; }

    @Override
    public void play() { System.out.println("Труба is playing. " + toString()); }

    @Override
    public String toString() { return "Диаметр трубы: " + diameter + " мм"; }

}