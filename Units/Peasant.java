package Units;
//крестьянин
public class Peasant extends BaseHero {
    
    private int Axe;
    private int maxAxe;
        
    public Peasant() {
        super(String.format("Peasant #%d", ++Peasant.number),
            Peasant.r.nextInt(100, 250));
        this.maxAxe = Peasant.r.nextInt(5, 15);
        this.Axe = maxAxe;
    }
    
    public String getInfo() {
        return String.format("%s  Axe: %d", super.getInfo(), this.Axe);
    }
}
