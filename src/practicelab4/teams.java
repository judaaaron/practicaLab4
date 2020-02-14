
package practicelab4;

import java.util.ArrayList;


public class teams {
    
    private String nombre, estadio, pais, entrandor, duenio, masco, fecha, color;
    private ArrayList<players> jugadores= new ArrayList();

    public teams(String nombre, String estadio, String pais, String entrandor, String duenio, String masco, String fecha, String color) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.pais = pais;
        this.entrandor = entrandor;
        this.duenio = duenio;
        this.masco = masco;
        this.fecha = fecha;
        this.color = color;
    }

    public teams() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEntrandor() {
        return entrandor;
    }

    public void setEntrandor(String entrandor) {
        this.entrandor = entrandor;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getMasco() {
        return masco;
    }

    public void setMasco(String masco) {
        this.masco = masco;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<players> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<players> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "teams{" + "nombre=" + nombre + ", estadio=" + estadio + ", pais=" + pais + ", entrandor=" + entrandor + ", duenio=" + duenio + ", masco=" + masco + ", fecha=" + fecha + ", color=" + color + ", jugadores=" + jugadores + '}';
    }
    
    
    
    
    
}
