package stepDefinition;

public class StepDefinition {

	// 

	@Given("User is on cart webpage")
	public void user_is_on_cart_webpage() {
	    /*
	     * Check current webpage has the right title
	     * */
		System.out.println("GIVEN");
	}
	
	@When("There are is at least one item in cart")
	public void there_are_is_at_least_one_item_in_cart() {
		/*
	     * Make sure there is at least one item present
	     * */
		System.out.println("WHEN");
	}
	
	@Then("Console prints how many items there are in cart")
	public void console_prints_how_many_items_there_are_in_cart() {
		/*
	     * Print all items onto console
	     * */
		System.out.println("THEN");
	}
}
