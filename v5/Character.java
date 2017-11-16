/* Team GitGud - Alexia Leong, Alan Wang, Peter Cwalina
   APCS1 pd2
   HW 33 -- Ye Olde Role Playing Game, Realized
   2017-11-15 */

public class Character{
    protected int _HP;
    protected int _strength;
    protected int _defense;
    protected double _attack;

    public boolean isAlive(){
	//is living or dead
	return _HP > 0;
    }

    public int getDefense(){
	//returns value of defense
	return _defense;
    }

    public int getHP(){
	//returns value of defense
	return _HP;
    }

    public int getStrength(){
	//returns value of defense
	return _strength;
    }

    public double getAttack(){
	//returns value of defense
	return _attack;
    }

    

    public void lowerHP(int a){
	// decrease HP by a
	_HP = _HP - a;
    }

    public int attack(Character m){
	//calculates damage(int) with damage = (strength * attack rating) - monster defense
	int damage =(int) (( _strength * _attack)- m.getDefense());
	m.lowerHP(damage);
	return damage;
    }
    
}
