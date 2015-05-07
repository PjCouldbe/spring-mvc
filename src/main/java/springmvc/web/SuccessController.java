package springmvc.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SuccessController implements Controller {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("login", request.getParameter("login"));

        modelAndView.addObject("password", request.getParameter("password"));

        return modelAndView;
    }
}
