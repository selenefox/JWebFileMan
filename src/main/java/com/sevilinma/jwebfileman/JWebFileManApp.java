package com.sevilinma.jwebfileman;

import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.sevilinma.jwebfileman.controller"})
@SpringBootApplication
public class JWebFileManApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("d","directory",true, "Add Local File System");
        options.addOption("p","port",true, "Web app port.");
        options.addOption("h","help",false,"show this help message and exit program");

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine result = null;

        try {
            result = parser.parse(options, args);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            formatter.printHelp("java -jar JWebFileMan.war", options, true);
            System.exit(1);
        }
        if (result.hasOption("p")){
            System.getProperties().put( "server.port", result.getOptionValue("p"));
        }
        if (result.hasOption("h")) {
            formatter.printHelp("java -jar JWebFileMan.war", options, true);
            System.exit(0);
        }

        if (!result.hasOption("d")){
            formatter.printHelp("java -jar JWebFileMan.war", options, true);
            System.exit(0);
        }

        Logger logger = LoggerFactory.getLogger(JWebFileManApp.class);
        SpringApplication.run(JWebFileManApp.class, args);
        logger.info("********STARTING SUCCESS********");
    }
}
