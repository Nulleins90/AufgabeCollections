package aufgaben.autos;

public class BMW extends Auto {

    public BMW(String modell, int baujahr) {
        super(modell, baujahr);
    }

    @Override
    public String toString() {
        return "BMW. Modell: " + super.modell + ", Baujahr " + super.baujahr;
    }
    
    
    
}
