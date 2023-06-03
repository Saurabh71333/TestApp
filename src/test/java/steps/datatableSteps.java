package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class datatableSteps {
	
	@Then("user enters firstname and lastname")
	public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
	   
		/*
		 * List<List<String>> data = dataTable.asLists();
		 * System.out.println("firstname : "+data.get(0).get(0)+" lastname: "+data.get(0
		 * ).get(1));
		 */
		
	/*List<Map<String, String>> map =	dataTable.asMaps();
	System.out.println("Firstname: "+map.get(0).get("FN")+" Lastname: "+map.get(0).get("LN"));
	
*/
		for (Map<String, String> data: dataTable.asMaps(String.class, String.class)) {
			
			System.out.println(data.get("FN")+" : "+data.get("LN"));
		}
		
	}
}
