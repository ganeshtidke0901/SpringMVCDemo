package uk.warley.ganesh.mvc.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerContoller {

	@RequestMapping("/showform")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processform")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		System.out.println("Last Name \"" + customer.getLastName() + "\"");
		System.out.println("Free Passes\"" + customer.getFreePasses() + "\"");
		System.out.println(bindingResult);
		if (bindingResult.hasErrors()) {
			return "customer-form";
		}
		return "customer-confirmation";
	}

	@InitBinder // this method will be called for every request coming to this controller
	public void addCustomProcessorForRequestDataValidation(WebDataBinder binder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
		// this will trim down empty spaces to null value
	}

}
