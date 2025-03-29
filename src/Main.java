import java.util.Scanner;  //import Scanner class


public class Main {
    public static String playerName = "Cupcake";
    public static double playerHealth = 100;
    
    public static double weaponDamage = 0;
    public static int weapon = 1;        
    public static String weaponName = ""; 
    
    public static int level = 1;
    public static double exp = 1;
    public static int score = 0;
    public static int lives = 3;
    
    public static Scanner scnr = new Scanner(System.in);     
    
    public static Zombie zomb = new Zombie();
    
    public static String str = "hello";
    
    
    public static String[] map = {"grove", "road", "the hill", "house", "the ditch", "the river"}; 
    
    public static void main(String[] args){
               
        boolean respawn = true;
        char option;      
        
        System.out.println("Welcome to Brain Eater!");
        
        System.out.println("So dead people are berried under" +
                            "\n the trees then they arose then they" +
                            "\n turned into tree zombies" + 
                            "\n then they went crazy and killed" +
                            "\n all the people.  Now you are the" +
                            "\n lone survivor and you must survive!");
        System.out.println("Go and be on your mary way!!");
                                
        level1a();
        level1b();
        level1c();
        level1d();
        /*while (lives >= 0){
           fightZombie(); 
        } */
        
        /**
         * The functions below call the last 2 stages of Level 1.
         * Add these two into your void main() function
         */
        level1e();
        level1f();       
        
    } // ends void main
    
    public static void level1a(){
        System.out.println("Level 1 : " + map[0]);
        weaponSelect();
        fightZombie();               
    }
    
    public static void level1b(){
        System.out.println("Level 1 : " + map[1]);
        fightZombie();
        fightZombie();               
    }
    
    public static void level1c(){
        System.out.println("Level 1 : " + map[2]);
        System.out.println("Walking up the hill you find another person's bag.");
        System.out.println("It has cans of food in it.");
        playerHealth = playerHealth + 50;        
    }
    
    public static void level1d(){
        System.out.println("Level 1 : " + map[3]);
        System.out.println("Here comes a horde of zombies!");
        for (int i = 0; i < 5; i++){
            fightZombie();
        }
        
        System.out.println("You survived the horde, here is your reward");
        playerHealth = playerHealth + 50;
    }
    
    /**
     * Work on completing these two functions for Thursday, April 13.
     */
    public static void level1e(){
        System.out.println("Level 1 : " + map[4]);
        //the ditch stage: pick up new weapon, auto change to weapon #2
        weapon = 2;
        weaponSelect();
        //In the future will need a way to monitor a user action/input
        // if the user wants to select a different weapon.
        
    }
    
    public static void level1f(){
        System.out.println("Level 1 : " + map[5]);
        //set endOfLevel flag to true
        //the river stage: a boss type enemy and end of level message.
        System.out.println("Here comes a BOSS zombie!");
        fightZombie();
        
        //reset endoflevel flag
        
    }
        
    public static void fightZombie(){
        System.out.println("Here comes a zombie..... be careful you might die");
        //for(int i=0; i < 3; i++){
        /*if (endOfLevel == false){
            buildZombie(); 
        }
        else{
            buildBoss(); 
        }*/
        zomb = new Zombie();  
            
        while(zomb.zombieHealth > 0){
            zomb.zombieHealth = zomb.zombieHealth - weaponDamage;
            playerHealth = playerHealth - zomb.zombieDamage;
            
            if (playerHealth <= 0){
                System.out.println("You Died!");
                lives--;
                playerHealth = 100;
                break;
            }            
            System.out.println("Player Health: " + playerHealth + "  Zombie Health: " + zomb.zombieHealth);  
        } 
        
        if (zomb.zombieHealth <= 0){
            score++;
            exp = exp + 0.5;
            zomb.zombieHealth = 60;
        }
        
        System.out.println();
        System.out.println(playerName + " status");
        System.out.println("*********************");
        System.out.println("Health: " + playerHealth);
        System.out.println("Exp: " + exp);
        System.out.println("Zombies Killed: " + score);
        System.out.println("Lives: " + lives);        
        System.out.println("*********************");
        
    }
    
    public static void weaponSelect(){
        //System.out.println("Ok, " + playerName + " select a weapon");
        //weapon = scnr.nextInt();
        
        switch (weapon){
            
            case 1:
                weaponName = "machette";
                weaponDamage = 15;
                System.out.println("Using " + weaponName + ", get ready to slice some zombies");
                break;
            
            case 2:
                weaponName = "rope of thorns";
                weaponDamage = 30;
                System.out.println("Using " + weaponName + ", wrap some necks");
                break;
                
            case 3:
                weaponName = "flame thrower";
                weaponDamage = 40;
                System.out.println("Using " + weaponName + ", a hot mess of coals");
                break;
            
            case 4:
                weaponName = "harpoon gun";
                weaponDamage = 100;
                System.out.println("Using " + weaponName + ", fish 'em");
                break;
            
            default:
                weaponName = "fists";
                weaponDamage = 10;
                System.out.println("Using " + weaponName + ", put 'em up");
            }
    }
    
} // ends class