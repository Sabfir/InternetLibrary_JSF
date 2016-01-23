package ua.javabegin.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "login_controller")
@RequestScoped
public class LoginController {

    public LoginController() {
    }

    public String login() {
        return "navigation_rule_books";
    }
    
}
