package tiy.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by willi on 6/3/2016.
 */
@Controller
public class CocoaAppController {

//    @Autowired
//    UserRepository users;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String factory(Model mocdel) {
        return "cocoa";
    }
}
