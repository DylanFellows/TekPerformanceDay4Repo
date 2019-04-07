package com.fellows.day4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fellows.day4.service.EmployeeService;

@Controller
@RequestMapping("/employee-module")
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;
 
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model)
    {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employeesListDisplay";
    }
}
