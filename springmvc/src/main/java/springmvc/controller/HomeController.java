package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		System.out.println("Hello this is url of home!");
		model.addAttribute("name", "srikrishna is god!!");
		List<String> names = new ArrayList();
		names.add("srikanth");
		names.add("raju");
		names.add("rana");
		model.addAttribute("frds", names);
		return "home";
	}

	@GetMapping("/about")
	public String about() {
		System.out.println("Thanks!! bye bye!!");
		return "about";
	}

	@RequestMapping(path="/help",method=RequestMethod.GET)
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "srikanth_gmk");
		modelAndView.addObject("age", 21);
		LocalDateTime time = LocalDateTime.now();
		modelAndView.addObject("time", time);
		modelAndView.setViewName("help");

		List<String> list = new ArrayList();
		list.add("sri");
		list.add("go");
		list.add("jhon");
		list.add("hoof");

		modelAndView.addObject("list", list);
		return modelAndView;
	}

}
