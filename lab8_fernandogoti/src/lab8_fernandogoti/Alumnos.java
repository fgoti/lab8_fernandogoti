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
public class Alumnos extends Guerreros {

    private long cuenta;
    private String carrera;
    private int edad;

    public Alumnos() {
        super();
    }

    public Alumnos(long cuenta, String carrera, int edad, String nombre, String nickname, double Poder_ataque, double poder_defensa, double salud, double puntos) {
        super(nombre, nickname, Poder_ataque, poder_defensa, salud, puntos);
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

}
