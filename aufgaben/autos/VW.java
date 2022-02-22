package aufgaben.autos;

public class VW extends Auto {

    public VW(String modell, int baujahr) {
        super(modell, baujahr);
    }

    @Override
    public String toString() {
        return "VW. Modell: " + super.modell + ", Baujahr " + super.baujahr;
    }


    
}
