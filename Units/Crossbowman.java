package Units;

//арбалетчик
public class Crossbowman extends BaseHero {
    private int arrows;
    private int maxArrows;
    
    public Crossbowman() {
        super(String.format("CrossbowmanHero #%d", ++Crossbowman.number),
            Crossbowman.r.nextInt(100, 200));
        this.maxArrows = Crossbowman.r.nextInt(50, 200);
        this.arrows = maxArrows;
    }

    public String getInfo() {
        return String.format("%s  arrows: %d", super.getInfo(), this.arrows);
    }
}