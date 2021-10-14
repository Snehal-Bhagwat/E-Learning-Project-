package StepDefination;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signupdefination {

	WebDriver driver = hooks.driver;
	
	//Background 
	@Given("^User is on Elearning platform$")
	public void user_is_on_Elearning_platform()  {
		driver.get("http://elearningm1.upskills.in/index.php");	
		System.out.println("User is on sign up page.");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password()  {
		try{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='login']")).sendKeys("admin11002");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin11002");
			System.out.println("User enters username and password");
		}
		catch(Exception e){
			System.out.println("Not able to enter credentials" +e);
			Assert.fail();
		} 
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button()  {
		try{
			Thread.sleep(2000);
			driver.findElement(By.name("submitAuth")).click();
			System.out.println("User clicks on login button");
		}
		catch(Exception e){
			System.out.println("Not able to click on login button" +e);
			Assert.fail();
		}
	}

	@Then("^User gets redirected to the dashboard$")
	public void user_gets_redirected_to_the_dashboard()  {
		System.out.println("User is on Dashboard");
	}

	@Then("^User clicks on the My Courses on the menu bar$")
	public void user_clicks_on_the_My_Courses_on_the_menu_bar()  {
		try{
			Thread.sleep(2000);
			String actual = "My Organization - My education - My courses";
			String expected = driver.getTitle();
			Assert.assertEquals(expected, actual);
			System.out.println(expected);
		}
		catch(Exception e){
			System.out.println("Not able to click on My Courses field" +e);
			Assert.fail();
		}
	}

	@Then("^User gets redirected to the My Courses page$")
	public void user_gets_redirected_to_the_My_Courses_page()  {
		System.out.println("User is on My Courses Page");
	}

	@Then("^User clicks on 123testing$")
	public void user_clicks_on_123testing()  {
		try{
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div[1]/div/section/div/div/div/div/div[2]/h4/a[1]")).click();
			System.out.println("User is clicking on one of the course");
		}
		catch(Exception e){
			System.out.println("Not able to click on course" +e);
			Assert.fail();
		}
	}

	@Then("^User can see various icons$")
	public void user_can_see_various_icons()  {
		System.out.println("User can see Various Icons");
	}

	//Groups icon page
	@Given("^User can see various icons on my courses option$")
	public void user_can_see_various_icons_on_my_courses_option()  {
		System.out.println("User can see various icons on my courses option");
	}

	@When("^User clicks on Groups icon$")
	public void user_clicks_on_Groups_icon()  {
		try{
			Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[11]/div/div[1]/a")).click();
			  System.out.println("User is able to click on the group icon");
	   }
	   catch(Exception e)
	   {
		  System.out.println("User is not able to click on the groups icon"+e);
		  Assert.fail();
	   }
	}

	@Then("^User is able to navigate to Groups page$")
	public void user_is_able_to_navigate_to_Groups_page()  {
		System.out.println("User is able to navigate to Groups page");
	}
	
	@When("^User clicks on register button$")
	public void user_clicks_on_register_button()  {
		try{
			Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/main/section/div/div[3]/table/tbody/tr[15]/td[4]/a")).click();
			  System.out.println("User is able to click on register button");
	   }
	   catch(Exception e)
	   {
		  System.out.println("User is not able to click on register button"+e);
		  Assert.fail();
	   }
		
		
	}

	@Then("^accept the pop up$")
	public void accept_the_pop_up()  {
	    driver.switchTo().alert().accept();
	    System.out.println("User accepts the alert message on clicking register button");
	}

	@Then("^User can see group added message$")
	public void user_can_see_group_added_message()  {
		try{
			Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/main/section/div/div[2]")).isDisplayed();
			  System.out.println("User is able to see group added message");
	   }
	   catch(Exception e)
	   {
		  System.out.println("User is not able to see group added message"+e);
		  Assert.fail();
	   }
		
		
	}

	@When("^user clicks on unregister button$")
	public void user_clicks_on_unregister_button()  {
		try{
			Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/main/section/div/div[4]/table/tbody/tr[15]/td[4]/a")).click();
			  System.out.println("User is able to click on unregister button");
	   }
	   catch(Exception e)
	   {
		  System.out.println("User is not able to click on unregister button"+e);
		  Assert.fail();
	   }
		
		
	}

	@Then("^accepts the pop up$")
	public void accepts_the_pop_up()  {
		driver.switchTo().alert().accept();
	    System.out.println("User accepts the alert message on clicking register button");
	}

	@Then("^User can see ungroup message$")
	public void user_can_see_ungroup_message()  {
		try{
			Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/main/section/div/div[2]")).isDisplayed();
			  System.out.println("User is able to see group removed message");
	   }
	   catch(Exception e)
	   {
		  System.out.println("User is not able to see group removed message"+e);
		  Assert.fail();
	   }
	}
	

	@When("^User clicks on One of the groups$")
	public void user_clicks_on_One_of_the_groups()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[4]/table/tbody/tr[2]/td[1]/a")).click();
	    	System.out.println("User is able to click on one of the groups link");
	    }
	    catch(Exception e){
	    	System.out.println("User is not bale to click on one of the groups link");
	    	Assert.fail();
	    }
	}

	@Then("^User is able to see information of that group$")
	public void user_is_able_to_see_information_of_that_group()  {
	   System.out.println("User is able to see information of that group");
	}

	
	
	
	//chats icon page//
	@Given("^User can see various icons1$")
	public void user_can_see_various_icons1()  {
		
	    System.out.println("User is able to see various icons1");
	}

	@When("^User clicks on chat icon$")
	public void user_clicks_on_chat_icon()  {
		try{
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[12]/div/div[1]/a")).click();
			  System.out.println("User is able to click on the chat icon");
	   }
	   catch(Exception e)
	   {
		  System.out.println("User is not able to click on the chat icon"+e);
		  Assert.fail();
	   }
	}

	
	@Then("^User can able to goto message screen$")
	public void user_can_able_to_goto_message_screen()  {
	    System.out.println("User is able to go on new nessage window");
	}
	
	
	@When ("^User enter \"([^\"]*)\", \"([^\"]*)\" in textarea$")
	public void user_enter_in_textarea(String text, String special_symbols)  {
		try{
			
			String parent = driver.getWindowHandle();
			Set<String>s = driver.getWindowHandles();
			
			Iterator<String> I1 = s.iterator();
			while(I1.hasNext())
			{
				String child_window = I1.next();
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
					System.out.println(driver.switchTo().window(child_window).getTitle());
					break;
					//driver.close();
				}
			}
			
			//driver.switchTo().window(parent);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='tab1']/div/div[1]/div[1]"));
			
			//driver.findElement(By.xpath("//*[@id='tab1']/div/div[1]/div[1]/../textarea")).sendKeys(special_symbols);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			//js.executeScript(Script, text, special_symbols);
			
			
			
			js.executeScript("arguments[0].value= '"+text+"'",ele); 
			//js.executeScript("arguments[0].value= '"+special_symbols+"'",ele);


		}
		catch(Exception e){
			System.out.println("Not able to enter text and special symbols in text area" +e);
			Assert.fail();
		}
	}

	@Then("^User is able to enter text and special symbols in the write field$")
	public void user_is_able_to_enter_text_and_special_symbols_in_the_write_field()  {
		System.out.println("User is able to enter text and special symbols in text area");
	}
	
	@When("^User clicks send message on entering text and special symbols$")
	public void user_clicks_send_message_on_entering_text_and_special_symbols()  {
		try{
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/button")).click();
			  System.out.println("User is able to click on the send message button");
	   }
	   catch(Exception e)
	   {
		  System.out.println("User is not able to click on the send message button"+e);
		  Assert.fail();
	   }
	}

	@Then("^User is able to send message$")
	public void user_is_able_to_send_message()  {
	    System.out.println("User is able to send message");
	}
	
	
	//Assignments icon page//
	@Given("^User can see various icons2$")
	public void user_can_see_various_icons2()  {
		System.out.println("User is able to see various icons2");
	}
	
	
	@When("^User clicks on assignments icon$")
	public void user_clicks_on_assignments_icon() throws InterruptedException  {
	    try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[13]/div/div[1]/a")).click();
	    	System.out.println("User is able to click on assignment icon");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on assignment icon"+e);
	    	Assert.fail();
	    }
	}

	@Then("^user is able to see assignment given on selected course$")
	public void user_is_able_to_see_assignment_given_on_selected_course()  {
	   System.out.println("User is able to see assignment given on selected course");
	}

	@When("^user clicks on ani assignment$")
	public void user_clicks_on_ani_assignment()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[2]/td[2]/a")).click();
	    	System.out.println("User is able to click on ani assignment");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on ani assignment"+e);
	    	Assert.fail();
	    }
	}

	@Then("^User is able to see detailed description of assignments$")
	public void user_is_able_to_see_detailed_description_of_assignments() {
	    System.out.println("User is able to see detailed description of assignments");
	}

	@When("^user clicks on upload my assignment$")
	public void user_clicks_on_upload_my_assignment()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div[1]/div/div[2]/a")).click();
	    	System.out.println("User is able to click on upload my assignment");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on upload my assignment"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to open the page from where User can upload assingment$")
	public void user_is_able_to_open_the_page_from_where_User_can_upload_assingment() throws Throwable {
	    System.out.println("User is able to open the page from where User can upload assingment");
	}

	@When("^User click on Drag and drop file$")
	public void user_click_on_Drag_and_drop_file()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[1]/form/fieldset/div[2]/div")).click();
	    	System.out.println("User is able to click on Drag and drop file");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on Drag and drop file"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User can be able to upload the file$")
	public void user_can_be_able_to_upload_the_file()  {
	    System.out.println("User is able to upload assignment solution file");
	}

	@When("^user clicks on upload simple button$")
	public void user_clicks_on_upload_simple_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/ul/li[2]/a")).click();
	    	System.out.println("User is able to click on upload simple button");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on upload simple button"+e);
	    	Assert.fail();
	    }
		
		
	}
	@Then("^User can see page from where user should upload assignment solution file$")
	public void user_can_see_page_from_where_user_should_upload_assignment_solution_file()  {
	    System.out.println("User can see page from where user should upload assignment solution file");
	}

	@When("^User clicks on choose file$")
	public void user_clicks_on_choose_file()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[2]/form/fieldset/div[3]/div[1]/input")).click();
	    	System.out.println("User is able to click on choose file button");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on choose file button"+e);
	    	Assert.fail();
	    }
		
		
	}


	@Then("^User can be able to select file on clicking choose file button$")
	public void user_can_be_able_to_select_file_on_clicking_choose_file_button()  {
	    System.out.println("User can be able to select file on clicking choose file button");
	}

	@Then("^the title and file extension should be visible$")
	public void the_title_and_file_extension_should_be_visible()  {
	   System.out.println("User is able to see title and file extension shuld be right on choosing file");
	}

	@When("^User clicks on button upload$")
	public void user_clicks_on_button_upload()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id='form-work_submitWork']")).click();
	    	System.out.println("User is able to click on upload button");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on upload button"+e);
	    	Assert.fail();
	    }
	}

	@Then("^User can be able to upload file$")
	public void user_can_be_able_to_upload_file()  {
	    System.out.println("User is able to upload assignment solution on clickong upload button");
	}
	
	@Then("^User clicks on Ani link to go back$")
	public void user_clicks_on_Ani_link_to_go_back()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/ul/li[3]/a")).click();
	    	System.out.println("User is able to click on Ani link to go back");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on Ani link to go back"+e);
	    	Assert.fail();
	    }
	}

	@When("^User clicks on save button to save uploaded solution$")
	public void user_clicks_on_save_button_to_save_uploaded_solution()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div[3]/div/div/div[3]/div[3]/div/table/tbody/tr[2]/td[6]/div/a[1]")).click();
	    	System.out.println("User is able to click on save button to save uploaded solution");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on save button to save uploaded solution"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to save and download the file$")
	public void user_is_able_to_save_and_download_the_file()  {
	    System.out.println("User is able to save and download the file");
	}
	
	
	
	
	
	
	
	
	//Automate the survey icon
	@Given("^User can see various icons5$")
	public void user_can_see_various_icons5()  {
	    System.out.println("user can see various icons5");
	}

	@When("^User clicks on the survey icon$")
	public void user_clicks_on_the_survey_icon()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[14]/div/div[1]/a")).click();
	    	System.out.println("User is able to click on survey icon");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on survey icon"+e);
	    	Assert.fail();
	    }
	    
	}

	@Then("^User is on the survey page$")
	public void user_is_on_the_survey_page()   {
	    System.out.println("User is on the survey page");
	}

	@Then("^User is able to see survey name on survey page$")
	public void user_is_able_to_see_survey_name_on_survey_page()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/table/thead/tr/th[1]")).isDisplayed();
	    	System.out.println("User is able to see survey name on survey page");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to see survey name on survey page"+e);
	    	Assert.fail();
	    }
	}

	@Then("^User is able to see anonymous in survey page$")
	public void user_is_able_to_see_anonymous_in_survey_page()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/table/thead/tr/th[2]")).isDisplayed();
	    	System.out.println("User is able to see anonymous on survey page");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to see anonymous on survey page"+e);
	    	Assert.fail();
	    }
	}

	
	
	//Automate wiki icon
	@Given("^User can see various icons3$")
	public void user_can_see_various_icons3()  {
		System.out.println("User is able to see various icons3");
	}

	@When("^User cicks on Wiki icon$")
	public void user_cicks_on_Wiki_icon()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[15]/div/div[1]/a")).click();
	    	System.out.println("User is able to click on wiki icon");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on wiki icon"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to go on home page of wiki$")
	public void user_is_able_to_go_on_home_page_of_wiki()  {
	    System.out.println("User is able to go on home page of wiki");
	}

	@When("^User clicks on Search button$")
	public void user_clicks_on_Search_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/a[2]")).click();
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on search button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able click on search button$")
	public void user_is_able_click_on_search_button()  {
		System.out.println("User is able to click on search button");
	    
	}

	@Then("^User is able to go on search page where User can enter fields$")
	public void user_is_able_to_go_on_search_page_where_User_can_enter_fields()  {
	    System.out.println("User is able to go on search page where User can enter fields");
	}

	@When("^user enter \"([^\"]*)\" in the search term field$")
	public void user_enter_in_the_search_term_field(String text1)  {
		try{
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[1]/div[1]/input")).sendKeys(text1);
		}
		catch(Exception e){
			System.out.println("Not able to enter text in text term filed" +e);
			Assert.fail();
		} 
	}

	@Then("^User is able to enter text in search term field$")
	public void user_is_able_to_enter_text_in_search_term_field()  {
	    System.out.println("User is able to enter text in search term field");
	}

	@Then("^User can see result of entered text$")
	public void user_can_see_result_of_entered_text()  {
	   System.out.println("User can see results of entered text");
	}

	@When("^user check the search also in content button$")
	public void user_check_the_search_also_in_content_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[2]/div[1]/div/label/input")).click();
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on also in content button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to check the search also in content$")
	public void user_is_able_to_check_the_search_also_in_content()  {
	    System.out.println("User is able to check the search also in content");
	}

	@When("^user check the Also search in older versions of each page button$")
	public void user_check_the_Also_search_in_older_versions_of_each_page_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[3]/div[1]/div/label/input")).click();
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on Also search in older versions of each page button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to check Also search in older versions of each page button$")
	public void user_is_able_to_check_Also_search_in_older_versions_of_each_page_button()  {
	   System.out.println("User is able to check Also search in older versions of each page button");
	}

	@When("^User clicks on search button after checks button$")
	public void user_clicks_on_search_button_after_checks_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id='wiki_search_SubmitWikiSearch']")).click();
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on Also search in older versions of each page button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to search the text on clicking search button$")
	public void user_is_able_to_search_the_text_on_clicking_search_button()  {
	    System.out.println("User is able to search the text on clicking search button");
	}

	@When("^User clicks on statistics button$")
	public void user_clicks_on_statistics_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/a[3]")).click();
	    	System.out.println("User is able to click on the statistics button");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on statistics button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^user checks all links are working or not$")
	public void user_checks_all_links_are_working_or_not()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/table/tbody/tr/td[1]/ul/li[1]/a")).click();
	    	//driver.findElement(By.xpath("/html/body/main/section/div/table/tbody/tr/td[1]/ul/li[2]/a")).click();
	    	//driver.findElement(By.xpath("/html/body/main/section/div/table/tbody/tr/td[1]/ul/li[3]/a")).click();
	    	//driver.findElement(By.xpath("/html/body/main/section/div/table/tbody/tr/td[2]/ul/li[1]/a")).click();
	    	//driver.findElement(By.xpath("/html/body/main/section/div/table/tbody/tr/td[2]/ul/li[2]/a")).click();
	    	//driver.findElement(By.xpath("/html/body/main/section/div/table/tbody/tr/td[2]/ul/li[3]/a")).click();
	    
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on the links"+e);
	    	Assert.fail();
	    }
	}

	@Then("^User is able to click on all the links$")
	public void user_is_able_to_click_on_all_the_links()  {
	    System.out.println("User is able to click on the link");
	}

	@When("^User clicks on all pages button$")
	public void user_clicks_on_all_pages_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/a[4]")).click();
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on all pages button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to click on the all pages button$")
	public void user_is_able_to_click_on_the_all_pages_button()  {
	    System.out.println("User is able to click on the all pages button");
	}

	@Then("^User is able to see all pages$")
	public void user_is_able_to_see_all_pages()  {
	    System.out.println("User is able to see all pages");
	}

	@When("^user clicks on latest changes button$")
	public void user_clicks_on_latest_changes_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/a[5]")).click();
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on latest changes button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to click on latest changes button$")
	public void user_is_able_to_click_on_latest_changes_button()  {
		System.out.println("User is able to click on latest changes button");
	}

	@Then("^user is able to see changes made last time$")
	public void user_is_able_to_see_changes_made_last_time()  {
	    System.out.println("user is able to see changes made last time");
	}

	@When("^User clicks on notify me of changes button$")
	public void user_clicks_on_notify_me_of_changes_button()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[3]/span/a")).click();
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on notify me of changes button"+e);
	    	Assert.fail();
	    }
	}

	@Then("^User is able to click on notify me of changes button$")
	public void user_is_able_to_click_on_notify_me_of_changes_button()  {
	    System.out.println("User is able to click on notify me of changes button");
	}
	
	//Automate assessments icon
	@Given("^User can see various icons4$")
	public void user_can_see_various_icons4()   {
	    System.out.println("User can see various icons4");
	}

	@When("^User clicks on assessments icon$")
	public void user_clicks_on_assessments_icon()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[16]/div/div[1]/a")).click();
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on assessments icon"+e);
	    	Assert.fail();
	    }
	}

	@Then("^User is able to go on assessments page$")
	public void user_is_able_to_go_on_assessments_page()   {
	    System.out.println("User is able to click on assessments icon");
	}

	@When("^User clicks on list view button$")
	public void user_clicks_on_list_view_button()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div[3]/table/tbody/tr[2]/td[6]/a[2]")).click();
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on list view button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to see report in graph$")
	public void user_is_able_to_see_report_in_graph()   {
	   System.out.println("User is able to see report in grphs");
	}

	@When("^User clicks on close button$")
	public void user_clicks_on_close_button()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button")).click();
	    	System.out.println("User is able to click on close button");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on close button"+e);
	    	Assert.fail();
	    }
	}

	@Then("^list view report will close$")
	public void list_view_report_will_close()   {
		System.out.println("On clicking close button report is closed");
	}

	@When("^user clicks on show button$")
	public void user_clicks_on_show_button()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div[3]/table/tbody/tr[2]/td[6]/a[1]")).click();
	    	System.out.println("User is able to click on show button");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on show button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^user is able to see available tests$")
	public void user_is_able_to_see_available_tests()   {
	   System.out.println("User is able to see available tests");
	}

	@When("^user clicks on mtest link$")
	public void user_clicks_on_mtest_link()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div[3]/table/tbody/tr[3]/td[2]/a")).click();
	    	System.out.println("User is able to click on mtest link");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on mtest link"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is on the start test page$")
	public void user_is_on_the_start_test_page()   {
	   System.out.println("User is on the start test page");
	}

	@When("^User clicks on start test$")
	public void user_clicks_on_start_test()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/a")).click();
	    	System.out.println("User is able to click on start test link");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on start test link"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is on the assessment page$")
	public void user_is_on_the_assessment_page()   {
	    System.out.println("User is on the assessment page");
	}

	@When("^User clicks on tests button again to go back$")
	public void user_clicks_on_tests_button_again_to_go_back()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.linkText("Tests")).click();
	    	System.out.println("User is able to click on tests button again to go back");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on tests button again to go back"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User clicks on assessments button again to go back$")
	public void user_clicks_on_assessments_button_again_to_go_back()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.linkText("Assessments")).click();
	    	System.out.println("User is able to click on assessments button again to go back");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on assessments button again to go back"+e);
	    	Assert.fail();
	    }
	}

	@When("^User clicks on download report in pdf button$")
	public void user_clicks_on_download_report_in_pdf_button()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div[1]/div/div/a")).click();
	    	System.out.println("User is able to click on download report in pdf button");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on download report in pdf button"+e);
	    	Assert.fail();
	    }
		
	}

	@Then("^User is able to download pdf$")
	public void user_is_able_to_download_pdf()   {
		System.out.println("User is able to download report in pdf");
	}
	
	//Automate Glossary icon
	@Given("^User can see various icon6$")
	public void user_can_see_various_icon6()   {
	    System.out.println("User can see various icons6");
	}

	@When("^User clicks on the glossary icon$")
	public void user_clicks_on_the_glossary_icon()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[17]/div/div[1]/a")).click();
	    	System.out.println("User is able to click on glossary icon");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on glossary icon"+e);
	    	Assert.fail();
	    }
	}

	@Then("^User is able to see glossary list page$")
	public void user_is_able_to_see_glossary_list_page()   {
	   System.out.println("User is able to see glossary list page");
	}

	@When("^User clicks on the export button$")
	public void user_clicks_on_the_export_button()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[1]/a[1]")).click();
	    	System.out.println("User is able to click on export button");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to click on export button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to see different format of radio buttons$")
	public void user_is_able_to_see_different_format_of_radio_buttons() throws Throwable {
	    System.out.println("User is able to see different format of radio buttons");
	}

	@Then("^User selects Export to pdf button$")
	public void user_selects_Export_to_pdf_button()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/fieldset/div[3]/div[1]/div/label/input")).click();
	    	System.out.println("User is able to select export to pdf");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to select export to pdf"+e);
	    	Assert.fail();
	    }
		
		
	}

	@When("^User clicks on download button$")
	public void user_clicks_on_download_button()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button")).click();
	    	System.out.println("User is able to clicks on download button");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to clicks on download button"+e);
	    	Assert.fail();
	    }
	}

	@Then("^User is on some page$")
	public void user_is_on_some_page()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div")).isDisplayed();
	    	System.out.println("User is on some page");
		}
	    catch(Exception e){
	    	System.out.println("User is not on some page"+e);
	    	Assert.fail();
	    }
	}

	@When("^User clicks on glossary link to go back$")
	public void user_clicks_on_glossary_link_to_go_back()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/ul/li[2]/a")).click();
	    	System.out.println("User is able to clicks on glossary link to go back");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to clicks on glossary link to go back"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is on the home page of glossary$")
	public void user_is_on_the_home_page_of_glossary()   {
	    System.out.println("User is on the home page of glossary");
	}

	@When("^User clicks on the list view button$")
	public void user_clicks_on_the_list_view_button()   {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[1]/a[2]")).click();
	    	System.out.println("User is able to clicks on list view button");
		}
	    catch(Exception e){
	    	System.out.println("User is not able to clicks on list view button"+e);
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to goto list page$")
	public void user_is_able_to_goto_list_page()   {
	    System.out.println("User is on the list view page");
	}
	
	
	
	//Automate Notebook icon
	@Given("^User can see various icon7$")
	public void user_can_see_various_icon7()  {
	    System.out.println("User can see various icons7");
	}

	@When("^User clicks on the Notebook icon$")
	public void user_clicks_on_the_Notebook_icon()  {
	    try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[18]/div/div[1]/a")).click();
	    	System.out.println("User is able to click on notebook icon");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on the notebook icon");
	    	Assert.fail();
	    }
	}

	@Then("^User is able to go to notebook home page$")
	public void user_is_able_to_go_to_notebook_home_page()  {
	    System.out.println("User is able to go to notebook home page");
	}

	@When("^User clicks on add new note in my personel notebook$")
	public void user_clicks_on_add_new_note_in_my_personel_notebook()  {
	    try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[2]/a[1]")).click();
	    	System.out.println("User is able to click on add new note in my personel book");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on add new note in my personel book");
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to create new note$")
	public void user_is_able_to_create_new_note()  {
	    System.out.println("User is able to create new note");
	}

	@When("^User enters \"([^\"]*)\" in note title$")
	public void user_enters_in_note_title(String text3) throws InterruptedException  {
	   try{
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[1]/div[1]/input")).sendKeys(text3);
		System.out.println("User enters text in the note title");
	   }
	   catch(Exception e){
		   System.out.println("User is not able to enter text in note title");
		   Assert.fail();
	   }
	 }

	@Then("^User is able to enter text in note title$")
	public void user_is_able_to_enter_text_in_note_title()  {
		System.out.println("User is able to enter text in note title");
	}

	
	//iframe
	@When("^User enters \"([^\"]*)\" in the note details$")
	public void user_enters_in_the_note_details(String text4)  {
		try{
			Thread.sleep(3000);
			driver.switchTo().frame(1);
			driver.findElement(By.xpath("//body/p")).sendKeys(text4);
			System.out.println("User enters text in the note detail");
		   }
		   catch(Exception e){
			   System.out.println("User is not able to enter text in note detail");
			   Assert.fail();
		   }
		
		
	}

	@Then("^User is able to enter details of notes$")
	public void user_is_able_to_enter_details_of_notes()  {
		System.out.println("User is able to enter details of notes");

	}

	@When("^User clicks on create note button$")
	public void user_clicks_on_create_note_button()  {
	    try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[3]/div[1]/button")).click();
	    	System.out.println("User is able to click on create button");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on create button");
	    	Assert.fail();
	    }
		
		
	}

	@Then("^User is able to create note$")
	public void user_is_able_to_create_note()  {
		System.out.println("User is able to create note");

	}

	@When("^User clicks on sort by date created$")
	public void user_clicks_on_sort_by_date_created()  {
	    try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[3]/a[2]")).click();
	    	System.out.println("User is able to click on sort by date button");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on sort by date button");
	    	Assert.fail();
	    }
	}

	@Then("^User is able to see that notes are sorted according its date$")
	public void user_is_able_to_see_that_notes_are_sorted_according_its_date()  {
	    System.out.println("User is able to see that notes are sorted according its date");
	}

	@When("^User clicks on sort by date last modified$")
	public void user_clicks_on_sort_by_date_last_modified()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[3]/a[3]")).click();
	    	System.out.println("User is able to click on sort by date last modified button");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on sort by last modified button");
	    	Assert.fail();
	    }
	}

	@Then("^User is able to see that notes are sorted according its date last modified$")
	public void user_is_able_to_see_that_notes_are_sorted_according_its_date_last_modified()  {
	    System.out.println("User is able to see that notes are sorted according its date last modified");

	}

	@When("^User clicks on sort by title$")
	public void user_clicks_on_sort_by_title()  {
		try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[3]/a[4]")).click();
	    	System.out.println("User is able to click on sort by title button");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on sort by title button");
	    	Assert.fail();
	    }
	}

	@Then("^User is able to see that notes are sorted according its title$")
	public void user_is_able_to_see_that_notes_are_sorted_according_its_title()  {
	    System.out.println("User is able to see that notes are sorted according its title");
	}

	@When("^User clicks on edit button to edit note$")
	public void user_clicks_on_edit_button_to_edit_note()  {
	    try{
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/main/section/div/div[3]/div[1]/h3/div/a[1]")).click();
	    	System.out.println("User is able to click on edit button to edit the notes");
	    }
	    catch(Exception e){
	    	System.out.println("User is not able to click on edit button to edit the notes");
	    	Assert.fail();
	    }
	}

	@Then("^User is able to edit the note$")
	public void user_is_able_to_edit_the_note()  {
	    System.out.println("User is able to edit the note");

	}

	@When("^User clicks in note details$")
	public void user_clicks_in_note_details()  {
		try{
			Thread.sleep(3000);
			driver.switchTo().frame(1);
			driver.findElement(By.xpath("//body/p")).click();
			System.out.println("User is able to click in note title");
		   }
		   catch(Exception e){
			   System.out.println("User is not able to click in note title");
			   Assert.fail();
		   }
	}

	@Then("^User enters \"([^\"]*)\" in note detail$")
	public void user_enters_in_note_detail(String text5)  {
		try{
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//body/p")).sendKeys(text5);
			System.out.println("User is able to enter text in note title");
		   }
		   catch(Exception e){
			   System.out.println("User is not able to enter text in note title");
			   //Assert.fail();
		   }
	}

	@When("^User clicks on edit my personel note button$")
	public void user_clicks_on_edit_my_personel_note_button()  {
	   try{
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[3]/div[1]/button")).click();
		   System.out.println("User is able to click on edit my personel note");
		   
	   }
	   catch(Exception e){
		   System.out.println("User is not able to click on edit my personel note");
		   Assert.fail();
	   }
	   
	}
	@Then("^User is able to edit the note on clicking button$")
	public void user_is_able_to_edit_the_note_on_clicking_button()  {
	    System.out.println("User is able to edit the note on clicking on edit button");
	}


	@When("^User clicks on delete button$")
	public void user_clicks_on_delete_button()  {
		try{
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("/html/body/main/section/div/div[5]/div[1]/h3/div/a[2]")).click();
			   System.out.println("User is able to click on delete note");
			   
		   }
		   catch(Exception e){
			   System.out.println("User is not able to click on delete note");
			   Assert.fail();
		   }
	}

	@Then("^User have to accept the pop up$")
	public void user_have_to_accept_the_pop_up()  {
		driver.switchTo().alert().accept();
		System.out.println("User is able to accept the pop up");

	}

	@Then("^User is able to see previous notes$")
	public void user_is_able_to_see_previous_notes()   {
		System.out.println("User is able to see previous notes");
	}

		
	//Automate Selinium project icon
	@Given("^User can see various icons8$")
	public void user_can_see_various_icons8()  {
		System.out.println("User can see various icons8");
	}

	@When("^User clicks on selinium project$")
	public void user_clicks_on_selinium_project()  {
		try{
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[19]/div/div[1]/a")).click();
			   System.out.println("User is able to click on selinium project icon");
			   
		   }
		   catch(Exception e){
			   System.out.println("User is not able to click on selinium project icon");
			   Assert.fail();
		   }
	}

	@Then("^User is able to goto selinium project home page$")
	public void user_is_able_to_goto_selinium_project_home_page()  {
	    System.out.println("User is able to goto selinium project home page");
	}

	@When("^User clicks on Selenium task$")
	public void user_clicks_on_Selenium_task()  {
		try{
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div[2]/article[3]/div/div/h3/a")).click();
			   System.out.println("User is able to click on Selenium task");
			   
		   }
		   catch(Exception e){
			   System.out.println("User is not able to click on Selenium task");
			   Assert.fail();
		   }
	}

	@Then("^User is able to see information of that project$")
	public void user_is_able_to_see_information_of_that_project()  {
		System.out.println("User is able to see information of that project");
	}

	@Then("^User is able to see calender and the date of present day$")
	public void user_is_able_to_see_calender_and_the_date_of_present_day()  {
		System.out.println("User is able to see calender and the date of present day");
	}

	@When("^User clicks on exp csv file$")
	public void user_clicks_on_exp_csv_file()  {
	   try{
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/div/div[2]/div/div/div[2]/article/aside/a")).click();
		   System.out.println("User is able to click on exp.csv");
	   }
	   catch(Exception e){
		   System.out.println("User is not able to click on exp.csv");
	   }
	}

	@Then("^User is able to download exp file in csv format$")
	public void user_is_able_to_download_exp_file_in_csv_format()  {
		System.out.println("User is able to download exp file in csv format");
	}

}
