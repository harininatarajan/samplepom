package pages;

import base.LearnDriver;

public class DashboardPage extends LearnDriver {
	
/* public AdminPage clickAdminlink() {
	 
	 driver.findElementByLinkText("Admin").click();
	 return new AdminPage();
 }*/
 public Pimpage clickPIMlink()
 {
    driver.findElementByLinkText("PIM").click();
    return new Pimpage(); 
 }
}
