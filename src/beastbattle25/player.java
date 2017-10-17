/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beastbattle25;


import java.util.Scanner;

/**
 *
 * @author kingJ
 */
public class player extends Stats
{
  private String name;
//  private int kick,punch;
  private int exp;//player experience piont
  public player()
  { name="";
    health =100;
    attack =0;
    
    defense =0;
    damage=0;       
    exp =0;// players exp starts at zore 
   
    
  }
  
  public player(String name,int health,int attack,int defense, int damage, int exp)
  {
      this.name=name;
      this.health=health;
      this.attack=attack;
      this.defense=defense;
      this.damage = damage;
      this.exp=exp;
      
  }
  
  public String getName()
{ return name;

}//name
  
  public int getDamage()
{ return damage;

}//name
  public void setName(String n)
{ name =n;

}//end setname
public int getExp()
{ return exp;
 
}

public void setExp(int e)
{
  exp=e;

}
    // creats playeer name
  public void creatPlayerName(player n, Boss w){
      
      System.out.println("Please create a name for your character");
     //Boss wolf = new Boss();//used the instane of the boss class
      Scanner kb = new Scanner(System.in);//getting info from the keybored
      n.setName(name = kb.nextLine());//gets name from user and saves it
      System.out.println("Hello " + n.getName());//uses saved name.  }
      //System.out.println("omg " + n.getName()+"\n"+ w.getName());//

  }

  

        

}//end player class
