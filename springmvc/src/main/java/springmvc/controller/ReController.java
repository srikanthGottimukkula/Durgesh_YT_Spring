package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("Good Morning !! ONE ");
//		return "/two";
//	}
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("Good Morning !! ONE ");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("Good Morning !! two ");
		return "contact";
	}

}
