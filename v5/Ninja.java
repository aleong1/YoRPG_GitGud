/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 33 -- Ye Olde Role Playing Game, Realized
   2017-11-15 */
public class Ninja extends Protagonist{
    //ye have decided to specialize in the sneaky assasin
    public Ninja(String name){
	super( name );

	_HP = 100;
	_strength = 150;
	_defense = 20;
	_attack = 0.5;
	_originalD = 20;
	_originalA = 0.5;
	_speed = 8;

    }
    public static String about(){
	String retStr;
	retStr = "\tThe sneaky Assasin:";
	retStr += "\n\t an attack of: .5 ";
	retStr += "\n\t a defense of: 20";
	retStr += "\n\t an HP of: 100 ";
	retStr += "\n\t and a strength of: 150\n";
	retStr += "\n\t and a speed of: 8\n ";
	return retStr;
	
	    
    }
    public void specialize(){
	//prep for special attack, decrease defense, increase attack
	_attack = 1;
	_defense = 10;
    }

    public void normalize(){
	//prep for normal attack, resets defense and attack
	_attack = _originalA;
	_defense = _originalD;
    }
    
    public void potion(){
	_HP = _HP + 60;
    }
    


}
