package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {
    @Test
    public void testSelectOptions(){
        var dropdownPage= homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions= dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1,"incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option is not selected");
    }
}
