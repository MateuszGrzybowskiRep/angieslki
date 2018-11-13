package andrzej.dupa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TemplateController {

    @RequestMapping(path="/", method=RequestMethod.GET)
    public String goHome(){
        return "index";
    }
    @RequestMapping(path="/start", method=RequestMethod.GET)
    public String startPage(){
        return "start";
    }
    @RequestMapping(path="/add", method=RequestMethod.GET)
    public String getEmployeeFormView(){
        return "employeeForm";
    }

    @RequestMapping(path="/record", method=RequestMethod.GET)
    public String getRecoringScreen(){
        return "record";
    }

}