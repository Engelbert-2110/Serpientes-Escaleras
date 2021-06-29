
package usuario;

import java.io.BufferedReader;
import java.io.PrintWriter;


public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int ganadas;
    private int perdidas;
    private int jugadas;

    
    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int id, String nombre, String apellido, int ganadas, int perdidas, int jugadas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ganadas = ganadas;
        this.perdidas = perdidas;
        this.jugadas = jugadas;
    }

    public Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public void guardar(PrintWriter Escribe) {
      Escribe.println(id);
      Escribe.println(nombre);
      Escribe.println(apellido);
     
    }

    public Persona cargar(BufferedReader Almacen) {
        String nombre, apellido;
        int id;
        
        try {
            id = Integer.parseInt(Almacen.readLine());
            nombre = Almacen.readLine();
            apellido = Almacen.readLine();
            return new Persona(id, nombre, apellido);
        } catch (Exception e) {
        }
        return null;
    }
    
    
    
    
}
