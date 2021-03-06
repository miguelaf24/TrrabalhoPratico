/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico.cards;

import java.io.Serializable;
import trabalhopratico.Data.Dugeon;
import trabalhopratico.IEstates.IAwaitAction;
import trabalhopratico.IEstates.IStates;

/**
 *
 * @author Bruno Santos & Miguel Almeida
 */
public class Treasure extends Card implements Serializable{

    public Treasure() {
        this.descricao="Treasure";
    }

     @Override
     public IStates accao(int opt, Dugeon act)
     {
         if(act.getMkill())
            act.addGold(2);
         else
             act.addGold(1);
         
         switch(act.rolldice()){
             case 1:
                 act.addArmor(1);
                 break;
             case 2:
                 act.addxp(2);
                 break;
             case 3:
                 act.WinSpell(1);
                 break;
             case 4:
                 act.WinSpell(2);
                 break;
             case 5:
                 act.WinSpell(3);
                 break;
             case 6:
                 act.WinSpell(4);
                 break;
            }
        return new IAwaitAction(act);
     }
     
     @Override
     public IStates inicia(Dugeon act)
     {
             return accao(0, act);
     }
     
     @Override
     public String getname(){
         return "Treasure\t";
     }
    
}
