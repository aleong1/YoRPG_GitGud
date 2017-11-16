/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 33 -- Ye Olde Role Playing Game, Realized
   2017-11-15 */

public abstract class Protagonist extends Character{
    //instance variables:
    protected String _name;
    protected double _originalA;
    protected int _originalD;
    
    //methods:
    public Protagonist(String name){
	//contructor to name protagonist and initialize all attributes
	_name = name;
	_HP = 125;
	_strength = 100;
	_defense = 40;
	_attack = 0.4;
	_originalA = .4;
	_originalD = 40;
    }

    public String getName(){
	//return name
	return _name;
    }
    public static String about(){
	return "";
    }
    public abstract void normalize();
    public abstract void specialize();
  

}
