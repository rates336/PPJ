package itnJava.ppj10;

import itnJava.ppj2.Task1;

public class s25417 {
    public void Task1() {
        Kwadrat square = new Kwadrat(5.25);
        square.show();
    }
    public void Task2() {
        Walec roller = new Walec(3, 1.15);
        roller.show();
    }
    public void Task3() {
        Prostokat rectangle = new Prostokat(3, 4.5);
        Prostopadloscian cuboid1 = new Prostopadloscian(rectangle, 8);
        Prostopadloscian cuboid2 = new Prostopadloscian(3, 4, 3.5);
        Trojkat triangle1 = new Trojkat(4.5, 1.5);
        Trojkat triangle2 = new Trojkat(4.5);
        Ostroslup pyramid1 = new Ostroslup(3, 5);
        Ostroslup pyramid2 = new Ostroslup(triangle1, 4);
        Graniastoslup prism1 = new Graniastoslup(5, 4.5);
        Graniastoslup prism2 = new Graniastoslup(5, 4.5, 10);
        Graniastoslup prism3 = new Graniastoslup(triangle2, 3.15);
        rectangle.show();
        cuboid1.show();
        cuboid2.show();
        triangle1.show();
        triangle2.show();
        pyramid1.show();
        pyramid2.show();
        prism1.show();
        prism2.show();
        prism3.show();

    }
    public void Task4() {
        Drzewo tree = new Drzewo(true, 12, "something");
        System.out.println(tree.toString());
    }
    public void Task5() {
        Drzewo tree = new Drzewo(false, 8, "somethingIsHere");
        DrzewoIglaste conifer1 = new DrzewoIglaste(tree, 141440, 3.33);
        DrzewoIglaste conifer2 = new DrzewoIglaste(true, 11, "here is here",
                313132, 12.5);
        DrzewoLisciaste leafyTree1 = new DrzewoLisciaste(true, 19,"idk what is it",11);
        DrzewoLisciaste leafyTree2 = new DrzewoLisciaste(tree, 19);
        DrzewoOwocowe fruitTree1 = new DrzewoOwocowe(false, 4, "what is it?",
                6, "Lemon Tree - Song");
        DrzewoOwocowe fruitTree2 = new DrzewoOwocowe(tree, 7, "Me too is lemon tree");
        DrzewoOwocowe fruitTree3 = new DrzewoOwocowe(leafyTree2, "It is not a surprise me too is a lemon tree ");
        System.out.println(tree.toString());
        System.out.println(conifer1.toString());
        System.out.println(conifer2.toString());
        System.out.println(leafyTree1.toString());
        System.out.println(leafyTree2.toString());
        System.out.println(fruitTree1.toString());
        System.out.println(fruitTree2.toString());
        System.out.println(fruitTree3.toString());
    }
    public static void main(String[] args) {
        s25417 s = new s25417();
        s.Task1();
        System.out.println();
        s.Task2();
        System.out.println();
        s.Task3();
        System.out.println();
        s.Task4();
        System.out.println();
        s.Task5();
    }
}
