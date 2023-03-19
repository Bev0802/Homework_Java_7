package Units;

//копейщик
public class Spearman extends BaseHero {
    private int spears;
    private int maxSpears;
    
    public Spearman() {
        super(String.format("SpearmanHero #%d", ++Spearman.number),
            Spearman.r.nextInt(100, 200));
        this.maxSpears = Spearman.r.nextInt(50, 200);
        this.spears = maxSpears;
    }

    public String getInfo() {
        return String.format("%s  spears: %d", super.getInfo(), this.spears);
    }
}