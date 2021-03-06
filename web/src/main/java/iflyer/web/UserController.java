/*
 * Copyright (c) 2017. Rio Hwang Products. All rights reserved.
 */

package iflyer.web;

//import iflyer.model.User;
//import iflyer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
class UserController {

    //@Autowired
  //  UserService userService;

    //@Autowired
    JdbcTemplate xxx;

    @RequestMapping(value = "{name}/user",method = RequestMethod.GET)
    public ModelAndView getUserInfo(@PathVariable(name="name") String name,
                                    ModelMap modelMap) {
    //    User user= userService.getUser(name);
      //  modelMap.put("user", user);
        return new ModelAndView("user", modelMap);
    }


    @RequestMapping(value = "/save/{name}/{age}",method = RequestMethod.GET)
    public ModelAndView saveUserInfo(@PathVariable(name = "name")String name,
                                     @PathVariable(name = "age")int age,
                                     ModelMap modelMap){
        //User user= userService.saveUser(name, age);
        //modelMap.put("user", user);
        return new ModelAndView("user", modelMap);
    }
}