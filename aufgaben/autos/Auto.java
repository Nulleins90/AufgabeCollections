package aufgaben.autos;

public abstract class Auto implements Comparable {

  protected int baujahr;
  protected String modell;

  public Auto(String modell, int baujahr) {
    this.modell = modell;
    this.baujahr = baujahr;
  }

  @Override
  public int compareTo(Object o) {
    if (this.modell.compareTo(((Auto)o).getModell())==0) {
        if (this.baujahr>((Auto)o).getBaujahr()) {
            return 1;
        } else if (this.baujahr<((Auto)o).getBaujahr()) {
            return -1;
        } else {
            return 0;
        }
    }
    return (this.modell.compareTo(((Auto)o).getModell()));
  }

  @Override
  public String toString() {
    return "Auto [baujahr=" + baujahr + ", modell=" + modell + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + baujahr;
    result = prime * result + ((modell == null) ? 0 : modell.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Auto other = (Auto) obj;
    if (baujahr != other.baujahr) return false;
    if (modell == null) {
      if (other.modell != null) return false;
    } else if (!modell.equals(other.modell)) return false;
    return true;
  }

  public int getBaujahr() {
    return baujahr;
  }

  public void setBaujahr(int baujahr) {
    this.baujahr = baujahr;
  }

  public String getModell() {
    return modell;
  }

  public void setModell(String modell) {
    this.modell = modell;
  }
}
