
/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 31 -- Ye Olde Role Playing Game, Expanded
   2017-11-10 */

public class Protagonist extends Character{
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
