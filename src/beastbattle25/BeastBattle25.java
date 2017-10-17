/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beastbattle25;

//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author kingJ
 */
public class BeastBattle25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        player Player = new player();// used the instane of the player class
        Boss wolf = new Boss();//used the instane of the boss class   
        Routes playerRoute = new Routes();
        Player.creatPlayerName(Player, wolf);// im using my method that  is created in my player class
        playerRoute.fightPath(Player, wolf);
//wolf.firstBoss(Player,wolf);
        
        
     //    firstBoss(PLAYER,CPU,flee,hitfirst);
       

        
//        {
//            System.out.println(wolf.getName("inc");       
//        }
    }//end main

    
    /*
     if (kb == yes)  {
     monster2}
     }*/
}
