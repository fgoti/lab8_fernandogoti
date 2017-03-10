/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_fernandogoti;

/**
 *
 * @author Fernando Goti
 */
public class Alumnos extends Bestia {

    private long cuenta;
    private String carrera;
    private int edad;

    public Alumnos() {
        super();
    }

    public Alumnos(long cuenta, String carrera, int edad) {
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.getNombre() + cuenta;
    }

    @Override
    public void Ataque(Guerreros guerrero) {
        double vida_rival, aumento, total;
        vida_rival = this.getPoder_ataque() - guerrero.getPoder_defensa();
        guerrero.setSalud(vida_rival);
        aumento = this.getSalud() * 0.25;
        total = aumento + this.getSalud();
        this.setSalud(total);
    }

}
