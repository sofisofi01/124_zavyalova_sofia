public class Warrior {
    protected final String name;
    protected int health;
    protected int attack;

    public Warrior (String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public void takeDamage(Warrior enemy) {
        this.health = this.health - enemy.getAttack();
    }
}
