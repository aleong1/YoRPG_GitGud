
/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 31 -- Ye Olde Role Playing Game, Expanded
   2017-11-10 */
public class Paladin extends Protagonist{
    //ye have decided to specialize in the tanky class
    public Paladin(String name){
	super( name );

	_HP = 300;
	_strength = 70;
	_defense = 50;
	_attack = 0.2;
	_originalD = 50;
	_originalA = 0.2;

    }
    public static String about(){
	String retStr;
	retStr = "\tThe tanky class it boasts:";
	retStr += "\n\t an attack of: .2 ";
	retStr += "\n\t a defense of: 50";
	retStr += "\n\t an HP of: 300 ";
	retStr += "\n\t and a strength of: 70\n";
	return retStr;
	
	    
    }
    public void specialize(){
	//prep for special attack, decrease defense, increase attack
	_attack = 1;
	_defense = 30;
    }

    public void normalize(){
	//prep for normal attack, resets defense and attack
	_attack = _originalA;
	_defense = _originalD;
    }
    



}
