/**
 * Write a description of class Browser here.
 * This class is where the user picks a winecase
 * and also the browser can pay for the wine
 * @author (Awais Tasleem) 
 * @version (2.1)
 */

import java.util.Random;

public class Browser
{
    //All the variables
    private int yearOfBirth;
    private String email;
    private int iD;
    private boolean isBuyer;
    private WineCase wineCase; //Pointer
    private Website website; //Pointer
    
     //browser 1
    //ID
    public Browser(int yearOfBirth1, String email1, int iD1)    //constructor for a old user
    {
        yearOfBirth = yearOfBirth1;
        email = email1;
        iD = iD1;
        isBuyer = true;
        //isBuyer = true;
    }
    
    
    //browser 2
    //No ID
    public Browser(int yearOfBirth2, String email2)     //constructor for new user
    {
        Random random = new Random();
        yearOfBirth = yearOfBirth2;
        email = email2;
        iD = random.nextInt();
        isBuyer = false;
        //isBuyer = false;
    } 
    
    public Browser()     //default constructor for new user, makes debugging easier
    {
        yearOfBirth = 1995;
        email = "awaist7860@hotmail.com";
        iD = 999;
        isBuyer = false;
    }
    
    public void setBuyerStatus(boolean isLogin)     //logs the buyer in
    {
        isBuyer = isLogin;
        //use control space after the dot notation
    }
    
    
    //getter methods
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public int getId()
    {
        return iD;
    }
    
    public boolean getIsBuyer()
    {
        return isBuyer;
    }

    //mutator methods
    
    public void seteYearOfBirth(int year)
    {
        yearOfBirth = year;
    }
    
    public void setEmail(String changeEmail)
    {
        email = changeEmail;
    }
    
    public void setId(int changeId)
    {
        iD = changeId;
    }
    
    
    public void setIsBuyer(boolean flag)
    {
        isBuyer = flag;
    }
    
    public void setWebsite(Website website1)
    {
        website = website1;
    }
    
    //come back to this
    //public void setWebsite(String name1)
    //{
        //setWebsite.changeName() = name1;
    //}
    
    public void selectWineCase(WineCase wineCase1)      //this methods selects and outputs the detail of the wine case.
    {
        //finished and improved
        if (isBuyer == true)
        {
            WineCase winecase = new WineCase();
            System.out.println("Buyer with ID: " + getId() +
            " has selected wine case with reference number:" + wineCase1.getRefNo() +
            ", a case of " + wineCase1.getDescription() + "of " + wineCase1.getNoOfBottles() + 
            " bottles" + " at £" + wineCase1.getPrice());
        }
        else
        {
            System.out.println("Please login");
        }
    }
    
    public void payForWine()        //paying for the wine method
    {
        //this is a self pointer, its pointing to itself which is the browser class
        website.checkout(this);      //pointer to itself and the wine case
        System.out.println("Thanks for shopping with us, please come again.");
        //website.checkout
    }
    
}
