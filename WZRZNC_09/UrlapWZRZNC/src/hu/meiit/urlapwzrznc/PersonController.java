package hu.meiit.urlapwzrznc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
	 @RequestMapping(value = "/person", method = RequestMethod.GET)
	   public ModelAndView person() {
	      return new ModelAndView("person", "command", new Person());
	   }
	   @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	      public String addPerson(@ModelAttribute("SpringWeb")Person person, 
	   
	   ModelMap model) {
	      model.addAttribute("nev", person.getNev());
	      model.addAttribute("pin", person.getPin());
	      model.addAttribute("gyumolcs", person.getGyumolcs());
	      model.addAttribute("eletkor", person.getEletkor());
	      model.addAttribute("labmeret", person.getLabmeret());
	      model.addAttribute("onbizalom", person.getOnbizalom());
	     
	      
	      return "result";
	   }
}
