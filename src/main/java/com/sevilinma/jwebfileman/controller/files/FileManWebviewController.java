package com.sevilinma.jwebfileman.controller.files;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@ComponentScan
public class FileManWebviewController {
    @RequestMapping({"/","/index.htm","/main.htm"})
    public String view(){
        return "fileman";
    }
}
