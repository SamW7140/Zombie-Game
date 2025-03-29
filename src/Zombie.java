public class Zombie
{
    public static double zombieHealth = 0;
    public static double zombieDamage = 0;
    
    /**
     * Constructor for objects of class Zombie
     */
    public Zombie()
    {
        int zombieType = (int)(Math.random() * 101);
        System.out.println("Zombie Type value: " + zombieType);
        //int randomNum = (int)(Math.random() * 101);  // 0 to 100
        
        String zombieName = "";
        
        if (zombieType <= 51){
            zombieName = "Basic Zombie";
            zombieHealth = 20;
            zombieDamage = 10;
            System.out.println(zombieName + " is attacking you!");
        }
        else if (zombieType >= 52 && zombieType <= 62){
            zombieName = "Fat Zombie";
            zombieHealth = 40;
            zombieDamage = 15;
            System.out.println(zombieName + " is attacking you!");
        }
        else if (zombieType >= 63 && zombieType <= 84){
            zombieName = "Fire Zombie";
            zombieHealth = 50;
            zombieDamage = 30;
            System.out.println(zombieName + " is attacking you!");
        }
        else if (zombieType >= 85 && zombieType <= 100){
            zombieName = "Crack Zombie";
            zombieHealth = 100;
            zombieDamage = 15;
            System.out.println(zombieName + " is attacking you!");
        }
        
    }      
     
    public int zombieDOT(int y)
    {
        // put your code here
        return y;
    }
}
