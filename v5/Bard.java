/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 32 -- Ye Olde Role Playing Game, Unchained
   2017-11-14 */
public class Bard extends Protagonist{
    //ye have decided to specialize in the musical genuis
    public Bard(String name){
	super( name );

	_HP = 50;
	_strength = 0;
	_defense = 10;
	_attack = 0.4;
	_originalD = 10;
	_originalA = 0.4;

    }
    public static String about(){
	String retStr;
	retStr = "\tWhy Would you pick this class? Bards can't attack I'm warning you:";
	retStr += "\n\t an attack of: .4 ";
	retStr += "\n\t a defense of: 10";
	retStr += "\n\t an HP of: 50 ";
	retStr += "\n\t and a strength of: 0\n";
	return retStr;
	
	    
    }
      public void specialize(){
	//prep for special attack, decrease defense, increase attack
	_attack = 1;
	_defense = 5;
    }

    public void normalize(){
	//prep for normal attack, resets defense and attack
	_attack = _originalA;
	_defense = _originalD;
    }
    



}
