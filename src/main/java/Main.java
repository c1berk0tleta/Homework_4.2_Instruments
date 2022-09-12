public class Main {

    public static void main(String[] args) {

            Instrument[] i = new Instrument[3];
            i[0] = new Guitar();
            i[1] = new Drum();
            i[2] = new PolnayaTruba();

            for (Instrument instrument : i) {
                instrument.play();
            }

        }

    }

