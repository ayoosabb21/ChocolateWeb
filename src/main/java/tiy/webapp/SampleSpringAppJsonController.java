package tiy.webapp;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Created by willi on 6/3/2016.


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

//@Autowired
//UserRepository users;

@RestController
public class SampleSpringAppJsonController {
   @RequestMapping(path = "/cocoa.json", method = RequestMethod.GET)
    public ChocolateFactory jsonHome(int bigs , int smalls , int goal) {
        ChocolateSolver pudding = new ChocolateSolver();
       ChocolateFactory b = pudding.makeChocolate( smalls, bigs, goal);

       return b;
    }

    @RequestMapping(path = "/addChocolateInput.json", method = RequestMethod.POST)
        public ChocolateFactory jsonHome2(HttpSession session, @RequestBody ChocolateInput input)  {
           System.out.println("testing input.." + input.smalls);
           System.out.println("testing input.." + input.bigs);
           System.out.println("testing input.." + input.goal);
            ChocolateSolver pudding = new ChocolateSolver();
            ChocolateFactory b = pudding.makeChocolate( input.smalls, input.bigs, input.goal);


            return b;
    }
}