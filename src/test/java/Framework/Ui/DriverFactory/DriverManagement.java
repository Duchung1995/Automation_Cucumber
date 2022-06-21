package Framework.Ui.DriverFactory;

import org.openqa.selenium.WebDriver;

import java.sql.Time;

public abstract class DriverManagement {

    // <summary>
    /// Initializes a new instance of the Web driver using the specified path to the directory containing driver exe file and command timeout.
    /// </summary>
    /// <param name="driverPath">The full path to the directory containing exe file</param>
    /// <returns>WebDriver</returns>
     abstract WebDriver InitWebDriver();
}
