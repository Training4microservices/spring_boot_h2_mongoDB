package com.training.springboot.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class HelperUtil {

    private HelperUtil() {
    }


    public static Supplier<List<Employee>> employeeSupplier = () ->
            Arrays.asList(
		            Employee.builder().id(1).name("Binay").salary(3000d).build(),
					Employee.builder().id(2).name("Minay").salary(5000d).build(),
					Employee.builder().id(3).name("Rajesh").salary(5000d).build(),
					Employee.builder().id(4).name("Sohan").salary(6000d).build(),
					Employee.builder().id(5).name("Sukesh").salary(7000d).build(),
					Employee.builder().id(6).name("Mukesh").salary(9000d).build()
            );




}