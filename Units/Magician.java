package Units;

// колдун 
public class Magician extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxElixir = Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
