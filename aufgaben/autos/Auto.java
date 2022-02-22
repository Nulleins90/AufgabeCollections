package aufgaben.autos;

public abstract class Auto {
    protected int baujahr;
    protected String modell;

    public Auto(String modell, int baujahr) {
        this.modell = modell;
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        return "Auto [baujahr=" + baujahr + ", modell=" + modell + "]";
    }

    
}
