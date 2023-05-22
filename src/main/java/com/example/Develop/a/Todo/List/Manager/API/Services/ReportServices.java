package com.example.Develop.a.Todo.List.Manager.API.Services;

import com.example.Develop.a.Todo.List.Manager.API.Models.Todo;
import com.example.Develop.a.Todo.List.Manager.API.Repositories.TodoRepositories;
import com.example.Develop.a.Todo.List.Manager.API.Repositories.UserRegistrationRepositories;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportServices {

    @Autowired
    TodoRepositories todoRepositories;
//    @Autowired
//    UserRegistrationRepositories userRegistrationRepositories;

    public static final String pathToReports = "C:C:\\Users\\User006\\Downloads\\NewReport";

    public String todoReport() throws FileNotFoundException, JRException {
        List<Todo> todoList = todoRepositories.getAllTodo();
        File file = ResourceUtils.getFile("classpath:Todo.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(todoList);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "Isra");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramters, dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports + "\\Todo.pdf");
        return "Report generated : " + pathToReports + "\\Todo.pdf";
    }



}
