package faktury.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: slavo
 * Date: 15.05.11
 * Time: 09:36
 */
@Controller
public class FakturyController {
    @RequestMapping("/faktury")
    public ModelAndView helloWorld() {

        String message = "Lista faktur: ";
        return new ModelAndView("faktury", "message", message);
    }
}
