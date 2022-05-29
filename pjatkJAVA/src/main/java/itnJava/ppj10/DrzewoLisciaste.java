package itnJava.ppj10;

public class DrzewoLisciaste extends Drzewo {
    private int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
                           int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    public DrzewoLisciaste(Drzewo tree, int ksztaltLiscia) {
        super(tree.isWiecznieZielone(), tree.getWysokosc(), tree.getPrzekrojDrzewa());
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return "DrzewoLisciaste{" +
                "ksztaltLiscia=" + ksztaltLiscia +
                '}';
    }

    public int getKsztaltLiscia() {
        return ksztaltLiscia;
    }
}
