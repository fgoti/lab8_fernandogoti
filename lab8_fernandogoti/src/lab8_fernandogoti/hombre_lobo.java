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
public class hombre_lobo extends Bestia {

    public hombre_lobo() {
        super();
    }

    public hombre_lobo(String nombre, String nickname, double Poder_ataque, double poder_defensa, double salud, double puntos) {
        super(nombre, nickname, Poder_ataque, poder_defensa, salud, puntos);
    }

    @Override
    public void Ataque(Guerreros guerrero) {
        double vida_rival, vida_rival2;
        vida_rival = this.getPoder_ataque() - guerrero.getPoder_defensa();
        vida_rival2 = guerrero.getSalud() - vida_rival;
        guerrero.setSalud(vida_rival2);
    }

}
