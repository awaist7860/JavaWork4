/**
 * Write a description of class Website here.
 * This class allows the browser to login
 * This class also checks if the browser is over the age of 18
 * This class also gives a discount to every 10th person that logs in
 * There is also a checkout method that allows the browser to checkout there wine
 * @author (Awais Tasleem) 
 * @version (2.1)
 */
import java.util.Random;

public class Website
{
     //All the variables
    private String name;
    private int hits;   //add one to hits when someone logs in
    private int salesTotal; //Keeps a running sum of the sales price.
    private boolean ageFlag = false;
    //private double takenPrice;
    
    
    public Website(String sitename1) //constructor for assigning the name of the website
    {
        name = sitename1;
        hits = 0;
        salesTotal = 0;
    }
    
    public Website()      //default constructor, makes debugging easier
    {
        name = "wine";
        hits = 0;
        salesTotal = 0;
    }
    
    public void buyerLogin(Browser browser)         //outputs the details of the logged in buyer
    {
        if(browser.getIsBuyer() == true)
        {
            //browser = browser1;
        System.out.println(name + " welcome buyer " + browser.getId() + " you are now logged in");
        //browser.setWebsite(this.name, browser.getWebsiteRef());
        browser.setWebsite(this);   //knows which browser is logged in
        hits += 1;      //adds 1 to hits
        }
        else
        {
            System.out.println("You are not logged in, please login");
        }
    }
    
    public void becomeBuyer(Browser browser)        //checks to see if the age of the buyer is over 18
    {
        if(browser.getYearOfBirth() <= 2001)
        {
            System.out.println("You are old enough to buy alcohol");
            browser.setIsBuyer(true);
            buyerLogin(browser);
            ageFlag = true;         //I put this in myself as a test, the homework doesnt need it.
            //browser.setBuyerStatus() = true;
        }
        else
        {
            System.out.println("You are too young");
            browser.setIsBuyer(false);
            ageFlag = false;        //I put this in myself as a test, the homework doesnt need it.
        }
    }
    
    
    //mutator methods
    public void changeName(String name1)
    {
        name = name1;
    }
    
    public void changeHits(int hits1)
    {
        hits = hits1;
    }
    
    public void changeSalesTotal(int sales)
    {
        salesTotal = sales;
    }
    
    
    //getter methods
    public String getName()
    {
        return name;
    }
    
    public int getHits()
    {
        return hits;
    }
    
    public int getSalesTotal()
    {
        return salesTotal;
    }
    
    
    
    public void checkout(Browser browser)
    {
        //improved and fixed
        //System.out.println("You have succefully purchased from " + browser.getWebsiteRef());
        WineCase wineCase = new WineCase();
        double takenPrice;
        if (checkHitsDiscount() == true)//hits % 10 == 0) //if hits mod 10 = 0 then do the below
        {
            takenPrice = wineCase.getPrice();
            takenPrice = takenPrice * 0.9;
            System.out.println("Congratulations you have a 10% discount on your order of " + wineCase.getRefNo() + name + takenPrice);
            salesTotal += takenPrice;
            browser.setWebsite(null);
        }
        else
        {
            System.out.println("You are purchasing " + wineCase.getRefNo() + " from " + name + " for £"+ wineCase.getPrice());
            salesTotal += wineCase.getPrice();
            browser.setWebsite(null);
            //checkHitsDiscout();
        }
    }
    
    
    //discout
    public boolean checkHitsDiscount()
    //improved and fixed
    {
        if (hits % 10 == 0) //if hits mod 10 = 0 then do the below
        {
            return true;
        }
        else{
            return false;
        }
    }
    
}
