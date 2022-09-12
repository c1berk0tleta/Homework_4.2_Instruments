public class Guitar implements Instrument {

    private int strNumber = 6;

    public void setStrNumber(int strNumber) { this.strNumber = strNumber; }

    public int getStrNumber() { return strNumber; }

    @Override
    public void play() { System.out.println("Гитара is playing. " + toString()); }

    @Override
    public String toString() { return "Кол-во струн: " + strNumber; }

}