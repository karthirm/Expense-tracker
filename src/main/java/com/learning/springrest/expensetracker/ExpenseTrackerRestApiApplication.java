package com.learning.springrest.expensetracker;

import com.learning.springrest.expensetracker.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class ExpenseTrackerRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerRestApiApplication.class, args);
    }

}

