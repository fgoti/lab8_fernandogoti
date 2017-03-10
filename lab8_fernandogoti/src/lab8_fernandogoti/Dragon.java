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
public class Dragon extends Bestia{

    @Override
    public void AtaqueDragon(Guerreros guerrero) {
        double salud_rival, poder_ataque, defensa_rival1, defensa_rival2, resta_salud;
        poder_ataque = guerrero.getPoder_ataque()*0.35;
        salud_rival= (guerrero.getPoder_ataque()*poder_ataque)-guerrero.getPoder_defensa();
        defensa_rival1 = guerrero.getPoder_defensa()*0.15;
        defensa_rival2 = guerrero.getPoder_defensa()-defensa_rival1;
        guerrero.setPoder_ataque(defensa_rival2);
        resta_salud = guerrero.getSalud()-
    }
    
    
}
