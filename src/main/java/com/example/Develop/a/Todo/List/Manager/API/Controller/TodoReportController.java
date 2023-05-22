package com.example.Develop.a.Todo.List.Manager.API.Controller;

import com.example.Develop.a.Todo.List.Manager.API.Services.ReportServices;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
@RestController
@RequestMapping(value = "/report")

public class TodoReportController {
    @Autowired
    ReportServices reportServices;
    @RequestMapping(value = "/todoReport", method = RequestMethod.GET)
        public String todoReport() throws JRException, FileNotFoundException {
            return reportServices.todoReport();
        }


    }


