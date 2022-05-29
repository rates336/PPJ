package itnJava.ppj10;

public class DrzewoOwocowe extends DrzewoLisciaste {
    private String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
                         int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    public DrzewoOwocowe(Drzewo tree, int ksztaltLiscia, String nazwaOwoca) {
        super(tree, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }
    public DrzewoOwocowe(DrzewoLisciaste leafyTree, String nazwaOwoca) {
        super(leafyTree.isWiecznieZielone(), leafyTree.getWysokosc(), leafyTree.getPrzekrojDrzewa(),
                leafyTree.getKsztaltLiscia());
        this.nazwaOwoca = nazwaOwoca;
    }

    public String getNazwaOwoca() {
        return nazwaOwoca;
    }

    @Override
    public String toString() {
        return "DrzewoOwocowe{" +
                "nazwaOwoca='" + nazwaOwoca + '\'' +
                '}';
    }
}
