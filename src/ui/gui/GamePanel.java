/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.gui;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import trabalhopratico.Data.ObservableGame;
import trabalhopratico.IEstates.IBeginning;

/**
 *
 * @author Bruno Santos
 */
class GamePanel extends JPanel implements Observer{
    
    ObservableGame game;

    public GamePanel(ObservableGame game) {
        this.game=game;
        game.addObserver(this);
        
        setupComponents();
        setupLayout();
        setVisible(!(game.getState() instanceof IBeginning));
    }

    
    
    @Override
    public void update(Observable o, Object o1) {
        setVisible(!(game.getState() instanceof IBeginning));
    }
    
}
