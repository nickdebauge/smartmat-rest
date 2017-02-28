package main.java.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nickd on 1/19/2017.
 */

//jdk 1.7.0_60-b19

@Controller
public class matRestController
{
    public String theString = "test";
    

    @RequestMapping("/accessData")
    public @ResponseBody matDataFormat accessData(@RequestParam(value="name", defaultValue="World") String name) {
        return new matDataFormat();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.GET, produces="application/json", value = "/getData")
    public @ResponseBody String getData(@RequestParam(value = "message", defaultValue = "false")String message) throws Exception
    {
        return theString;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.GET, produces="application/json", value = "/setData")
    public @ResponseBody String changeData(@RequestParam(value = "message", defaultValue = "false")String message) throws Exception
    {
        theString = message;
        return "message changed to: " + message;
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.POST, produces="application/json", value = "/setTest")
    public @ResponseBody String setTest(@RequestParam(value = "preSend", defaultValue = "false")String preSend) throws Exception
    {
        theString = preSend;
        return theString;
    }
}
