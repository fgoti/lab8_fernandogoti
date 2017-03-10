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
public class Fenix extends Bestia {

    public Fenix() {
        super();
    }

    public Fenix(String nombre, String nickname, double Poder_ataque, double poder_defensa, double salud, double puntos) {
        super(nombre, nickname, Poder_ataque, poder_defensa, salud, puntos);
    }

    @Override
    public void Ataque(Guerreros guerrero) {
        double salud_rival, poder_ataque, ataque_rival1, ataque_rival2, resta_salud;
        poder_ataque = guerrero.getPoder_ataque() * 0.75;
        salud_rival = (guerrero.getPoder_ataque() * poder_ataque) - guerrero.getPoder_defensa();
        resta_salud = guerrero.getSalud() - salud_rival;
        ataque_rival1 = guerrero.getPoder_ataque() * 0.05;
        ataque_rival2 = guerrero.getPoder_ataque() - ataque_rival1;
        guerrero.setPoder_ataque(ataque_rival2);
    }
}
