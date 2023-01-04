package uk.warley.ganesh.mvc.springdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentContoller {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

//	@RequestMapping("/showform")
//	public ModelAndView showForm() {
////		model.addAttribute("student",new Student()); //OR 
//		return new ModelAndView("student-form", "student", new Student());
//	}
	// OR

	@RequestMapping("/showform")
	public String showForm(Model model) {
//		model.addAttribute("student",new Student());//Option-1
		Student student = new Student();
		model.addAttribute("student", new Student());// Option-2
		model.addAttribute("countryList", countryOptions);// Option-2
		return "student-form";
	}

	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "student-confirmation";
	}
}
