/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.traidor;

import io.github.guisso.meleeinterface.Decision;
import io.github.guisso.meleeinterface.IPlayer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Todo mundo
 */
public class Traidor 
 implements IPlayer{

   @Override
    public String getDeveloperName() {
        return "Nicolas Marques da Silva";
    }

    @Override
    public String getEngineName() {
        return "É que eu so mau";
    }

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
      
        return Decision.DEFECT;
    }
    
    
}


