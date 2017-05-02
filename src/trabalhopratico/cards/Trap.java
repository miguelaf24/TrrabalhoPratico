/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico.cards;

import trabalhopratico.Data.Dugeon;
import trabalhopratico.IEstates.IAwaitAction;
import trabalhopratico.IEstates.ICombat;
import trabalhopratico.IEstates.IMerchAwait;
import trabalhopratico.IEstates.IStates;

/**
 *
 * @author Bruno Santos
 */
public class Trap extends Card{
    
     @Override
     public IStates accao(int opt, Dugeon act)
     {
         int v= act.rolldice();
         switch (v){
             case 1:
                 act.rmfood();
             break;
             case 2:
                 act.rmGold(1);
             break;
             case 3:
                 act.rmArmor(1);
             break;
             case 4:
                 act.rmHP(1);
             break;
             case 5:
                 act.rmXP(1);
             break;
             case 6:
                act.rmHP(2);
                //--->fazer o recuo de area
                return new IAwaitAction(act);
         }
             return new IAwaitAction(act);
     }
     
     @Override
     public IStates inicia(Dugeon act)
     {
        return accao(0,act);
     }
     
     
     @Override
     public String getname(){
         return "Trap\t\t";
     }
}