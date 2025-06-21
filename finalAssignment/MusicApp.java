abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    @Override
    void playSound() {
        System.out.println("Playing the piano: Plink plonk");
    }
}

class Guitar extends Instrument {
    @Override
    void playSound() {
        System.out.println("Playing the guitar: Strum strum");
    }
}

class Violin extends Instrument {
    @Override
    void playSound() {
        System.out.println("Playing the violin: Screech screech");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano(),
            new Guitar(),
            new Violin()
        };

        for (Instrument instrument : instruments) {
            instrument.playSound();
        }
    }
}
