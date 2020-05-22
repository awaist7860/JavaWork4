/**
 * Write a description of class Test here.
 * This tests all the other classes automaticly so that i
 * dont have to do it and so that i dont miss anything.
 * @author (Awais Tasleem)
 * @version (1.0)
 */
public class Test
{
    Browser browser;    //reference to browser
    Website website;    //reference to website
    WineCase winecase;  //refference to winecase
    
    /**
    * Constructor for objects of class Test
    */
    public Test()
    {
        // creation of the Browser object     
        browser = new Browser(1990, "student@salford.edu.ac.uk", 6732);     
      
        // checking method setBuyerStatus
        browser.setBuyerStatus(true);
        //browser.payForWine();
    
        // creation of the Website object
        website = new Website("my website");
        
        // checking method buyerLogin
        website.buyerLogin(browser);
        //checking method checkout
        website.checkout(browser);
      
        //creation of the WineCase object
        winecase = new WineCase("012abc", "Promontory 2013, Napa Valley", 5, 530.00);
      
    }

   
}