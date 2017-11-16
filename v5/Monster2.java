/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 33 -- Ye Olde Role Playing Game, Realized
   2017-11-15 */
public class Monster2 extends Monster{
    public Monster2(String name){
	super( name );
	_HP = 50;
	_strength = 2;
	_defense = 10;
	_attack = 0.8;

    }
    public static String about(){
	String retStr;
	retStr = "Boss Time";
	retStr += "\n\t an attack of: .8 ";
	retStr += "\n\t a defense of: 10";
	retStr += "\n\t an HP of: 50 ";
	retStr += "\n\t and a strength of: 2\n";
	return retStr;
	
	    
    }



}
