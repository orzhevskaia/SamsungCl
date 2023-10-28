//wizard
public class Wizzard extends Unit{

    protected int mana = 100;

    public Wizzard(String name) {//конструктор - то что вызывается при создании
        super(name);
        power = 25;
        health = 80;
    }

    @Override
    public void attack(Unit unit) {
        if (mana >= 0) {
            super.attack(unit);
            mana -= 10;
        }
    }

    @Override
    public String toString() {
        return "Wizzard{" +
                "mana=" + mana +
                ", name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
