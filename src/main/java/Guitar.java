public class Guitar implements Instrument {

    int strNumber;

    @Override
    public void play() {
        System.out.println("Гитара is playing в ключе " + KEY +". Кол-во струн: " + strNumber);
    }
}