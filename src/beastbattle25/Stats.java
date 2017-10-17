/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beastbattle25;

import static java.lang.Math.abs;

/**
 *
 * @author kingJ
 */
abstract class Stats{

 
    int health;// player and boss health attack defents damges
    int attack;
    int defense;
    int damage;//
    
 
 
// null cunstructors player and boss stats
//public Stats()
//{
// 
//
//}//end null constructors

// accessor methods *******************************
public int getHealth()
{
  return health;
}
public int getAttack()
{
    return attack;
}

public int getDefense()
{
  return defense;
}


public int getDamage()
{
  return damage;
}
 // mutator methods ******************************
public void setHealth(int health)
{ this.health=health;
 
}
public void setAttack(int attack)
{ this.attack=attack;
 
}        
public void setDefense(int defense)
{ this.defense=defense;
 
}
public void setDamage(int damage)
{ this.damage=damage;
 
}
//create method performAttack(Stats e)
public void performAttack(Stats target)
{
    int damages=this.attack-abs(target.getDefense());
    if(damages<0){
        damages=0;
        System.out.println("Attack missed lol");
    }
    target.setDamage(damages);
    target.setHealth(target.getHealth()-target.getDamage());
    
}//performAttack
/*
    creates attack and  defense before battle
*/
public void createPowerStats()
{ 
    setAttack((int) (Math.random() * 50) + 1);//creates attack 
    setDefense((int) (Math.random() * 25 + 1));//creates defense 
                     



}//


}// end stats class