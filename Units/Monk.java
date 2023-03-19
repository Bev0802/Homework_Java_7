package Units;
// монах
public class Monk extends BaseHero {

    private int mana;
    private int maxMana;

    public Monk() {
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(100, 200));
        this.maxMana = Monk.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}