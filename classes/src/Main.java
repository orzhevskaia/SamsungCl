public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();

        Unit unit1 = new Unit("SA");
        Unit unit2 = new Unit("LA");
        /*System.out.println(unit1);
        unit1.attack(unit2);

        unit2.attack(unit1);
        System.out.println(unit1);
        System.out.println(unit2);*/

        Game game2 = new Game();
        Wizzard wizzard1 = new Wizzard("w1");
        Wizzard wizzard2 = new Wizzard("W2");

        System.out.println(wizzard1);
        System.out.println(wizzard2);
        wizzard2.attack(wizzard1);
        wizzard1.attack(wizzard2);
        System.out.println(wizzard1);
        System.out.println(wizzard2);
        wizzard2.print("AAA");
    }
}