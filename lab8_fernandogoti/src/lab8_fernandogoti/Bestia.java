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
public abstract class Bestia extends Guerreros {

    public Bestia() {
    }

    public Bestia(String nombre, String nickname, double Poder_ataque, double poder_defensa, double salud, double puntos) {
        super(nombre, nickname, Poder_ataque, poder_defensa, salud, puntos);
    }

    public abstract void Ataque(Guerreros guerrero);
}
