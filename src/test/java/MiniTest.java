public class MiniTest {

    @Test
    public void simpleTest() {
        //Setup ChromeDriver path update this to your chromedriver location
        System.setProperty(key: "webdriver.chrome.driver", value:"./chromedriver.exe");
    
        // Initialize browser
        WebDriver driver = new ChromeDriver();
    
        try {

            // Open Google

            driver.get("https://www.google.com");
    
            // Print the page title to console
         System.out.println("Successfully opened:" + driver.getTitle());
    
        } 
    
        finally {
            // Close browser
            driver.quit();
        }
    }

}