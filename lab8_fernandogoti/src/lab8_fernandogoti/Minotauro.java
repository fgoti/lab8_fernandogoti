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
public class Minotauro extends Bestia {

    @Override
    public void Ataque(Guerreros guerrero) {
        double vida_rival1, cincuenta, poder1, poder2;
        cincuenta = guerrero.getPoder_defensa() * 0.50;
        vida_rival1 = (this.getPoder_ataque() * 2) - (guerrero.getPoder_defensa() + cincuenta);
        guerrero.setSalud(vida_rival1);
        poder1 = this.getPoder_ataque() * 0.10;
        poder2 = poder1 * this.getPoder_ataque();
        this.setPoder_ataque(poder2);
    }
}
