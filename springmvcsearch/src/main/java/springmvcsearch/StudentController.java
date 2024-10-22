package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.model.Student;

@Controller
public class StudentController {

	@RequestMapping(path = "/handle", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("student") Student student, BindingResult results) {
//		int s = 5/0;
//		System.out.println(s);
		if (results.hasErrors()) {
			return "complex-form";
		}
		System.out.println(student + "is  Details !!");
		System.out.println(student.getAddress());
		return "success";
	}

	@RequestMapping("/complex")
	public String complex() {
//		int s = 5/0;
//		System.out.println(s);
		return "complex-form";
	}

}
