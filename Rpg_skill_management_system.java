package java_midterm_prep;

public class Rpg_skill_management_system {
    public static void main(String[] args) {
        // Skill flag constants
        final int ATTACK  = 1 << 0;  // 00000001
        final int DEFENSE = 1 << 1;  // 00000010
        final int HEAL    = 1 << 2;  // 00000100
        final int SPEED   = 1 << 3;  // 00001000
        final int MAGIC   = 1 << 4;  // 00010000

        // Task 1: Character A has ATTACK, HEAL, MAGIC
        int charA = ATTACK | HEAL | MAGIC;

        // Task 2: Character B has DEFENSE, HEAL, SPEED
        int charB = DEFENSE | HEAL | SPEED;

        // Task 3: Remove ATTACK from A
        charA = charA & ~ATTACK;

        // Task 4: Find common skills
        int common = charA & charB;
        System.out.print("Common skills: ");
        if ((common & ATTACK) != 0) System.out.print("ATTACK ");
        if ((common & DEFENSE) != 0) System.out.print("DEFENSE ");
        if ((common & HEAL) != 0) System.out.print("HEAL ");
        if ((common & SPEED) != 0) System.out.print("SPEED ");
        if ((common & MAGIC) != 0) System.out.print("MAGIC ");
        System.out.println();

        // Task 5: Print all skills of B
        System.out.print("Character B's skills: ");
        if ((charB & ATTACK) != 0) System.out.print("ATTACK, ");
        if ((charB & DEFENSE) != 0) System.out.print("DEFENSE, ");
        if ((charB & HEAL) != 0) System.out.print("HEAL, ");
        if ((charB & SPEED) != 0) System.out.print("SPEED, ");
        if ((charB & MAGIC) != 0) System.out.print("MAGIC, ");
        System.out.println();
    }
}
