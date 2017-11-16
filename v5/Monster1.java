/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 33 -- Ye Olde Role Playing Game, Realized
   2017-11-15 */
public class Monster1 extends Monster{
    public Monster1(String name){
	super( name );
	_HP = 50;
	_strength = 0.5;
	_defense = 10;
	_attack = 0.3;

    }
    public static String about(){
	String retStr;
	retStr = "It's getting a little harder";
	retStr += "\n\t an attack of: .3 ";
	retStr += "\n\t a defense of: 10";
	retStr += "\n\t an HP of: 50 ";
	retStr += "\n\t and a strength of: 0.5\n";
	return retStr;
	
	    
    }



}
