package Units;

//снайпер
public class Sniper extends BaseHero {
    private int ammo;
    private int maxAmmo;
    
    public Sniper() {
        super(String.format("SniperHero #%d", ++Sniper.number),
            Sniper.r.nextInt(100, 200));
        this.maxAmmo = Sniper.r.nextInt(50, 200);
        this.ammo = maxAmmo;
    }

    public String getInfo() {
        return String.format("%s  Ammo: %d", super.getInfo(), this.ammo);
    }
}