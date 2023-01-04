package uk.warley.ganesh.mvc.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldContoller {

	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processform")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processform-model")
	public String processFormWithUppercase(HttpServletRequest httpServletRequest, Model model) {
		String name = httpServletRequest.getParameter("studentName");
		model.addAttribute("message","Uppercase"+ name.toUpperCase());
		return "helloworld";
	}

	@RequestMapping("/processform-model-requestparam")
	public String processFormWithUppercase(@RequestParam("studentName") String studentName, Model model) {
		model.addAttribute("message", "Use of @RequestParam"+studentName.toUpperCase());
		return "helloworld";
	}
}
