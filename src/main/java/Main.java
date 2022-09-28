public class Main {

    public static void main(String[] args) {

        Guitar g = new Guitar();
        g.strNumber = 6;
        Drum d = new Drum();
        d.size = 14;
        Trumpet t = new Trumpet();
        t.diameter = 11;

        Instrument[] i = {g,d,t};
        for (Instrument instruments : i) {
            instruments.play();
            }
        }
    }

