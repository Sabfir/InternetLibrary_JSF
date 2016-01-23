package ua.javabegin.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.ResourceBundle;

@FacesValidator("ua.javabegin.validators.LoginValidator")
public class LoginValidator implements Validator {

    @Override
    public void validate(FacesContext Context, UIComponent component, Object value) throws ValidatorException {
        if (value.toString().length()<4) {

            ResourceBundle rb = ResourceBundle.getBundle("ua.javabegin.nls.messages");

            FacesMessage msg = new FacesMessage(rb.getString("login_length_error"));
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
