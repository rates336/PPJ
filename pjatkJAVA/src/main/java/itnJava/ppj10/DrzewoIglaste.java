package itnJava.ppj10;

public class DrzewoIglaste extends Drzewo {
    private int iloscIgiel;
    private double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
                         int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public DrzewoIglaste(Drzewo tree, int iloscIgiel, double dlugoscSzyszki) {
        super(tree.isWiecznieZielone(), tree.getWysokosc(), tree.getPrzekrojDrzewa());
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return "DrzewoIglaste{" +
                "iloscIgiel=" + iloscIgiel +
                ", dlugoscSzyszki=" + dlugoscSzyszki +
                '}';
    }


}
