package Resources.StepDefinitions;

import Framework.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    BasePage basePage;
    public Hooks(BasePage basePage){
        this.basePage = basePage;
    }
    @Before
    public void InitTest() {
        basePage.setDriver();
    }

    @After
    public void tearDownTest() {
        basePage.endDriver();
    }
}
