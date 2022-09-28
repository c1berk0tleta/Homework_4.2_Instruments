public class Trumpet implements Instrument {

    int diameter;

    @Override
    public void play() {
        System.out.println("Труба is playing в ключе " + KEY + ". Диаметр трубы: " + diameter + " мм");
    }
}