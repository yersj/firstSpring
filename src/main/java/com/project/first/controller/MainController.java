package com.project.first.controller;

import com.project.first.service.DBManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
@GetMapping
public String getAllItems(Model model){
model.addAttribute("Items", DBManager.getItems());
return "index";
}
}
