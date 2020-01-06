package co.uk.zoopla.hooks;

import co.uk.zoopla.common.BrowserClass;;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BrowserClass
{
    private String chromeBrowser = "Chrome";
   @Before
    public void setUp()
   {
       launchBrowser("chromeBrowser");
   }

   @After
    public void tearDown()
   {
       closeBrowser();
   }
}
