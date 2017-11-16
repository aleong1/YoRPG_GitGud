/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 33 -- Ye Olde Role Playing Game, Realized
   2017-11-15 */
public class Monster0 extends Monster{
    public Monster0(String name){
	super( name );
	_HP = 30;
	_strength = 0;
	_defense = 5;
	_attack = 0.2;

    }
    public static String about(){
	String retStr;
	retStr = "Monster0 the easiest of the 3 monsters";
	retStr += "\n\t an attack of: .2 ";
	retStr += "\n\t a defense of: 5";
	retStr += "\n\t an HP of: 30 ";
	retStr += "\n\t and a strength of: 0\n";
	return retStr;
	
	    
    }



}
