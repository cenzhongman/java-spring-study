package com.cenzhongman.spring.p04JDBCTemplate;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JDBCController {

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User object){
        IUserDAO iUserDAO = new IUserDAOImpl();
        System.out.println(new Gson().toJson(object));
        iUserDAO.add(object);
        System.out.println(object);
        return "123";
    }
}
