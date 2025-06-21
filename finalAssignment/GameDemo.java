class Character {
    void attack() {
        System.out.println("Character attacks!");
    }
}

class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior swings a sword!");
    }
}

class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage casts a fireball!");
    }
}

public class GameDemo {
    public static void main(String[] args) {
        Character baseChar = new Character();
        Character warrior = new Warrior();
        Character mage = new Mage();

        baseChar.attack();
        warrior.attack();
        mage.attack();
    }
}
