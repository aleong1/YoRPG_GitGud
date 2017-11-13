
/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 31 -- Ye Olde Role Playing Game, Expanded
   2017-11-10 */
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

    }
    public static String about(){
	String retStr;
	retStr = "\tThe sneaky Assasin:";
	retStr += "\n\t an attack of: .5 ";
	retStr += "\n\t a defense of: 20";
	retStr += "\n\t an HP of: 100 ";
	retStr += "\n\t and a strength of: 150\n";
	return retStr;
	
	    
    }



}
