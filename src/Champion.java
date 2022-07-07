public class Champion {

    public String name;
    public int life;
    public int attack;
    public int armor;

    public void takeDamage(Champion other){

        int damage = other.attack - armor;
        life = life - damage;
    }
}


