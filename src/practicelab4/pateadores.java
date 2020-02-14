package practicelab4;

public class pateadores extends players {

    private int HP, fuerza, HR;

    public pateadores() {
    }

    public pateadores(int HP, int fuerza, int HR, String name, String apodo, String futFav, String basquetFav, String favPlayer, String mayorEdad, String nacimiento, int numCamisa, int numEstrellas) {
        super(name, apodo, futFav, basquetFav, favPlayer, mayorEdad, nacimiento, numCamisa, numEstrellas);
        this.HP = HP;
        this.fuerza = fuerza;
        this.HR = HR;
    }

   

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getHR() {
        return HR;
    }

    public void setHR(int HR) {
        this.HR = HR;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return super.toString() + "pateadores{" + "HP=" + HP + ", fuerza=" + fuerza + ", HR=" + HR + '}';
    }

    @Override
    public double atacar() {
        return (HP + fuerza + HR) * 0.65 * getNumEstrellas();
    }

}
