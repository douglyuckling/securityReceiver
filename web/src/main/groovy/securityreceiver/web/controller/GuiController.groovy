package securityreceiver.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import static org.springframework.web.bind.annotation.RequestMethod.GET

@Controller
@RequestMapping('/')
class GuiController {

    @RequestMapping(value = ['', '/'], method = GET)
    ModelAndView getIndex() {
        ModelAndView model = new ModelAndView('index')
        return model
    }

}
