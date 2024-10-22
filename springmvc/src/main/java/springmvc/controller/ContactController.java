package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entities.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonModelData(Model model) {
		model.addAttribute("title", "This is Registration Form");
		model.addAttribute("Desc", "Please fill your details");
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String processForm(
//
//			@RequestParam("email") String email,
//
//			@RequestParam(name = "userName", required = false) String userName,
//
//			@RequestParam("password") String password, Model model) {
//		System.out.println("The user Name is : " + userName);
//		System.out.println("The user Email is : " + email);
//		System.out.println("The user password is : " + password);
//
//		// process
//		model.addAttribute("name", userName);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
//
//		return "success";
//	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handlerForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		if (user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		int createUser = this.userService.createUser(user);
		return "success";
	}

}
