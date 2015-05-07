package springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;

@Controller
@RequestMapping("/login.html")
public class LoginController {
	@ModelAttribute("user")
    public User getUserObject() {
        return new User();
    }
	
	@RequestMapping(method = RequestMethod.GET)
    public String initializeForm(ModelMap model) {
        System.out.println("LOGIN FORM OPENED! ");
        return "login";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String onSubmit(
            @ModelAttribute("user")User user,
                          BindingResult result,
                          ModelMap model
            ) {
    	System.out.println(user.getPassword());
    	return "redirect:success.html?login=" + user.getLogin() + "&password=" + user.getPassword();
    }
}
