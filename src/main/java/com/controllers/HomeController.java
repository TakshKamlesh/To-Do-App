package com.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.data.TodoDau;
import com.entities.Todo;

@Controller
public class HomeController {
	
	
	@Autowired
	TodoDau todoDau;
	
	@RequestMapping("/home")
	public String homePage(Model model) {
		
		String str = "home";
		List<Todo> list = this.todoDau.getAll();
		model.addAttribute("page", str);
		model.addAttribute("todos", list);
		return "home";
	}
	
	@RequestMapping("/add")
	public String addTodo(Model model) {
		
		String str = "add";
		Todo todo = new Todo();
		model.addAttribute("todo", todo);
		model.addAttribute("page", str);
		
		return "home";
	}
	
	@RequestMapping(value = "/saveTodo", method = RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo t,  Model model) {
		
		System.out.println(t);
		t.setDate(new Date());
		
		this.todoDau.save(t);
		
		model.addAttribute("msg", "successfull added ..");
		return "home";
	}

}
