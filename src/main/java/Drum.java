public class Drum implements Instrument {

     int size;

    @Override
    public  void play() {
        System.out.println("Барабан is playing в ключе " + KEY + ". Размер барабанов: " + size + " дюймов");
    }


}
