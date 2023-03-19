package Units;
// разбойник
public class Robber extends BaseHero {
    
    private int poisons;
    private int maxPoisons;
    
    public Robber() {
        super(String.format("Robber #%d", ++Robber.number),
            Robber.r.nextInt(100, 250));
        this.maxPoisons = Robber.r.nextInt(5, 15);
        this.poisons = maxPoisons;
    }

    public String getInfo() {
        return String.format("%s  poisons: %d", super.getInfo(), this.poisons);
    }
    
}
