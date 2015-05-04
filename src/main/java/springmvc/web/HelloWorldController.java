package springmvc.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ayratn on 17/04/15.
 */
public class HelloWorldController implements Controller {

    public static class User {
        public String username;

        public User(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        @Override
        public String toString() {
            return this.username;
        }
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        ModelAndView modelAndView = new ModelAndView("hello_world");
        modelAndView.addObject("message", "Hello World MVC");

        modelAndView.addObject("user", new User("Ayrat"));

        return modelAndView;
    }
}