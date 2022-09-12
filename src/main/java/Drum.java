public class Drum implements Instrument {

    private String size = "22″ x 18″";

    public void setSize(String size) { this.size = size; }

    public String getSize() { return size; }

    @Override
    public  void play() { System.out.println("Барабан is playing. " + toString()); }

    @Override
    public String toString() { return "Размер барабанов: " + size; }

}
