/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beastbattle25;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kingJ
 */
public class Routes  {

    private Random rnd;
    private List<String> loot;
    private List<String> inventory;
    Boss newBoss = new Boss();

    public Routes() {
        rnd = new Random();                                                     //Random class instantiated
        loot = new ArrayList<>();                                         //Make arraylist for string loot
        inventory = new ArrayList<>();                                    //Make arraylist for string inventory

    }

    public Routes(Random rnd, List<String> loot, List<String> inventory) {
        this.rnd = rnd;
        this.loot = loot;
        this.inventory = inventory;
    }//enf routes

    public Random getRnd() {
        return rnd;
    }

    public List<String> getLoot() {
        return loot;
    }

    public List<String> inventory() {
        return inventory;

    }

    public void setRnd(Random path) {
        rnd = path;

    }//end setname

    public void setloot(ArrayList<String> cash) {
        loot = cash;

    }//end setname

    public void setName(ArrayList<String> n) {
        inventory = n;

    }//end setname

    public void fightPath(player p, Boss w) {
        int numberOfPaths = 3;//rnd.nextInt(3) + 1;                         //Generate number of paths, length of game
        int numberOfPathsLeft = numberOfPaths;
        int typeOfRoom;
        int i;
        String prompt;
        loot.add("Bronze");
        loot.add("Silver");
        loot.add("Gold");                                                       //Append arraylist loot with new values
        Scanner keyboard = new Scanner(System.in);
       do{
        System.out.println(p.getName()+" do you want to begin your journey?"+"\nyes or no");
        prompt = keyboard.nextLine();
       }while(!prompt.equalsIgnoreCase("yes")&&!prompt.equalsIgnoreCase("no"));//.contains(prompt."yes")&&!prompt.contains("no"));
        if (prompt.equalsIgnoreCase("yes")) {
            
            do {  
                 i = numberOfPaths;
                //PRE: Calculates routes for player
                System.out.println("This cave has " + numberOfPaths + " Paths");
                //for (int i = numberOfPaths; i > 0; i--) {                       //For loop running through the paths until no more 
                    System.out.println("You approach the first path, go left or right?");
                    prompt = keyboard.nextLine();
                    System.out.println("You decide to go " + prompt + ".");
                    typeOfRoom = (int) (Math.round(Math.random()));
                    System.out.println("the type of room "+ typeOfRoom);
                    //System.out.println("your health" + p.getHealth());
                    if (typeOfRoom ==0) {
                        System.out.println("This is a room full of loot. ");
                        inventory.add(0, loot.get(rnd.nextInt(2)));
                        System.out.println("You found " + inventory.get(0));
                        numberOfPathsLeft -= 1;
                        if (numberOfPathsLeft == 0) {
                            System.out.println("You have reached the end");
                            
                        }//end (numberOfPathsLeft == 0)
                    }//end (typeOfRoom == 0)
                    if (typeOfRoom == 1) {
                    
                        System.out.println("You ran into " + w.getName());
                        w.firstBoss(p, w);
                        numberOfPathsLeft -= 1;
                        if (numberOfPathsLeft == 0) {
                            System.out.println("You have reached the end");
                           
                        }// end (numberOfPathsLeft == 0)
                    }// end (typeOfRoom == 1)
                //}//end for loop
             //       System.out.println("THIS IS THE PLAYERS HEALTH" +p.getHealth());
                    
                    
                    numberOfPaths--;//decrease the noumbe of paths by on
            } while (numberOfPaths!=0&& p.getHealth()>=0);//play == true);//end do 
            
        }//prompt.equalsIgnoreCase("yes")
    }//fightPath

}//end routes 
