
package practicelab4;


public abstract class players extends teams {
    private String name, apodo, futFav, basquetFav, favPlayer, mayorEdad, nacimiento;
    private int numCamisa, numEstrellas;

    public players() {
        super();
    }

    public players(String name, String apodo, String futFav, String basquetFav, String favPlayer, String mayorEdad, String nacimiento, int numCamisa, int numEstrellas, String nombre, String estadio, String pais, String entrandor, String duenio, String masco, String fecha, String color) {
        super(nombre, estadio, pais, entrandor, duenio, masco, fecha, color);
        this.name = name;
        this.apodo = apodo;
        this.futFav = futFav;
        this.basquetFav = basquetFav;
        this.favPlayer = favPlayer;
        this.mayorEdad = mayorEdad;
        this.nacimiento = nacimiento;
        this.numCamisa = numCamisa;
        this.numEstrellas = numEstrellas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getFutFav() {
        return futFav;
    }

    public void setFutFav(String futFav) {
        this.futFav = futFav;
    }

    public String getBasquetFav() {
        return basquetFav;
    }

    public void setBasquetFav(String basquetFav) {
        this.basquetFav = basquetFav;
    }

    public String getFavPlayer() {
        return favPlayer;
    }

    public void setFavPlayer(String favPlayer) {
        this.favPlayer = favPlayer;
    }

    public String getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(String mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public int getNumEstrellas() {
        return numEstrellas;
    }

    public void setNumEstrellas(int numEstrellas) {
        this.numEstrellas = numEstrellas;
    }

    @Override
    public String toString() {
        return  super.toString() + "players{" + "name=" + name + ", apodo=" + apodo + ", futFav=" + futFav + ", basquetFav=" + basquetFav + ", favPlayer=" + favPlayer + ", mayorEdad=" + mayorEdad + ", nacimiento=" + nacimiento + ", numCamisa=" + numCamisa + ", numEstrellas=" + numEstrellas + '}';
    }
    
    
    
    
    
    
    
    
}
