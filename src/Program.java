import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

       Champion c1 = new Champion();
       c1.name = "Darius";
       c1.life = 50;
       c1.attack = 8;
       c1.armor = 1;

       Champion c2 = new Champion();
       c2.name = "Fiora";
       c2.life = 40;
       c2.attack = 10;
       c2.armor = 2;

       c1.takeDamage(c2);
       c2.takeDamage(c1);

        System.out.println("Darius after taking damage from Fiora: " + c1.life);
        System.out.println("Fiora after taking damage from Darius: " + c2.life);
    }
}
