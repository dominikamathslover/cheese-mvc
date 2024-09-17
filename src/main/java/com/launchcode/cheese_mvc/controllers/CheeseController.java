package com.launchcode.cheese_mvc.controllers;

import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping("cheese")
public class CheeseController {

    @RequestMapping(value = "")
    public String index(Model model) {

        ArrayList<String> cheeseNames= new ArrayList<String>();
        cheeseNames.add("cheddar");
        cheeseNames.add("gouda");
        cheeseNames.add("parmesan");
        cheeseNames.add("mozzarella");
        cheeseNames.add("camembert");

        model.addAttribute("cheeseNames", cheeseNames);
        model.addAttribute("title","My cheese");
        return "cheese/index";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model){
        model.addAttribute("title","Add Cheese");
        return "cheese/add";
    }

    @RequestMapping(value="add", method =RequestMethod.POST)
    public String processAddCheeseForm(HttpServletRequest request){
        String cheeseName = request.getParameter("cheeseName");

    }


}
