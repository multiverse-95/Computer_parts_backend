/*
 * Copyright (c) 2022.
 * This code was originally developed 03.07.2022, 20:31 by Valkov V.V.
 */

package com.multiverse.computer_parts;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ComputerPartsApplication.class);
    }

}
