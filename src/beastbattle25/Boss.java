/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beastbattle25;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kingJ
 */
public class Boss extends Stats {

    private String name;
    private String BNameTwo;
    private String BNameThree;
    Random rnd = new Random();

    public Boss() {
       
   
        int i ;
      
        i = rnd.nextInt(2);
        if (i == 0) {
        name = "The Big Bad wolf"; // 
        }
        if (i == 1) {
          name = "War Pig";
        }
        if (i == 2) {
          name = "Demon bird";
        }      
//  name = "The Big Bad wolf";
       // BNameTwo = "War Pig";
        //BNameThree = "Demon bird";
        health = 100;
        attack = 0;
        defense = 0;
        damage = 0;
    }

    public Boss(String name, int health, int attack, int defense, int damage, String BNameTwo, String BNameThree) {
        this.name = name;
        this.BNameTwo = BNameTwo;
        this.BNameThree = BNameThree;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
    }

    public String getName() {
        return name;

    }//name

    public String getBNameTwo() {
        return BNameTwo;

    }//name

    public String getBNameThree() {
        return BNameThree;

    }//name

   // public int getDamage() {
     //   return damage;

    //}//name

    public void setName(String n) {
        name = n;

    }//end setname

//    public void setBNameTWO(String BNTW) {
//        name = BNTW;
//
//    }//end setname
//
//    public void setBNameThree(String BNTH) {
//        name = BNTH;
//
//    }//end setname
    public void createBossName(Boss n, player p)
    {
//        
//        int i ;
//      
//        i = rnd.nextInt(2);
//        if (i == 0) {
//          n.setName(name = "The Big Bad wolf"); // 
//        }
//        if (i == 1) {
//           n.setName(name = "War Pig");
//        }
//        if (i == 2) {
//            n.setName( name = "Demon bird");
//        }
     
    }
// this method preforms the first boss battle

    public void firstBoss(player Player, Boss wolf) {//used the instane of the player class //used the instane of the boss class   

        final int PLAYER = 0;//palyer turn maker.
        final int CPU = 1;//cpu turn maker. both of these are used to chager to turn
        //=-1;// gets the chosse from the user...... he/she wants to attack by keybored
        //String name;//play name used on line 42
        int flee ;//= 0;// randomly see if the player is able to runn 
        int hitfirst;// = 0;// sees who hitsfirst firt 
        String choice;
        Scanner kb = new Scanner(System.in);//getting info from the keybored
        do {
                System.out.println("omg " + Player.getName()+"\n"+ wolf.getName());
            System.out.println("Would you like to attack him" + " yes or no");//"\n0 for NO and 1 for YES.");   
            // try {
            choice = kb.nextLine();// kb.nextInt();
            choice = choice.toLowerCase();
// } catch (Exception ex) {
            //System.out.println("Incorrect input");
            //}
        } while (!choice.contains("yes") && !choice.contains("no"));//||!choice.equals("Yes")||!choice.equals("YES")||!choice.equals("yEs")||!choice.equals("yeS")||!choice.equals("YeS")||!choice.equals("yES")||!choice.equals("YEs"));  

        if (choice.contains("yes") || choice.contains("Yes") || choice.contains("YES") || choice.contains("yEs") || choice.contains("yeS") || choice.contains("YeS") || choice.contains("yES") || choice.contains("YEs"))//choice == 1) 
        {
            //System.out.println("Your health " + Player.getHealth() + " and the " + wolf.getName() + " health " + wolf.getHealth());
            hitfirst = (int) (Math.round(Math.random()));

            System.out.println("The fight begins!!!!");
            System.out.println("the hitfirst number is " + hitfirst);
            if (hitfirst == 0) {
                System.out.println(Player.getName() + " attaks firts");

            } else {
                System.out.println(wolf.getName() + " attaks firts");
            }

            do {  //fight loop
                if (hitfirst == PLAYER) {
                    //       
                    System.out.println("Would you like to attack him" + " attack or run"); //"\n0 for NO and 1 for YES.");

                    try {
                        choice = kb.nextLine(); //kb.nextInt();
                    } catch (Exception ex) {
                        System.out.println(wolf.getName() + " attack you and bits off you head " + " and you die");
                    }
                    if (choice.equalsIgnoreCase("attack"))
//(choice.contains("yes") || choice.contains("Yes") || choice.contains("YES") || choice.contains("yEs") || choice.contains("yeS") || choice.contains("YeS") || choice.contains("yES") || choice.contains("YEs")) {
                            {
                        wolf.createPowerStats();
                        Player.createPowerStats();
                        System.out.println("Your current is health " + "\n" + Player.getHealth());
                        System.out.println("Its your turn " + Player.getName());
                        System.out.println("Your attack power now is " + "\n" + Player.getAttack() + "\nYou kicked the wolf.");
                        System.out.println(wolf.getName() + "\ndefense is " + wolf.getDefense());
                        Player.performAttack(wolf);
                        System.out.println(wolf.getName() + " takes " + "\n" + wolf.getDamage() + " in damages.");

                        System.out.println(wolf.getName() + " current health is " + "\n" + wolf.getHealth());
                        hitfirst = CPU;/* so this set it first to back to 0. so now it reset the to and makes it your turn again.
                         <trun changer >so now it goes back to ask you if you would like to after again if yes say yes then it  will go back to the fight loop if you 
                         try to run  you will enter theat if statment if the run is successful you will run if not the wolf will at agian
                         */

                    } else if (choice.equalsIgnoreCase("run"))//(choice.contains("no") || choice.contains("nO") || choice.contains("No") || choice.contains("NO")) 
                    
                        {
                        flee = (int) (Math.round(Math.random() * 100 + 1));//randomly pick if youj can flee or not

                        if (flee <= 51) {
                            System.out.println(Player.getName() + " you ran!!");
                            break;
                        } else if (flee >= 50) {
                            System.out.println(wolf.getName() + " stops you from running");
                            hitfirst = CPU;

                        }

                        }//if else
                }//
                else //if( hitfirst == CPU)
                {
                    System.out.println(wolf.getName()+" attack power now is " + wolf.getAttack() + " and it attacks");
                    System.out.println(Player.getName() + "\nyour defense is " + Player.getDefense());
                    wolf.performAttack(Player);

                    System.out.println("You took " + /*"\n"*/ Player.getDamage() + " in damages");
                    System.out.println("Your health is " + /*"\n"*/ Player.getHealth());

                    hitfirst = PLAYER;//i changing the current play by seting it equal to hitfirst
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BeastBattle25.class.getName()).log(Level.SEVERE, null, ex);
                }

            } while (Player.getHealth() > 0 && wolf.getHealth() > 0);//end while

        }//the fight begins
        if (Player.getHealth() <= 0) {
            System.out.println(/*Player.getHealth()*/Player.getName()+ " You lost"+ " this is the end of you journy :(");

        } else if (wolf.getHealth() <= 0) {
            System.out.println(wolf.getName() + " lost");

        } else if (choice.equalsIgnoreCase("run"))//.contains("no") || choice.contains("nO") || choice.contains("No") || choice.contains("NO")) {
                {
                /*
             I  am having problem with this if funtion. if i try to run during the battle and if it is successful it double print the runn statment 
             so
             */
            //System.out.println(Player.getName() + " you ran!!");
            System.out.println(wolf.getName()+" walkes aways.");

        }//if else
        
//        else
    }//end firstboss
 
    /*   
    public void secondBoss(player Player, Boss wolf)
        {
              Player.setHealth(Player.getHealth()+50);
              wolf.setHealth(wolf.getHealth()+70);
              System.out.println("You made it to the second Boss"+"\nwould you like to fight"+wolf.getName());
              Scanner kb 
            do{
            Player.createPowerStats();
            wolf.createPowerStats();
                System.out.println("You "); 
           
            
            
            Player.setAttack(Player.getAttack()+20);
            Player.setDefense(Player.getDefense()+10);
            
            }while(Player.getHealth());  
            
            
        }//secondBoss()
   */ 
}//end boss class
