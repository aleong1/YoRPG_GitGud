/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 33 -- Ye Olde Role Playing Game, Realized
   2017-11-15 */

public class Monster extends Character{
    //methods
    
    public Monster(){
	//constructor to initialize all attributes, sets strength to random number [20,65) and life:150 defense:20 and attack:1
	_strength = (int)(Math.random() * 45) + 20;
	_HP = 150;
	_defense = 20;
	_attack = 1;
    }
	    
}
       
